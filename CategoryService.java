package com.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.base.dao.CategoryDAO;

import com.base.model.Category;


@Service
public class CategoryService {
	
	@Autowired
	CategoryDAO categoryDAO;
	
	public void saveOrUpdate(Category category)
	{
		categoryDAO.saveOrUpdate(category);	
	}
	public List<Category> list()
	{
		List<Category> list=categoryDAO.list();
		return list;
	}
	public Category get(int id)
	{
		return categoryDAO.get(id);
	}
	public void delete(int id)
	{
		categoryDAO.delete(id);
	}
	public Category getByName(String tgname) {
		
		return categoryDAO.getByName(tgname);
	}
	

}
