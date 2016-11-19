package com.base.dao;

import java.util.List;

import com.base.model.User;

public interface UserDAO {
	
	public List<User> list();
	public User get(int id);
	public void save(User user);
	public void delete (int d);
	public User getusername(String name);
	public boolean isvaliduser(String user, String pass,boolean isAdmin);
	
	
}
