package com.morais.cezar.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.morais.cezar.domain.orm.Pessoa;

@RepositoryRestResource(collectionResourceRel = "pessoas" , path = "pessoas")
public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
