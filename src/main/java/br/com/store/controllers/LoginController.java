package br.com.store.controllers;

import java.io.Serializable;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.persistence.NoResultException;

import br.com.store.dao.UserDao;
import br.com.store.models.User;

@ManagedBean(name = "loginController", eager = true)
@ApplicationScoped
public class LoginController implements Serializable {

	private static final long serialVersionUID = 1901382680187948462L;

	private String email;
	private String password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String login() {
		UserDao userDao = new UserDao();
		User user = null;
		
		try {
			 user = userDao.findUserByEmail(email);	
		} catch (NoResultException e) {
			user = new User();
		} finally {
			if(user == null || user.getPassword() == null || !user.getPassword().equals(password))
				return "loginError";			
		}
		
		return "store";
	}
	
	public String logout() {
		this.email = "";
		this.password = "";
		return NavigationController.goToHomePage();
	}
}
