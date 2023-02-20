package com.masai.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Address {

	@Id
	private Integer addressId;
	
	private  String city;
	
	private String State ;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "address")
	private List<User> users = new ArrayList<>();

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", city=" + city + ", State=" + State + ", users=" + users + "]";
	}

	public Address(Integer addressId, String city, String state, List<User> users) {
		super();
		this.addressId = addressId;
		this.city = city;
		State = state;
		this.users = users;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
