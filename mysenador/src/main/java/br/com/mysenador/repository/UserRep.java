package br.com.mysenador.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.mysenador.model.User;

public interface UserRep extends CrudRepository<User, Long> {

}
