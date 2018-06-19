package br.com.mysenador.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class Mandato {
	
	@Id
	protected Integer CodigoMandato;
	@Column
	protected String UfParlamentar;
	@OneToOne
	protected PrimeiraLegislaturaDoMandato PrimeiraLegislaturaDoMandato;
	@OneToOne
	protected SegundaLegislaturaDoMandato SegundaLegislaturaDoMandato;
	@Column
	protected String UrlPaginaNoMandato;
	@Column
	protected String DescricaoParticipacao;
	@OneToMany
	protected List<Suplente>Suplentes = new ArrayList<Suplente>();	
	@OneToMany
	protected List<Exercicio>Exercicios = new ArrayList<Exercicio>();
	@OneToOne
	protected Titular Titular;
	
	
	
	public Mandato() {
		
	}
	
	public Mandato(Integer codigoMandato, String ufParlamentar,
			PrimeiraLegislaturaDoMandato primeiraLegislaturaDoMandato,
			SegundaLegislaturaDoMandato segundaLegislaturaDoMandato, String urlPaginaNoMandato,
			String descricaoParticipacao, Titular titular) {
		
		CodigoMandato = codigoMandato;
		UfParlamentar = ufParlamentar;
		PrimeiraLegislaturaDoMandato = primeiraLegislaturaDoMandato;
		SegundaLegislaturaDoMandato = segundaLegislaturaDoMandato;
		UrlPaginaNoMandato = urlPaginaNoMandato;
		DescricaoParticipacao = descricaoParticipacao;
		Titular = titular;
	}
	public Integer getCodigoMandato() {
		return CodigoMandato;
	}
	public void setCodigoMandato(Integer codigoMandato) {
		this.CodigoMandato = codigoMandato;
	}
	public String getUfParlamentar() {
		return UfParlamentar;
	}
	public void setUfParlamentar(String ufParlamentar) {
		this.UfParlamentar = ufParlamentar;
	}
	public PrimeiraLegislaturaDoMandato getPrimeiraLegislaturaDoMandato() {
		return PrimeiraLegislaturaDoMandato;
	}
	public void setPrimeiraLegislaturaDoMandato(PrimeiraLegislaturaDoMandato primeiraLegislaturaDoMandato) {
		this.PrimeiraLegislaturaDoMandato = primeiraLegislaturaDoMandato;
	}
	public SegundaLegislaturaDoMandato getSegundaLegislaturaDoMandato() {
		return SegundaLegislaturaDoMandato;
	}
	public void setSegundaLegislaturaDoMandato(SegundaLegislaturaDoMandato segundaLegislaturaDoMandato) {
		this.SegundaLegislaturaDoMandato = segundaLegislaturaDoMandato;
	}
	public String getUrlPaginaNoMandato() {
		return UrlPaginaNoMandato;
	}
	public void setUrlPaginaNoMandato(String urlPaginaNoMandato) {
		this.UrlPaginaNoMandato = urlPaginaNoMandato;
	}
	public String getDescricaoParticipacao() {
		return DescricaoParticipacao;
	}
	public void setDescricaoParticipacao(String descricaoParticipacao) {
		this.DescricaoParticipacao = descricaoParticipacao;
	}
	public List<Suplente> getSuplentes() {
		return Suplentes;
	}
	public void setSuplentes(List<Suplente> suplentes) {
		Suplentes = suplentes;
	}
	public List<Exercicio> getExercicios() {
		return Exercicios;
	}
	public void setExercicios(List<Exercicio> exercicios) {
		Exercicios = exercicios;
	}

	public Titular getTitular() {
		return Titular;
	}

	public void setTitular(Titular titular) {
		Titular = titular;
	}
	

}
