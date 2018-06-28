package br.com.mysenador.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import br.com.mysenador.model.IdentificacaoParlamentar;

@Component
public interface IdentificacaoParlamentarRep extends CrudRepository<IdentificacaoParlamentar, Long> {

}