package edu.ifam.dra.chat.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ifam.dra.chat.model.Contato;
import edu.ifam.dra.chat.repositories.ContatoRepository;

@Service
public class ContatoService {
	
	
	List<Contato> contatos = new ArrayList<>();
	
	@Autowired
	ContatoRepository contatoRepository;//For crud heh hehehheheh h
	
	public List<Contato> getContatos() {
		return contatoRepository.findAll();//retorna a lista de contatos
	}
	
	public Contato getContato(long id) {
		Optional<Contato> optionalContato = contatoRepository.findById(null);
		if(optionalContato.isPresent())
		return optionalContato.get();
		return new Contato();
	}
	
	public Contato setContato(Contato contato) {
		return contatoRepository.save(contato);
	
	}
	
	public Contato setContato(long id, Contato contato) {
		Optional<Contato> optionalContato = contatoRepository.findById(id);
		if(optionalContato.isPresent()) {
		contato.setId(id);
		 return contatoRepository.save(contato);
		
	}
		return new Contato();
	}
	
	public void deleteContato(long id) {
		Optional<Contato> optionalContato = contatoRepository.findById(id);
		if(optionalContato.isPresent())
		 contatoRepository.deleteById(id);
	}
}
