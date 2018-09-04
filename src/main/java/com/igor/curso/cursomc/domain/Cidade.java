package com.igor.curso.cursomc.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tbl_cidade")
public class Cidade implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	@Id
	@SequenceGenerator(name="sqc_cidade", sequenceName="sqc_cidade", allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="sqc_cidade")
	private Integer idCidade;
	private String nome;
	
	@ManyToOne
	@JoinColumn(name="id_estado")
	private Estado estado;
	
	public Cidade() {
		
	}

	public Cidade(Integer id, String nome, Estado estado) {
		super();
		this.idCidade = id;
		this.nome = nome;
		this.estado = estado;
	}

	public Integer getIdCidade() {
		return idCidade;
	}

	public void setIdCidade(Integer id) {
		this.idCidade = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idCidade == null) ? 0 : idCidade.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cidade other = (Cidade) obj;
		if (idCidade == null) {
			if (other.idCidade != null)
				return false;
		} else if (!idCidade.equals(other.idCidade))
			return false;
		return true;
	}
	
	
}
