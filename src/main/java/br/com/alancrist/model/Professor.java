package br.com.alancrist.model;

import org.hibernate.annotations.Entity;

@Entity
public class Professor extends Usuario {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String disciplinaNome;

	public String getDisciplinaNome() {
		return disciplinaNome;
	}

	public void setDisciplinaNome(String disciplinaNome) {
		this.disciplinaNome = disciplinaNome;
	}

	public Professor(Long id, String nome, String matricula, String disciplinaNome) {
		super(id, nome, matricula);
		this.disciplinaNome = disciplinaNome;
	}

}
