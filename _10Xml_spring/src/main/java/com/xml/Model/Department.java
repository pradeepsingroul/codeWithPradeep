package com.xml.Model;

public class Department {
	
	private int deptId;
	private String name;
	private String address;
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", name=" + name + ", address=" + address + "]";
	}
	public Department(int deptId, String name, String address) {
		super();
		this.deptId = deptId;
		this.name = name;
		this.address = address;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
