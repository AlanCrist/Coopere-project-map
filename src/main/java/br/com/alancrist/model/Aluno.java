package br.com.alancrist.model;

import org.hibernate.annotations.Entity;

@Entity
public class Aluno extends Usuario {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String curso;

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Aluno(Long id, String nome, String matricula, String curso) {
		super(id, nome, matricula);
		this.curso = curso;
	}

}
