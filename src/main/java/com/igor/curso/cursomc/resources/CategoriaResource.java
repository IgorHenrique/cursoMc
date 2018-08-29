package com.igor.curso.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.igor.curso.cursomc.domain.Categoria;
import com.igor.curso.cursomc.services.CategoriaService;

import javassist.tools.rmi.ObjectNotFoundException;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@Autowired
	private CategoriaService service;
	
	@GetMapping("/{id}")
	//ResponseEntity contem varias informações http
	public ResponseEntity<?> find(@PathVariable Integer id) throws ObjectNotFoundException {
		Categoria obj = service.buscar(id);
		return ResponseEntity.ok(obj);
	}
}