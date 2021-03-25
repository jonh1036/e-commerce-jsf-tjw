package br.com.store.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.store.utils.JPAUtil;

public abstract class GenericDao <T> {
	
    private final EntityManager manager = JPAUtil.getEntityManager();
	
	private final Class<T> clazz;
	
	public GenericDao(Class<T> clazz) {
		this.clazz = clazz;
	}

	public T getById(Long id) {
		return getManager().find(clazz, id);
	}

	public List<T> findAll() { 
		String JPQL = "SELECT a FROM " + clazz.getSimpleName() + " a";
		TypedQuery<T> q = getManager().createQuery(JPQL , clazz);
		return q.getResultList();
	}

	public void salvar(T clazz) {
		getManager().getTransaction().begin();
		getManager().persist(clazz);
		getManager().getTransaction().commit();
	}

	public void update(T clazz) {
		getManager().getTransaction().begin();
		getManager().merge(clazz);
		getManager().getTransaction().commit();
	}

	public void excluir(T clazz) {
		getManager().getTransaction().begin();
		getManager().remove(clazz);
		getManager().getTransaction().commit();
	}

	public void excluir(Long id) {
		excluir(getById(id));
	}

	public EntityManager getManager() {
		return manager;
	}
}
