package br.com.store.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Purchase {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String date;
	
	private String buyerFullName;
	
	private String buyerCreditCard;
	
	private String buyerSecurityCode;
	
	private Double amount;
	
	private Long productId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getBuyerFullName() {
		return buyerFullName;
	}

	public void setBuyerFullName(String buyerFullName) {
		this.buyerFullName = buyerFullName;
	}

	public String getBuyerCreditCard() {
		return buyerCreditCard;
	}

	public void setBuyerCreditCard(String buyerCreditCard) {
		this.buyerCreditCard = buyerCreditCard;
	}

	public String getBuyerSecurityCode() {
		return buyerSecurityCode;
	}

	public void setBuyerSecurityCode(String buyerSecurityCode) {
		this.buyerSecurityCode = buyerSecurityCode;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

}
