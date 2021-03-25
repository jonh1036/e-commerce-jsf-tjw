package br.com.store.dao;

import br.com.store.models.Product;

public class ProductDao extends GenericDao<Product>{

	public ProductDao() {
		super(Product.class);
	}
}
