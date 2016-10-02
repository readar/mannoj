package com.colb2.dao;

import java.util.List;

import com.colb2.model.Blog;

public interface BlogDAO {
	
    public Blog getblogid(int bid);
	public List<Blog> getBlogList();
	public void deleteBlog(Blog b);	
	public void saveOrUpdate(Blog b);
//	public Blog getCompleteBlog(int bid);
//	public void createBlog(Blog b);

}
