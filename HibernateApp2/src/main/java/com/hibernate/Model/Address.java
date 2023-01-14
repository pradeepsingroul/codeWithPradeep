package com.hibernate.Model;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

//@Embeddable
public class Address {
	
	private String state;
	private String city;
	private String pinCode;
	private String type;
	
	public Address(String state, String city, String pinCode, String type) {
		super();
		this.state = state;
		this.city = city;
		this.pinCode = pinCode;
		this.type = type;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", pinCode=" + pinCode + ", type=" + type + "]";
	}
	public Address(String state, String city, String pinCode) {
		super();
		this.state = state;
		this.city = city;
		this.pinCode = pinCode;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
