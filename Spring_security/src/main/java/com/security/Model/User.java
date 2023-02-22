package com.security.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;
	
	@Pattern(regexp="^[a-zA-Z]",message="name should not contain spcial character")  
	private String name;
	
	@Email(message = "email should be in email format")
	private String email;
	
	@JsonProperty(access = Access.WRITE_ONLY)
	@Pattern(regexp="^[a-zA-Z0-9]{3}",message="length must be 3")  
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


	public User(Integer userId, @Email String email, String password, Address address) {
		super();
		this.userId = userId;
		this.email = email;
		this.password = password;
//		this.address = address;
	}


	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
