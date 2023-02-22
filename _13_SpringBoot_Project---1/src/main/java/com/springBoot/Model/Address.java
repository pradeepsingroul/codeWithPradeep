package com.springBoot.Model;

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
	private int aId;
	private String city;
	private int pincode;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "address")
	private List<Student> sList;
	
	
	public Address(int aId, String city, int pincode, List<Student> sList) {
		super();
		this.aId = aId;
		this.city = city;
		this.pincode = pincode;
		this.sList = sList;
	}
	public List<Student> getsList() {
		return sList;
	}
	public void setsList(List<Student> sList) {
		this.sList = sList;
	}
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [aId=" + aId + ", city=" + city + ", pincode=" + pincode + ", sList=" + sList + "]";
	}
	public Address(int aId, String city, int pincode) {
		super();
		this.aId = aId;
		this.city = city;
		this.pincode = pincode;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
	
	

}
