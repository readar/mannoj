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


import com.base.model.Supplier;

@Repository("supplierDAO")
public class SupplierDAOImpl implements SupplierDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public SupplierDAOImpl() {
		System.out.println("SupplierDAOImpl --One");
	}
	
	public SupplierDAOImpl(SessionFactory sessionFactory){
		this.sessionFactory= sessionFactory;
		
	}
@Transactional
	public void saveOrUpdate(Supplier supplier) {
	Transaction t = sessionFactory.getCurrentSession().beginTransaction();

	sessionFactory.openSession().saveOrUpdate(supplier);
	t.commit();
	}


@Transactional
public void delete(int id) {
	Supplier supplier =new Supplier();
	
	sessionFactory.getCurrentSession().delete(supplier);
	
	
}
@Transactional
public Supplier get(int id) {
	String hql = "from Supplier where id=" + "'"+ id +"'";
	Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
	List<Supplier> listSupplier = (List<Supplier>) ((SupplierDAO) query).list();
	
	if  (listSupplier != null && !listSupplier.isEmpty()){
		return listSupplier.get(0);
		
	}
	return null;
}

	@Transactional
	public List<Supplier> list() {
		//Transaction t=sessionFactory.getCurrentSession().beginTransaction();
		//t.commit();
	@SuppressWarnings("unchecked")
	List<Supplier> listSupplier = (List<Supplier>)
	sessionFactory.getCurrentSession()
	.createCriteria(Supplier.class)
	.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
	
		return listSupplier;
	}

	@Transactional
	public Supplier getByName(String spname) {

	   String hql = "from Supplier where suppliername=" + "'"+ spname +"'";
	
		Query query = (Query) sessionFactory.openSession().createQuery(hql);
		List<Supplier> listSupplier = (List<Supplier>)  query.list();
		
		if  (listSupplier != null && !listSupplier.isEmpty()){
			return listSupplier.get(0);
			
		}
   		return null;
   		
/*	//	System.out.println("getting data in dao based on name");
		Session session=this.sessionFactory.getCurrentSession();
		Supplier supplier=(Supplier) session.get(Supplier.class,spname);
		System.out.println("data of user by name="+supplier);
		return supplier;*/	
	}
	
	
}

