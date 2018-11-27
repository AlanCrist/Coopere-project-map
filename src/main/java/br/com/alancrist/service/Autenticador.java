package br.com.alancrist.service;

import br.com.alancrist.model.Usuario;

public interface Autenticador {

	public Usuario autentica(String nome);

}
