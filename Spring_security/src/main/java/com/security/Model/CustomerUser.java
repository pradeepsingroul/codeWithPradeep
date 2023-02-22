package com.security.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;

@Entity
public class CustomerUser {
	
	@Id
	private Integer userId;
	
	private String name;
	
	@Email(message = "email should be in email format")
	@Column(unique = true)
	private String email;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@JsonProperty(access = Access.WRITE_ONLY)
	private String password;
	
	
//	@ManyToOne(cascade = CascadeType.ALL)
//	private Address address;


	public Integer getUserId() {
		return userId;
	}


	public void setUserId(Integer userId) {
		this.userId = userId;
	}


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


//	public Address getAddress() {
//		return address;
//	}


//	public void setAddress(Address address) {
//		this.address = address;
//	}


	@Override
	public String toString() {
		return "User [userId=" + userId + ", email=" + email + ", password=" + password + ", address="  + "]";
	}


	public CustomerUser(Integer userId, @Email String email, String password, Address address) {
		super();
		this.userId = userId;
		this.email = email;
		this.password = password;
//		this.address = address;
	}


	public CustomerUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
