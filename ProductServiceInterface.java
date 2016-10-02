package com.base.service;

import java.util.List;

import com.base.model.Product;

public interface ProductServiceInterface {
	
	public void saveOrUpdate(Product product);
	public List<Product> list();
	public Product get(int ptid);
	public void delete(int ptid);
	
	public void manageProduct(Product product);

}
