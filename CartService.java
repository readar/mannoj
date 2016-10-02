package com.base.service;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.base.dao.CartDAO;
import com.base.model.Cart;
import com.base.model.Product;


@Service
public class CartService implements CartServiceInterface{

	
	@Autowired
	CartDAO cartDAO;
	
	@Autowired
	SessionFactory sessionFactory;
	public CartService(){}
	
	public CartService(SessionFactory sessionfactory){
		sessionFactory=sessionfactory;
	}
	public List<Cart> list() {
		
		List<Cart> list=cartDAO.list();
		return list();
	}

	public List<Cart> get(int userId) {
		
		return cartDAO.get(userId);
	}

	public Cart getitem(int cartId) {
		// TODO Auto-generated method stub
		return cartDAO.getitem(cartId);
	}

	public void saveOrUpdate(Cart cart) {
		// TODO Auto-generated method stub
		cartDAO.saveOrUpdate(cart);
	}

	public void delete(int userId) {
		// TODO Auto-generated method stub
		cartDAO.delete(userId);
	}

	public long CartPrice(int userId) {
		// TODO Auto-generated method stub
		return cartDAO.CartPrice(userId);
	}

	public Cart getitem(int prodId, int userId) {
		// TODO Auto-generated method stub
		return cartDAO.getitem(prodId, userId);
	}

	public long cartsize(int userId) {
		// TODO Auto-generated method stub
		return cartDAO.cartsize(userId);
	}

	public void pay(int userId) {
		// TODO Auto-generated method stub
		cartDAO.pay(userId);
	}
	


}
