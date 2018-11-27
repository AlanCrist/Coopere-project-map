package br.com.alancrist.controller;

import java.util.List;

import br.com.alancrist.dao.DocumentoDao;
import br.com.alancrist.model.Documento;
import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
public class DocumentoController {

	private Result result;
	private DocumentoDao documentoDao;
	private String nome;
	
	public DocumentoController(Result result, DocumentoDao documentoDao, String nome) {
		this.result = result;
		this.documentoDao = documentoDao;
		this.nome = nome;
	}

	@Get
	@Path("/usuario/novo")
	public void novo(Documento documento) {
		result.include("documento", documento);
	}

	@Post
	@Path("/usuario")
	public void salvar(Documento documento) {
		documentoDao.salva(documento);

		result
			.include("documentoList", documentoDao.buscaPor(nome))
			.forwardTo("WEB-INF/jsp/usuario/listagem.jsp");

	}

	@Get
	@Path("/documento")
	public List<Documento> listagem() {
		@SuppressWarnings("unchecked")
		List<Documento> buscaPor = (List<Documento>) documentoDao.buscaPor(nome);
		return buscaPor;
	}
	
	@Put
	@Path("/documento")
	public void editar(Documento documento) {
		Documento entity = documentoDao.buscaPor(nome);
		result.redirectTo(this).novo(entity);
	}
	
	@Delete
	@Path("/usuario")
	public void remover(Documento documento) {
		documentoDao.remove(documento);
		result.redirectTo(this).listagem();
	}
}