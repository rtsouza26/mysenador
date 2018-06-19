package br.com.mysenador.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import br.com.mysenador.model.Titular;
@Transactional
public interface TitularRep extends CrudRepository<Titular, Long> {

}
