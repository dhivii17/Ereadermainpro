package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="SignUp")
public class Models1 {
	@Id
	private long id;
	private String Firstname;
	private String Lastname;
	private String Email;
	private String Password;
	public Models1(long id) {
		super();
		this.id = id;
	}
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}
	
	public Models1(String firstname, String lastname, String email, String password) {
		super();
		Firstname = firstname;
		Lastname = lastname;
		Email = email;
		Password = password;
	}
	

	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public Models1 () {
		
	}
	
}
