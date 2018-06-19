package br.com.mysenador.extractor;

import java.io.Writer;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;
import com.thoughtworks.xstream.io.json.JsonWriter;
import com.thoughtworks.xstream.security.AnyTypePermission;

import br.com.mysenador.model.Exercicio;
import br.com.mysenador.model.IdentificacaoParlamentar;
import br.com.mysenador.model.Mandato;
import br.com.mysenador.model.Parlamentar;
import br.com.mysenador.model.PrimeiraLegislaturaDoMandato;
import br.com.mysenador.model.SegundaLegislaturaDoMandato;
import br.com.mysenador.model.Senado;
import br.com.mysenador.model.Suplente;
import br.com.mysenador.model.Titular;

public class XmlApi {
	
	public Senado converte(String xml) {
		
		
			XStream arquivo = new XStream();
			XStream.setupDefaultSecurity(arquivo);
			arquivo.addPermission(AnyTypePermission.ANY);
			arquivo.autodetectAnnotations(true);
			arquivo.alias("ListaParlamentarEmExercicio",Senado.class);
			arquivo.alias("Parlamentar", Parlamentar.class);
			arquivo.alias("IdentificacaoParlamentar", IdentificacaoParlamentar.class);
			arquivo.alias("Titular", Titular.class);
			arquivo.alias("Mandato", Mandato.class);
			arquivo.alias("PrimeiraLegislaturaDoMandato", PrimeiraLegislaturaDoMandato.class);
			arquivo.alias("SegundaLegislaturaDoMandato", SegundaLegislaturaDoMandato.class);
			arquivo.alias("Suplente", Suplente.class);
			arquivo.alias("Exercicio",Exercicio.class);
		
		 
			System.out.println("Conversão realizada com sucesso");
			return (Senado)arquivo.fromXML(xml);
		}


	public String desconverte(Senado senado){
	
	
		XStream arquivo = new XStream();
		XStream.setupDefaultSecurity(arquivo);
		arquivo.autodetectAnnotations(true);
		return arquivo.toXML(senado) ;
	
	}
	
	public String desconvertejson(Senado senado){
		
		 XStream arquivo = new XStream(new JettisonMappedXmlDriver() {
	     public HierarchicalStreamWriter createWriter(Writer writer) {
	           return new JsonWriter(writer, JsonWriter.DROP_ROOT_MODE);
	            }
	        });
		 arquivo.autodetectAnnotations(true);
       return arquivo.toXML(senado) ;
	}

}
