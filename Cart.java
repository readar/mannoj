package com.base.model;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


public class Cart {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cid;
	private String quantity;
	private long totalprice;
	
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public long getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(long totalprice) {
		this.totalprice = totalprice;
	}
	
	
	
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="prodid", insertable = false, updatable = false)
	private Product prod;


	public Product getProd() {
		return prod;
	}
	public void setProd(Product prod) {
		this.prod = prod;
	}
	
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="usrid", insertable = false, updatable = false)
	private User usr;
	
	

}
