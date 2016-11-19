package com.base.dao;

import java.util.List;

import com.base.model.Cart;



public interface CartDAO {
	
	public List<Cart> list();

	public Cart get(int id);

	public void save(Cart cart);

	public void delete(int id);
	
	public Cart getusrprod(int uid,int pid);
	
	public Cart getCartItemByProductId(int productId);
	
	

	

}
