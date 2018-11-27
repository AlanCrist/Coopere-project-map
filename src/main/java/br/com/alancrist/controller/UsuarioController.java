package br.com.alancrist.controller;

import java.util.List;

import br.com.alancrist.dao.UsuarioDao;
import br.com.alancrist.model.Usuario;
import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
public class UsuarioController {

	private Result result;
	private UsuarioDao usuarioDao;
	private String nome;
	
	public UsuarioController(Result result, UsuarioDao usuarioDao, String nome) {
		this.result = result;
		this.usuarioDao = usuarioDao;
		this.nome = nome;
	}

	@Get
	@Path("/usuario/novo")
	public void novo(Usuario usuario) {
		result.include("usuario", usuario);
	}

	@Post
	@Path("/usuario")
	public void salvar(Usuario usuario) {
		usuarioDao.salva(usuario);

		result
			.include("usuarioList", usuarioDao.buscaPor(nome))
			.forwardTo("WEB-INF/jsp/usuario/listagem.jsp");

	}

	@Get
	@Path("/usuario")
	public List<Usuario> listagem() {
		@SuppressWarnings("unchecked")
		List<Usuario> buscaPor = (List<Usuario>) usuarioDao.buscaPor(nome);
		return buscaPor;
	}
	
	@Put
	@Path("/usuario")
	public void editar(Usuario usuario) {
		Usuario entity = usuarioDao.buscaPor(nome);
		result.redirectTo(this).novo(entity);
	}
	
	@Delete
	@Path("/usuario")
	public void remover(Usuario usuario) {
		usuarioDao.remove(usuario);
		result.redirectTo(this).listagem();
	}
}