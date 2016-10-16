package com.niit.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.Forum;



@Repository("forumDAO")
public class ForumDAOImpl implements ForumDAO {
	

	
	@Autowired
	private SessionFactory sessionFactory;   
	
	public ForumDAOImpl(){}
	
	public ForumDAOImpl(SessionFactory sf){
		this.sessionFactory=sf;
	}
//	@Override
	public void createForum(Forum f) {
		// TODO Auto-generated method stub
		Session s=sessionFactory.getCurrentSession();
		Transaction t=s.beginTransaction();
		System.out.println("Forum dao impl" +  f);
		s.saveOrUpdate(f);
		t.commit();	

	}

//	@Override
	public List<Forum> getForumList() {
		// TODO Auto-generated method stub
		List<Forum> lst;
		System.out.println("getAllForums()");
		Session ses = sessionFactory.openSession();
		System.out.println("getForumList()session " + ses.isOpen());
		Query qry = ses.createQuery("from Forum where forumstatus='valid'");
		lst = qry.list();
		System.out.println(lst);
		return lst;			
	}

//	@Override
	public void deleteForum(Forum f) {
		// TODO Auto-generated method stub

	}

//	@Override
	public Forum getCompleteForum(int fid) {
		// TODO Auto-generated method stub
		return null;
	}



}
