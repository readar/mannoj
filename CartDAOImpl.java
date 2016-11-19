package com.base.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.base.model.Cart;
import com.base.model.Category;
import com.base.model.User;


@Repository("cartDAO")
public class CartDAOImpl implements CartDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public CartDAOImpl(SessionFactory sf) {
		sessionFactory=sf;
	}

	public List<Cart> list() {
		
		@SuppressWarnings({ "unchecked" })
		List<Cart> listCategory=(List<Cart>) sessionFactory.getCurrentSession()
				                     .createCriteria(Cart.class)
				                     .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listCategory;
		
	}

	public Cart get(int id) {
		String hql = "from Cart where id=" + "'" + id + "'";
		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Cart> listUser = (List<Cart>) query.list();

		if (listUser != null && listUser.isEmpty()) {
			return listUser.get(0);
		}
		System.out.println("success");
		return null;

	}

	public void save(Cart cart) {
		Transaction t = sessionFactory.getCurrentSession().beginTransaction();

		sessionFactory.getCurrentSession().save(cart);
		t.commit();
	}

	public void delete(int id) {
		Cart cid=new Cart();
		
		sessionFactory.getCurrentSession().delete(cid);
		
		
	}
    public Cart getCartItemByProductId(int productId){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Cart where prodid = ?");
        query.setInteger(0, productId);
        session.flush();

        return (Cart) query.uniqueResult();
    }

	public Cart getusrprod(int uid, int pid) {
		// TODO Auto-generated method stub
		return null;
	}

}
