package br.com.mysenador.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "primeira_legislatura_do_mandato")
public class PrimeiraLegislaturaDoMandato {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	protected Long id;
	protected Integer NumeroLegislatura;
	protected String DataInicio;
	protected String DataFim;
	
	public PrimeiraLegislaturaDoMandato() {
		
	}
	public PrimeiraLegislaturaDoMandato(Integer numeroLegislatura,String dataInicio,
			String dataFim) {
				this.NumeroLegislatura = numeroLegislatura;
		this.DataInicio = dataInicio;
		this.DataFim = dataFim;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getNumeroLegislatura() {
		return NumeroLegislatura;
	}
	public void setNumeroLegislatura(Integer numeroLegislatura) {
		this.NumeroLegislatura = numeroLegislatura;
	}
	public String getDataInicio() {
		return DataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.DataInicio = dataInicio;
	}
	public String getDataFim() {
		return DataFim;
	}
	public void setDataFim(String dataFim) {
		this.DataFim = dataFim;
	}

}
