package br.com.mysenador.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import br.com.mysenador.model.IdentificacaoParlamentar;
@Transactional
public interface SuplenteRep extends CrudRepository<IdentificacaoParlamentar, Long>{

}
