package com.pureAnnotaion.Model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Scope("prototype")
public class Student {
	
	
	private int sId;
	private String sName;
	private String address;
	
	@Autowired(required = true)
	private List<Course> courses;

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [sName=" + sName + ", address=" + address + ", courses=" + courses + "]";
	}

	public Student(String sName, String address, List<Course> courses) {
		super();
		this.sName = sName;
		this.address = address;
		this.courses = courses;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	

}
