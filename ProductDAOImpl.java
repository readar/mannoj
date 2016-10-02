package com.base.dao;

import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.base.model.Product;

@Repository("productDAO")
public class ProductDAOImpl implements ProductDAO {
	
	@Autowired
	SessionFactory sessionfactory;
	
	public ProductDAOImpl() {
		System.out.println("ProductDAOImpl --One");
	}
	public ProductDAOImpl(SessionFactory sessionfactory){
		this.sessionfactory=sessionfactory;
	}
		
		@Transactional
		public void saveOrUpdate(Product pd){
			
			Session s=sessionfactory.getCurrentSession();
			Transaction t=s.beginTransaction();
			System.out.println("User dao impl" +  pd);
			s.saveOrUpdate(pd);
			t.commit();	
			
			
			
		//	Transaction t=sessionfactory.getCurrentSession().beginTransaction();
			
		//	sessionfactory.getCurrentSession().saveOrUpdate(product);
		//t.commit();
		
		}
		
	    @Transactional
		public Product get(int id) {
/*	    	EntityManager em = entityManagerFactory.createEntityManager();
	    	Order order = em.find(Order.class, 111);
	    	System.out.println("Customer details for order 111 : " + order.getCustomer());
	    	em.close();
	    	entityManagerFactory.close();*/
         	Session session=sessionfactory.getCurrentSession();
			Transaction transaction=session.beginTransaction();
			Product product=session.load(Product.class,new Integer(id));
			return product;
		}
	    @Transactional
		public Product getProductByName(String name) {
			// TODO Auto-generated method stub
			
				System.out.println("getting data in dao based on name");
				Session session=this.sessionfactory.getCurrentSession();
				Product product=(Product) session.get(Product.class,name);
				System.out.println("data of user by name="+product);
				return product;	

		}
		
		@Transactional
		public void delete(int ptid) {
			
			System.out.println("Id in deleteProduct(int ptid):"+ptid);
			
		    Session session=sessionfactory.getCurrentSession();
		    Transaction tx=session.beginTransaction();
		    Product product = (Product)session.load(Product.class, ptid);
		 //   Query query=session.createQuery("delete from Product  where ptid=:status");
		  //  query.setInteger("status",ptid);
		  //  int rowsDeleted=query.executeUpdate();
		    session.delete(product);
		  tx.commit();
		   // System.out.println("Rows deleted:"+rowsDeleted);
		    System.out.println("deleted");
			
		
		}
			
		
	
			public List<Product> list() {
			Session s = sessionfactory.getCurrentSession();
			Transaction tx = s.beginTransaction();
			List<Product> listProduct = s.createCriteria(Product.class).list();
			
				return listProduct;
			}
		public void manageProduct(Product product) {
			
			
			Session session=sessionfactory.getCurrentSession();
			Transaction transaction=session.beginTransaction();
			session.update(product);
			session.flush();
			transaction.commit();
			System.out.println("updated");
		}
		

}
