package br.com.alancrist.model;

import org.hibernate.annotations.Entity;

@Entity
public class Pesquisa extends Documento {
	private String tipo;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Pesquisa(Long id, String nome, String nomeCurso, String cargaHoraria, String tipo) {
		super(id, nome, nomeCurso, cargaHoraria);
		this.tipo = tipo;
	}
	
	
}
