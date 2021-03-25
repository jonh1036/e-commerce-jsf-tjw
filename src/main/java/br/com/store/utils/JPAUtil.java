package br.com.store.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static final EntityManagerFactory factory = Persistence.createEntityManagerFactory("STORE");

	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}

}
