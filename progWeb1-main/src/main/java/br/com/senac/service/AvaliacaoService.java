package br.com.senac.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.senac.entity.Avaliacao;
import br.com.senac.repository.AvaliacaoRepository;

public class AvaliacaoService {

	@Autowired
	AvaliacaoRepository repo;
	
	public Avaliacao save (Avaliacao avaliacao) {
		return repo.save(avaliacao);
	}
	
	public List<Avaliacao> findAll(){
		return repo.findAll();
	}
}
