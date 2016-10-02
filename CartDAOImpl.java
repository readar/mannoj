package com.base.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.base.model.Cart;


@Repository("cartDAO")
public class CartDAOImpl implements CartDAO {
	
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public CartDAOImpl(SessionFactory sessionFactory) 
	{
		this.sessionFactory = sessionFactory;
	}
	@SuppressWarnings("unchecked")
	
    @Transactional
	public List<Cart> list() {

	List<Cart> listCategory = (List<Cart>)sessionFactory.getCurrentSession()
					.createCriteria(Cart.class)
					.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

			return listCategory;
		}
	@SuppressWarnings("unchecked")
    @Transactional
	public List<Cart> get(int userId) {

		String hql = "from"+" Cart"+" where userId="+userId+"and status='C'";
		@SuppressWarnings("rawtypes")
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Cart> list = (List<Cart>)query.list();

		return list;
	}
	
    @Transactional
	public void saveOrUpdate(Cart cart) {

		sessionFactory.getCurrentSession().saveOrUpdate(cart);

	}
    @Transactional
	public void delete(int cartid) {

		Cart cart = new Cart();
		cart.setId(cartid);
		sessionFactory.getCurrentSession().delete(cart);

	}
    @Transactional
	public long CartPrice(int userId) {

		Criteria c=sessionFactory.getCurrentSession().createCriteria(Cart.class);
		c.add(Restrictions.eq("userid", userId));
		c.add(Restrictions.eq("status","C"));
		c.setProjection(Projections.sum("price"));
		Long g= (Long) c.uniqueResult();

		return g;
		
	}
	@SuppressWarnings("unchecked")
    @Transactional
	public Cart getitem(int cartId) {

		String hql = "from"+" Cart"+" where id="+cartId;
		@SuppressWarnings("rawtypes")
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Cart> list = (List<Cart>) query.list();

		if (list!= null && !list.isEmpty()) {
			return list.get(0);
		}
		return null;
	}
    @Transactional
	public Cart getitem(int prodId, int userId) {

		String hql = "from"+" Cart"+" where userid="+userId+" and productid="+"'"+prodId+"'";
		@SuppressWarnings("rawtypes")
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Cart> list = (List<Cart>) query.list();

		if (list!= null && !list.isEmpty()) {
			return list.get(0);
		}
		return null;
	}
    @Transactional
	public long cartsize(int userId) {
	
		Criteria c=sessionFactory.getCurrentSession().createCriteria(Cart.class);
		c.add(Restrictions.eq("userid", userId));
	//	c.add(Restrictions.eq("status","C"));
		c.setProjection(Projections.count("userid"));
		long count= (Long) c.uniqueResult();

		return count;
	}
    @Transactional
	public void pay(int userId) {
	
		String hql="update Cart set status='P' where userid="+userId;	
		@SuppressWarnings("rawtypes")
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.executeUpdate();

	}

}
