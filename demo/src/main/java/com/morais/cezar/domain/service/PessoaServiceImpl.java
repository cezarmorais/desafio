package com.morais.cezar.domain.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.morais.cezar.domain.orm.Pessoa;
import com.morais.cezar.domain.repository.PessoaRepository;

@Component
public class PessoaServiceImpl implements PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;

	
	public Pessoa save(Pessoa pessoa)  {
		

		
			return this.pessoaRepository.save(pessoa);


	}

	public Optional<Pessoa> getById(Integer id) {
		

		return this.pessoaRepository.findById(id);

	}

	public void delete(Integer id) {
		

		this.pessoaRepository.deleteById(id);

	}

	

}
