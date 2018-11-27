package br.com.alancrist.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.alancrist.dao.DocumentoDao;
import br.com.alancrist.model.Documento;

@Repository("usuarioDao")
@Transactional
public class DocumentoDaoImpl implements DocumentoDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
	public List<Documento> listaTudo() {
		return entityManager
				.createQuery("from Usuario", Documento.class)
				.getResultList();
	}

	@Override
	public void salva(Documento documento) {
		entityManager.persist(documento);
	}

	@Override
	public void atualiza(Documento documento) {
		entityManager.merge(documento);
	}

	@Override
	public void remove(Documento documento) {
		entityManager.remove(entityManager.merge(documento));
	}

	@Override
	@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
	public Documento buscaPor(String nome) {
		return (Documento) createCriteria()
			.add(Restrictions.eq("nome", nome))
			.uniqueResult();
	}

	@Override
	@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
	public Documento carrega(Long id) {
		return entityManager.find(Documento.class, id);
	}
	
	private Criteria createCriteria() {
		Session session = ((Session) entityManager.getDelegate());
		return session.createCriteria(Documento.class);
	}

}

