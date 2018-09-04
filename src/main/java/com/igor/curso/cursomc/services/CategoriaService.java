package com.igor.curso.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.igor.curso.cursomc.domain.Categoria;
import com.igor.curso.cursomc.repository.CategoriaRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class CategoriaService {
	//injeta a dependencia
	@Autowired
	private CategoriaRepository repo;
	
	
	public Categoria buscar(Integer id) throws ObjectNotFoundException {
		Optional<Categoria> categoria = repo.findById(id);
	
		return categoria.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
			 
	}
	
	public Categoria insert(Categoria cat) {
		cat.setId(null); //Caso o id vem preenchido o save faz um update 
		return repo.save(cat);
	}

}
