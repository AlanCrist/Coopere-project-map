package br.com.alancrist.model;

import org.hibernate.annotations.Entity;

@Entity
public class Monitoria extends Documento {
	private String nomeDisciplina;
	private Aluno monitor;
	private Professor professor;

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public Aluno getMonitor() {
		return monitor;
	}

	public void setMonitor(Aluno monitor) {
		this.monitor = monitor;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Monitoria(Long id, String nome, String nomeCurso, String cargaHoraria, String nomeDisciplina, Aluno monitor,
			Professor professor) {
		super(id, nome, nomeCurso, cargaHoraria);
		this.nomeDisciplina = nomeDisciplina;
		this.monitor = monitor;
		this.professor = professor;
	}

}
