package com.igor.curso.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.igor.curso.cursomc.domain.Cliente;
import com.igor.curso.cursomc.repository.ClienteRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class ClienteService {
	//injeta a dependencia
	@Autowired
	private ClienteRepository repo;
	
	
	public Cliente buscar(Integer id) throws ObjectNotFoundException {
		Optional<Cliente> cliente = repo.findById(id);
	
		return cliente.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
			 
	}
}
