package com.springBoot.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Department {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int deptId;
	private String deptName;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address deptAddress;

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Address getDeptAddress() {
		return deptAddress;
	}

	public void setDeptAddress(Address deptAddress) {
		this.deptAddress = deptAddress;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", deptAddress=" + deptAddress + "]";
	}

	public Department(int deptId, String deptName, Address deptAddress) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptAddress = deptAddress;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
