package com.base.service;

import java.util.List;

import com.base.model.Cart;

public interface CartServiceInterface {

	public List<Cart> list();

	public List<Cart> get(int userId);
	
	public Cart getitem(int cartId);

	public void saveOrUpdate(Cart cart);

	public void delete(int userId);
	
	public long CartPrice(int userId);	
	
	public Cart getitem(int prodId,int userId);
	
	public long cartsize(int userId);
	
	public void pay(int userId);
}
