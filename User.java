package com.base.model;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



import javax.persistence.Table;
import javax.persistence.Transient;


import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class User implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	public int id;
//	@NotEmpty(message="first name cannot be empty")
	public String firstname;
//	@NotEmpty(message="middle name cannot be empty")
	public String middlename;
//	@NotEmpty(message="last name cannot be empty")
	public String lastname;
//	@NotEmpty(message="username cannot be empty")
	public String username;
//	@NotEmpty(message="password cannot be empty")
	public String password;
//	@NotEmpty(message="email cannot be empty")
	public String email;
	
	@Transient
	private String confirmpassword;
	
	@Column(name="enabled")
	private boolean isEnabled;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isEnabled() {
		return isEnabled;
	}
	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	
	
	private String isrole;


	public String getIsrole() {
		return isrole;
	}
	public void setIsrole(String isrole) {
		this.isrole = isrole;
	}



	
/*	private UserRole role;


	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="isrole")
	public UserRole getRole() {
		return role;
	}
	public void setRole(UserRole role) {
		this.role = role;
	}*/
	
}
