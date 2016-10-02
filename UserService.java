package com.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.base.dao.UserDAO;
import com.base.model.User;

@Service
public class UserService implements UserServiceInterface {
	
	@Autowired
	UserDAO	userDAO;
	
	 public boolean isvaliduser(String user,String pass,boolean isAdmin)
	 {
		 System.out.println("Welcome to Novel store");
		 return userDAO.isvaliduser(user, pass, isAdmin);
		 
	 }
	public void saveOrUpdate(User user)
	{
		userDAO.saveOrUpdate(user);	
	}
	public List<User> list()
	{
		List<User> list=userDAO.list();
		return list;
	}
	public User get(int id)
	{
		return userDAO.get(id);
	}
	public User getusername(String name)
	{
		return userDAO.getusername(name);
	}
	public void delete(int id)
	{
		userDAO.delete(id);
	}



}
