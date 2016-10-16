package com.niit.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.Blog;
import com.niit.model.User;

@Repository("blogDAO")
public class BlogDAOImpl implements BlogDAO {
	
	@Autowired
	private SessionFactory sessionFactory;   
	
	public BlogDAOImpl(){}
	
	public BlogDAOImpl(SessionFactory sf){
		this.sessionFactory=sf;
	}

	public void createBlog(Blog b) {
	
		Session s=sessionFactory.getCurrentSession();
		Transaction t=s.beginTransaction();
		System.out.println("Blog dao impl" +  b);
		s.saveOrUpdate(b);
		t.commit();	

		
	}

	public List<Blog> getBlogList() {
		List<Blog> lst;
		System.out.println("getAllBlogs()");
		Session ses = sessionFactory.openSession();
		System.out.println("getBlogList()session " + ses.isOpen());
		Query qry = ses.createQuery("from Blog where blogstatus='valid'");
		lst = qry.list();
		System.out.println(lst);
		return lst;		
	}

	public void deleteBlog(Blog b) {
		Blog bl	= new Blog();
	

		sessionFactory.getCurrentSession().delete(b);
		
		
		
	}

	public Blog getCompleteBlog(int bid) {
		Blog b;	
		List<Blog> lst;
		System.out.println("DAO-getCompleteBlog()");
		Session ses = sessionFactory.openSession();
		System.out.println("getBlogList()session " + ses.isOpen());
		Query qry = ses.createQuery("from Blog where blogid="+bid);
		lst = qry.list();
		b=lst.get(0);
		System.out.println(lst);
		return b;	
	}



}
