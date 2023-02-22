package com.security.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer addressId;
	
	private String cityName;
	
	private String state;
	
	@OneToMany
	private List<CustomerUser> users;

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public List<CustomerUser> getUsers() {
		return users;
	}

	public void setUsers(List<CustomerUser> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", cityName=" + cityName + ", state=" + state + ", users=" + users
				+ "]";
	}

	public Address(Integer addressId, String cityName, String state, List<CustomerUser> users) {
		super();
		this.addressId = addressId;
		this.cityName = cityName;
		this.state = state;
		this.users = users;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
