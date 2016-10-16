package com.niit.dao;

import java.util.List;

import com.niit.model.Blog;



public interface BlogDAO {
	public void createBlog(Blog b);
	public List<Blog> getBlogList();
	public void deleteBlog(Blog b);	
	public Blog getCompleteBlog(int bid);
	
}
