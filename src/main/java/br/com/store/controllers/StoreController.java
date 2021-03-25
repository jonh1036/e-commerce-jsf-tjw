package br.com.store.controllers;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.com.store.dao.ProductDao;
import br.com.store.models.Product;

@ManagedBean(name = "storeController", eager = true)
@ApplicationScoped
public class StoreController implements Serializable {

	private static final long serialVersionUID = 1901382680187948462L;
	
	private static List<Product> products;
	
	public List<Product> getProducts() {
		return products;
	}
	
	public static void findAllProducts() {
		ProductDao productDao = new ProductDao();
		products = productDao.findAll();
	}
}
