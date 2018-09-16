package com.igor.curso.cursomc.dto;

import java.io.Serializable;

import com.igor.curso.cursomc.domain.Categoria;

public class CategoriaDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer codigo;
	private String nome;
	
	public CategoriaDTO() {}
	
	public CategoriaDTO(Categoria categoria) {
		this.codigo = categoria.getId();
		this.nome = categoria.getNome();
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
