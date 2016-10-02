package com.base.dao;

import java.util.List;



import com.base.model.Product;

public interface ProductDAO {
	
	public void saveOrUpdate(Product product);
	 
	public Product get(int ptid);
	public Product getProductByName(String name) ;

	public void delete(int ptid) ;

	public List<Product> list();
	
	public void manageProduct(Product product);

}
