package com.igor.curso.cursomc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.igor.curso.cursomc.domain.Endereco;
//Objeto capaz de acessar dados;CategoriaRepository.java
@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

}
