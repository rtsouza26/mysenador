package br.com.mysenador.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.mysenador.model.*;
import br.com.mysenador.util.*;
import br.com.mysenador.extractor.*;
import br.com.mysenador.repository.*;

@RestController
public class SenadoController {

	List<IdentificacaoParlamentar>identificacao = new ArrayList<IdentificacaoParlamentar>();
	List<Mandato>mandato = new ArrayList<Mandato>();
	List<Titular>titular = new ArrayList<Titular>();
	List<Parlamentar>parlamentar1 = new ArrayList<Parlamentar>();
	String url ="http://legis.senado.leg.br/dadosabertos/senador/lista/atual";
	HtmlRequest requesturl = new HtmlRequest();
	XmlApi xmlapi = new XmlApi();

	Senado senado ;
	@Autowired
	IdentificacaoParlamentarRep idsalva;
	@Autowired
	TitularRep titularrep;
	@Autowired
	UserRep userrep;
	
	
	IdentificacaoParlamentar id;

	@CrossOrigin(origins = {"http://localhost:8100","http://localhost:8080"})
	@RequestMapping("/")
	public ModelAndView index(){
		
		ModelAndView model = new ModelAndView("/index");
		String xml = requesturl.toString(url);
		senado = xmlapi.converte(xml);
		parlamentar1.clear();
		for(int i = 0;i<81;i++){
			parlamentar1.add(senado.getParlamentares().get(i));
		}
		//identificacao=null;
		//identificacao =  (List<IdentificacaoParlamentar>) idsalva.findAll();
		
		
		 model.addObject("Parl",parlamentar1);
	
		return model;
		
	
	}
	
	@CrossOrigin(origins = {"http://localhost:8100","http://localhost:8080"})
	@RequestMapping("/api/senators/all")
	public String indexapi(Model model){
		ObjectMapper mapper = new ObjectMapper();
		Map<String, Object> map = new HashMap<>();
		
		try {
			String xml = requesturl.toString(url);
			senado = xmlapi.converte(xml);
			String desconverte = xmlapi.desconvertejson(senado);
			
			model.addAttribute("descon",desconverte);
			map.put("senators", senado);
			return mapper.writeValueAsString(map);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		
	}
	/*@GetMapping(path="/all")
	public @ResponseBody Iterable<IdentificacaoParlamentar> getAllid() {
		// This returns a JSON or XML with the users
		return idsalva.findAll();
	}
	
	@RequestMapping("/salva")
	public String addNewUser (){
		
		String xml = "";
		String url ="http://legis.senado.leg.br/dadosabertos/senador/lista/atual";
		xml = requesturl.toString(url);
		senado = xmlapi.converte(xml);
		for(int i = 0;i<81;i++){
			identificacao.add(senado.getParlamentares().get(i).getIdentificacaoParlamentar());
			idsalva.save(identificacao.get(i));
		}
		
		return "index1";
	}
	@RequestMapping("/titular/salva")
	public String addSuplenteall(){
		String xml = "";
		String url ="http://legis.senado.leg.br/dadosabertos/senador/lista/atual";
		xml = requesturl.toString(url);
		senado = xmlapi.converte(xml);
		
		for(int i = 0;i<81;i++){
			titular.add(senado.getParlamentares().get(i).getMandato().getTitular());
			titularrep.save(titular.get(i));
		}
		return null;
		
	}
	
	@GetMapping(path="/add") // Map ONLY GET Requests
	public @ResponseBody String addNewUser (@RequestParam String name
			, @RequestParam String email) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request
		
		User n = new User();
		n.setName(name);
		n.setEmail(email);
		userrep.save(n);
		return "Saved";
	}
	
	@GetMapping(path="/user/all")
	public @ResponseBody Iterable<User> getAllUsers() {
		// This returns a JSON or XML with the users
		return userrep.findAll();
	}*/
}
