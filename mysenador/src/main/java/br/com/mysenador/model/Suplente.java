package br.com.mysenador.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name= "suplente")
public class Suplente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	protected Long id;
	protected String DescricaoParticipacao;
	protected Integer CodigoParlamentar;
	protected String NomeParlamentar;
	
	public Suplente() {
		
	}
	public Suplente(String descricaoParticipacao, Integer codigoParlamentar, String nomeParlamentar) {

		this.DescricaoParticipacao = descricaoParticipacao;
		this.CodigoParlamentar = codigoParlamentar;
		this.NomeParlamentar = nomeParlamentar;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricaoParticipacao() {
		return DescricaoParticipacao;
	}
	public void setDescricaoParticipacao(String descricaoParticipacao) {
		this.DescricaoParticipacao = descricaoParticipacao;
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

}
