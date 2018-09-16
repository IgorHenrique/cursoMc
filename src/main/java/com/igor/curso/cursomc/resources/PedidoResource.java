package com.igor.curso.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.igor.curso.cursomc.domain.Pedido;
import com.igor.curso.cursomc.services.PedidoService;

import javassist.tools.rmi.ObjectNotFoundException;

@RestController
@RequestMapping(value="/pedidos")
public class PedidoResource {
	
	@Autowired
	private PedidoService service;
	
	@GetMapping("/{id}")
	//ResponseEntity contem varias informações http
	public ResponseEntity<Pedido> find(@PathVariable Integer id) throws ObjectNotFoundException {
		Pedido obj = service.buscar(id);
		return ResponseEntity.ok(obj);
	}
}
