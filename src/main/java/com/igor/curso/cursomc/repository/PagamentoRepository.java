package com.igor.curso.cursomc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.igor.curso.cursomc.domain.Pagamento;
//Objeto capaz de acessar dados;CategoriaRepository.java
@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

}
