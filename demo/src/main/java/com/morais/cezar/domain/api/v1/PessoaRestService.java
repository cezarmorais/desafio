package com.morais.cezar.domain.api.v1;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.morais.cezar.domain.orm.Pessoa;
import com.morais.cezar.domain.service.PessoaServiceImpl;

@RestController
@RequestMapping("v1")
public class PessoaRestService {
	
	@Autowired
	private PessoaServiceImpl pessoaService;
	

	
	@PostMapping(path="/pessoas")
	public Pessoa save(@Valid @RequestBody Pessoa pessoa) {		
					
			
			 this.pessoaService.save(pessoa);
			
			 return pessoa;
		
		
	}
	
	@GetMapping(path = "/pessoas/{id}")
	public Optional<Pessoa> getById(@PathVariable("id") Integer id) {
		
		return this.pessoaService.getById(id);
		
		
		
	}
	
	@DeleteMapping(path="/pessoas/{id}")
	public void delete(@PathVariable("id") Integer id) {
		
		
		this.pessoaService.delete(id);
		
	}
	
	
}
