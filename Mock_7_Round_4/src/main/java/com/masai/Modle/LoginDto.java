package com.masai.Modle;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LoginDto {
	
	@Id
	private String email;
	private String password;
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginDto [email=" + email + ", password=" + password + "]";
	}
	public LoginDto(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public LoginDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
