package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Login")
public class Models {
	@Id
	private String Email;
	public Models(String email, String password) {
		super();
		Email = email;
		Password = password;
	}
	private String Password;
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
	
	
	public Models() {
		
	}
	
}