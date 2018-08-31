package com.igor.curso.cursomc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.igor.curso.cursomc.domain.ItemPedido;
//Objeto capaz de acessar dados;CategoriaRepository.java
@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer> {

}
