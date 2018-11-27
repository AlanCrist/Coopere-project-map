package br.com.alancrist.model;

import org.hibernate.annotations.Entity;

@Entity
public class Fies extends ResponsabilidadeSocial {

	private double quantidadeParcelas;

	public double getQuantidadeParcelas() {
		return quantidadeParcelas;
	}

	public void setQuantidadeParcelas(double quantidadeParcelas) {
		this.quantidadeParcelas = quantidadeParcelas;
	}

	public Fies(Long id, String nome, String nomeCurso, String cargaHoraria, double matriculaEnem,
			double quantidadeParcelas) {
		super(id, nome, nomeCurso, cargaHoraria, matriculaEnem);
		this.quantidadeParcelas = quantidadeParcelas;
	}
}
