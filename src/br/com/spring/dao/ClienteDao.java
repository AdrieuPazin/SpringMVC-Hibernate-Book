package br.com.spring.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.spring.model.Cliente;

@Repository
public class ClienteDao {

	@PersistenceContext
	private EntityManager manager;
	
	@Transactional
	public void inserir(Cliente c) {
		this.manager.persist(c);
	}
}
