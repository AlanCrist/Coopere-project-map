package br.com.alancrist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alancrist.dao.UsuarioDao;
import br.com.alancrist.model.Usuario;

@Service("autenticador")
public class AutenticadorImpl implements Autenticador {

	private UsuarioDao usuarioDao;
	
	@Autowired
	public AutenticadorImpl(UsuarioDao usuarioDao) {
		this.usuarioDao = usuarioDao;
	}

	@Override
	public Usuario autentica(String nome) {
		Usuario usuario = usuarioDao.buscaPor(nome);
		return usuario;
	}

}



