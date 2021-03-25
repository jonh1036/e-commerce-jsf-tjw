package br.com.store.dao;

import javax.persistence.TypedQuery;

import br.com.store.models.User;

public class UserDao extends GenericDao<User>{

	public UserDao() {
		super(User.class);
	}
	
	public User findUserByEmail(String email) {
		String JPQL = "SELECT a FROM " + User.class.getSimpleName() + " a where login= '" + email +"'";
		TypedQuery<User> result = super.getManager().createQuery(JPQL , User.class);
		return result.getSingleResult();
	}
}
