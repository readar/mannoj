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

import com.base.model.User;




@Repository("userDAO")
public class UserDAOImpl implements UserDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public UserDAOImpl() {
		System.out.println("UserDAOImpl --One");
	}
	public UserDAOImpl(SessionFactory sessionFactory) {

		this.sessionFactory = sessionFactory;
		System.out.println("Inside UserDAOImpl");
	}
	
/*	public User initFlow()
	{
		return new User();
		
	}*/
		
	
	
	public void save(User user) {
//		log.debug("Starting");
		System.out.println("in userdetails save.");
		// TODO Auto-generated method stub
		try {
			Session session=sessionFactory.getCurrentSession();
			Transaction tx=session.beginTransaction();
			session.save(user);
		tx.commit();
	//		return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		log.debug("Ending");
	//	return false;
	}
		/*Session session=sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		UserRole userRole=new UserRole();
		userRole.setId(user.getId());
		userRole.setAuthority("ROLE_USER");
		session.save(userRole);
		
		user.setEnabled(true);
	//	user.setRole(userRole);
		session.save(user);
	    
		System.out.println("Done saving user");
		tx.commit();*/
//	}
	@Transactional
	public void delete(int id) {
		User user = new User();
		user.setId(id);
		sessionFactory.getCurrentSession().delete(user);

	}

	@Transactional
	public User get(int id) {
		String hql = "from User where id=" + "'" + id + "'";
		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<User> listUser = (List<User>) query.list();

		if (listUser != null && listUser.isEmpty()) {
			return listUser.get(0);
		}
		System.out.println("success");
		return null;

	}

	@Transactional
	public List<User> list() {
		@SuppressWarnings("unchecked")
		List<User> listUser = (List<User>) sessionFactory.getCurrentSession().createCriteria(User.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listUser;

	}

	
	public User getusername(String name) {
		System.out.println("getting data in dao based on name");
		Session session = this.sessionFactory.getCurrentSession();
	//	Transaction tx=session.beginTransaction();
		User user = (User) session.get(User.class, name);
	//	tx.commit();
		System.out.println("data of user by name=" + name);
		return user;

	}

	public boolean isvaliduser(String user, String pass, boolean isAdmin) {
		String hql = "from user where id='" + user + "' and password= '" + pass + "'";
		Query q = sessionFactory.getCurrentSession().createQuery(hql);
		List<User> list = (List<User>) q.list();
		
		if(list !=null&& !list.isEmpty()){
			return true;
		}
		return false;

	}


}