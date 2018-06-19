package br.com.mysenador.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class Parlamentar {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected long id;
	@OneToOne
	protected IdentificacaoParlamentar IdentificacaoParlamentar;
	@OneToOne
	protected Mandato Mandato;
	@Column
	protected String UrlGlossario;
	
	
	
	
	public Parlamentar(IdentificacaoParlamentar identificacaoParlamentar, Mandato mandato, String urlGlossario) {
	
		this.IdentificacaoParlamentar = identificacaoParlamentar;
		this.Mandato = mandato;
		this.UrlGlossario = urlGlossario;
	}
	public IdentificacaoParlamentar getIdentificacaoParlamentar() {
		return IdentificacaoParlamentar;
	}
	public void setIdentificacaoParlamentar(IdentificacaoParlamentar identificacaoParlamentar) {
		this.IdentificacaoParlamentar = identificacaoParlamentar;
	}
	public Mandato getMandato() {
		return Mandato;
	}
	public void setMandato(Mandato mandato) {
		this.Mandato = mandato;
	}
	public String getUrlGlossario() {
		return UrlGlossario;
	}
	public void setUrlGlossario(String urlGlossario) {
		this.UrlGlossario = urlGlossario;
	}

}
