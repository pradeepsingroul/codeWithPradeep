package com.masai.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bank {

	@Id
	private String name;
	
	private String headOfficeAt;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHeadOfficeAt() {
		return headOfficeAt;
	}

	public void setHeadOfficeAt(String headOfficeAt) {
		this.headOfficeAt = headOfficeAt;
	}

	@Override
	public String toString() {
		return "Bank [name=" + name + ", headOfficeAt=" + headOfficeAt + "]";
	}

	public Bank(String name, String headOfficeAt) {
		super();
		this.name = name;
		this.headOfficeAt = headOfficeAt;
	}

	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
