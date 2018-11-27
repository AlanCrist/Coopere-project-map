package br.com.alancrist.model;

import org.hibernate.annotations.Entity;

@Entity
public class Coordenador extends Usuario {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String area;

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Coordenador(Long id, String nome, String matricula, String area) {
		super(id, nome, matricula);
		this.area = area;
	}

}
