package br.com.alancrist.dao;

import java.util.List;

import br.com.alancrist.model.Documento;;

public interface DocumentoDao {

	public List<Documento> listaTudo();

	public void salva(Documento documento);

	public void atualiza(Documento documento);

	public void remove(Documento documento);

	public Documento buscaPor(String nome);

	public Documento carrega(Long id);
	
}
