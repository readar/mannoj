package com.niit.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="Forum")
@Component
public class Forum {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ForumID;
	private String ForumTitle;
	private String ForumCategory;
	public String getForumCategory() {
		return ForumCategory;
	}
	public void setForumCategory(String forumCategory) {
		ForumCategory = forumCategory;
	}
	private String ForumContent;
	private String ForumCreatedUser;
	private Date ForumCreationDate;
	private String ForumStatus;
	public int getForumID() {
		return ForumID;
	}
	public void setForumID(int forumID) {
		ForumID = forumID;
	}
	public String getForumTitle() {
		return ForumTitle;
	}
	public void setForumTitle(String forumTitle) {
		ForumTitle = forumTitle;
	}
	public String getForumContent() {
		return ForumContent;
	}
	public void setForumContent(String forumContent) {
		ForumContent = forumContent;
	}
	public String getForumCreatedUser() {
		return ForumCreatedUser;
	}
	public void setForumCreatedUser(String forumCreatedUser) {
		ForumCreatedUser = forumCreatedUser;
	}
	public Date getForumCreationDate() {
		return ForumCreationDate;
	}
	public void setForumCreationDate(Date forumCreationDate) {
		ForumCreationDate = forumCreationDate;
	}
	public String getForumStatus() {
		return ForumStatus;
	}
	public void setForumStatus(String forumStatus) {
		ForumStatus = forumStatus;
	}
	
	

}
