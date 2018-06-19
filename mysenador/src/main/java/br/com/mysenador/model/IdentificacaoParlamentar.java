package br.com.mysenador.model;

import javax.persistence.*;
@Entity

public class IdentificacaoParlamentar {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	protected Long id;
	
	protected Integer CodigoParlamentar;
	
	protected String NomeParlamentar;
	
	protected String NomeCompletoParlamentar;
	
	protected String SexoParlamentar;
	
	protected String FormaTratamento;
	
	protected String UrlFotoParlamentar;
	
	protected String UrlPaginaParlamentar;
	
	protected String EmailParlamentar;
	
	protected String SiglaPartidoParlamentar;
	
	protected String UfParlamentar;
	
	
	public IdentificacaoParlamentar() {
		
	}
	
	
	public IdentificacaoParlamentar(Integer codigoParlamentar, String nomeParlamentar, String nomeCompletoParlamentar,
			String sexoParlamentar, String formaTratamento, String urlFotoParlamentar, String urlPaginaParlamentar,
			String emailParlamentar, String siglaPartidoParlamentar, String ufParlamentar) {
		
		this.CodigoParlamentar = codigoParlamentar;
		this.NomeParlamentar = nomeParlamentar;
		this.NomeCompletoParlamentar = nomeCompletoParlamentar;
		this.SexoParlamentar = sexoParlamentar;
		this.FormaTratamento = formaTratamento;
		this.UrlFotoParlamentar = urlFotoParlamentar;
		this.UrlPaginaParlamentar = urlPaginaParlamentar;
		this.EmailParlamentar = emailParlamentar;
		this.SiglaPartidoParlamentar = siglaPartidoParlamentar;
		this.UfParlamentar = ufParlamentar;
	}
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Integer getCodigoParlamentar() {
		return CodigoParlamentar;
	}
	public void setCodigoParlamentar(Integer codigoParlamentar) {
		this.CodigoParlamentar = codigoParlamentar;
	}
	public String getNomeParlamentar() {
		return NomeParlamentar;
	}
	public void setNomeParlamentar(String nomeParlamentar) {
		this.NomeParlamentar = nomeParlamentar;
	}
	public String getNomeCompletoParlamentar() {
		return NomeCompletoParlamentar;
	}
	public void setNomeCompletoParlamentar(String nomeCompletoParlamentar) {
		this.NomeCompletoParlamentar = nomeCompletoParlamentar;
	}
	public String getSexoParlamentar() {
		return SexoParlamentar;
	}
	public void setSexoParlamentar(String sexoParlamentar) {
		this.SexoParlamentar = sexoParlamentar;
	}
	public String getFormaTratamento() {
		return FormaTratamento;
	}
	public void setFormaTratamento(String formaTratamento) {
		this.FormaTratamento = formaTratamento;
	}
	public String getUrlFotoParlamentar() {
		return UrlFotoParlamentar;
	}
	public void setUrlFotoParlamentar(String urlFotoParlamentar) {
		this.UrlFotoParlamentar = urlFotoParlamentar;
	}
	public String getUrlPaginaParlamentar() {
		return UrlPaginaParlamentar;
	}
	public void setUrlPaginaParlamentar(String urlPaginaParlamentar) {
		this.UrlPaginaParlamentar = urlPaginaParlamentar;
	}
	public String getEmailParlamentar() {
		return EmailParlamentar;
	}
	public void setEmailParlamentar(String emailParlamentar) {
		this.EmailParlamentar = emailParlamentar;
	}
	public String getSiglaPartidoParlamentar() {
		return SiglaPartidoParlamentar;
	}
	public void setSiglaPartidoParlamentar(String siglaPartidoParlamentar) {
		this.SiglaPartidoParlamentar = siglaPartidoParlamentar;
	}
	public String getUfParlamentar() {
		return UfParlamentar;
	}
	public void setUfParlamentar(String ufParlamentar) {
		this.UfParlamentar = ufParlamentar;
	}

}
