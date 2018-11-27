package br.com.alancrist.model;

public class Prouni extends ResponsabilidadeSocial {
	private float porcentagemBolsa;

	public float getPorcentagemBolsa() {
		return porcentagemBolsa;
	}

	public void setPorcentagemBolsa(float porcentagemBolsa) {
		this.porcentagemBolsa = porcentagemBolsa;
	}

	public Prouni(Long id, String nome, String nomeCurso, String cargaHoraria, double matriculaEnem,
			float porcentagemBolsa) {
		super(id, nome, nomeCurso, cargaHoraria, matriculaEnem);
		this.porcentagemBolsa = porcentagemBolsa;
	}

}
