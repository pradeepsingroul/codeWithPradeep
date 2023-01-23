package com.mapping.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
	
	
	@Id
	private int emplId;
	private String eName;
	private String homeCity;
	public int getEmplId() {
		return emplId;
	}
	
	public void setEmplId(int emplId) {
		this.emplId = emplId;
	}
	
	public String geteName() {
		return eName;
	}
	
	public void seteName(String eName) {
		this.eName = eName;
	}
	
	public String getHomeCity() {
		return homeCity;
	}
	
	public void setHomeCity(String homeCity) {
		this.homeCity = homeCity;
	}
	
	@Override
	public String toString() {
		return "Employee [emplId=" + emplId + ", eName=" + eName + ", homeCity=" + homeCity + "]";
	}
	
	public Employee(int emplId, String eName, String homeCity) {
		super();
		this.emplId = emplId;
		this.eName = eName;
		this.homeCity = homeCity;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	

}
