package br.com.store.controllers;

import java.io.Serializable;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "navigationController", eager = true)
@ApplicationScoped
public class NavigationController implements Serializable {

	private static final long serialVersionUID = 1901382680187948462L;
	
	public static String goToLoginPage() {
		return "login";
	}
	
	public static String goToHomePage() {
		StoreController.findAllProducts();
		return "index";
	}
	
	public String goToRegistrationPage() {
		return "registration";
	}
	
	public String goToPurchasePage() {
		return "purchase";
	}
	
	public String goToStorePage() {
		StoreController.findAllProducts();
		return "store";
	}
	
}
