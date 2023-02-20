package com.masai.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class User {
	
	@Id
	private Integer userId;
	
	private String name;
	

	@ManyToOne(cascade = CascadeType.ALL)
	private Address address;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", address=" + address + "]";
	}

	public User(Integer userId, String name, Address address) {
		super();
		this.userId = userId;
		this.name = name;
		this.address = address;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
