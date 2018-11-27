package br.com.alancrist.dao;

import java.util.List;

import br.com.alancrist.model.Usuario;

public interface UsuarioDao {

	public List<Usuario> listaTudo();

	public void salva(Usuario usuario);

	public void atualiza(Usuario usuario);

	public void remove(Usuario usuario);

	public Usuario buscaPor(String nome);

	public Usuario carrega(Long id);
	
}
