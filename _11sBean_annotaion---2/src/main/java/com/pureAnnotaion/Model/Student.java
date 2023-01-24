package com.pureAnnotaion.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Scope("prototype")
public class Student {
	
	private String sName;
	private String address;
	
	@Autowired(required = true)
	private Course course;
	
	
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
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [sName=" + sName + ", address=" + address + ", course=" + course + "]";
	}
	public Student(String sName, String address, Course course) {
		super();
		this.sName = sName;
		this.address = address;
		this.course = course;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
