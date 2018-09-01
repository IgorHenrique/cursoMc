package com.igor.curso.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.igor.curso.cursomc.domain.Pedido;
import com.igor.curso.cursomc.repository.PedidoRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class PedidoService {
	//injeta a dependencia
	@Autowired
	private PedidoRepository repo;
	
	
	public Pedido buscar(Integer id) throws ObjectNotFoundException {
		Optional<Pedido> pedido = repo.findById(id);
	
		return pedido.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
			 
	}
}
