package com.base.model;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToOne;





@Entity
public class UserRole {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int id;
	
	private String authority;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
/*
	private User user;

	@OneToOne(cascade = CascadeType.ALL,mappedBy="user")
//	@JoinColumn(name="id")
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}*/
	

}
