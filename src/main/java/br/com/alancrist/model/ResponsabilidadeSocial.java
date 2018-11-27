package br.com.alancrist.model;

import org.hibernate.annotations.Entity;

@Entity
public class ResponsabilidadeSocial extends Documento {
	private double matriculaEnem;

	public double getMatriculaEnem() {
		return matriculaEnem;
	}

	public void setMatriculaEnem(double matriculaEnem) {
		this.matriculaEnem = matriculaEnem;
	}

	public ResponsabilidadeSocial(Long id, String nome, String nomeCurso, String cargaHoraria, double matriculaEnem) {
		super(id, nome, nomeCurso, cargaHoraria);
		this.matriculaEnem = matriculaEnem;
	}

}
