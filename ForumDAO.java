package com.niit.dao;

import java.util.List;

import com.niit.model.Forum;





public interface ForumDAO {
	public void createForum(Forum f);
	public List<Forum> getForumList();
	public void deleteForum(Forum f);
	public Forum getCompleteForum(int fid);
}
