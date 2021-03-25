package br.com.store.dao;

import br.com.store.models.Purchase;

public class PurchaseDao extends GenericDao<Purchase>{

	PurchaseDao() {
		super(Purchase.class);
	}
}
