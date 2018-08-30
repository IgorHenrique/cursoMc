package com.igor.curso.cursomc.domain.enums;

public enum TipoCliente {

	PESSOAFISICA(1, "Pessoa físcia"), 
	PESSOAJURIDICA(2, "Pessoa jurídica");
	
	private Integer codigo;
	private String descricao;
	
	private TipoCliente(int cod, String descricao){
		this.codigo = cod;
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static TipoCliente toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}
		
		for(TipoCliente t : TipoCliente.values()) {
			if(cod.equals(t.getCodigo())) {
				return t;
			}
		}
		
		throw new IllegalArgumentException("Id inválido " +cod);
	}
}
