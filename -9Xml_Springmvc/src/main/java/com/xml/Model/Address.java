package com.xml.Model;

public class Address {
	
	private String city;
	private String state;
	private int pinCode;
	private String adderssType;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public String getAdderssType() {
		return adderssType;
	}
	public void setAdderssType(String adderssType) {
		this.adderssType = adderssType;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", pinCode=" + pinCode + ", adderssType=" + adderssType
				+ "]";
	}
	public Address(String city, String state, int pinCode, String adderssType) {
		super();
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
		this.adderssType = adderssType;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
