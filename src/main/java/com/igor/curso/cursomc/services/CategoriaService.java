package com.igor.curso.cursomc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.igor.curso.cursomc.domain.Categoria;
import com.igor.curso.cursomc.repository.CategoriaRepository;
import com.igor.curso.cursomc.services.exceptions.DataIntegrityException;

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
	
	public List<Categoria> findAll(){
		return repo.findAll();
	}
	
	public Categoria insert(Categoria cat) {
		cat.setId(null); //Caso o id vem preenchido o save faz um update 
		return repo.save(cat);
	}
	
	public Categoria update(Categoria cat) throws ObjectNotFoundException {
		buscar(cat.getId());
		return repo.save(cat);
	}
	
	public void delete(Integer id) throws ObjectNotFoundException {
		try {
		buscar(id);
		repo.deleteById(id);
		}
		catch(DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não pode excluir, pois existem registros associados a este.");
		}
	}

}
