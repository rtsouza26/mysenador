package br.com.mysenador.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "exercicio")
public class Exercicio {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	protected Long id;
	protected Integer CodigoExercicio;
	protected String DataInicio;
	protected String DataFim;
	protected String SiglaCausaAfastamento;
	protected String DescricaoCausaAfastamento;
	protected String DataLeitura;
	
	public Exercicio() {
		
	}
	
	public Exercicio(Integer codigoExercicio,String dataInicio, String dataFim,
			String siglaCausaAfastamento, String descricaoCausaAfastamento, String dataLeitura) {
		
		this.CodigoExercicio = codigoExercicio;
		this.DataInicio = dataInicio;
		this.DataFim = dataFim;
		this.SiglaCausaAfastamento = siglaCausaAfastamento;
		this.DescricaoCausaAfastamento = descricaoCausaAfastamento;
		this.DataLeitura = dataLeitura;
	}
	public Integer getCodigoExercicio() {
		return CodigoExercicio;
	}
	public void setCodigoExercicio(Integer codigoExercicio) {
		this.CodigoExercicio = codigoExercicio;
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
	public String getSiglaCausaAfastamento() {
		return SiglaCausaAfastamento;
	}
	public void setSiglaCausaAfastamento(String siglaCausaAfastamento) {
		this.SiglaCausaAfastamento = siglaCausaAfastamento;
	}
	public String getDescricaoCausaAfastamento() {
		return DescricaoCausaAfastamento;
	}
	public void setDescricaoCausaAfastamento(String descricaoCausaAfastamento) {
		this.DescricaoCausaAfastamento = descricaoCausaAfastamento;
	}
	public String getDataLeitura() {
		return DataLeitura;
	}
	public void setDataLeitura(String dataLeitura) {
		this.DataLeitura = dataLeitura;
	}

}
