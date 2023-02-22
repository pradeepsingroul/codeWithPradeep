package com.springBoot.Model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Component

public class Student {
	
	private String name;
	private int roll;
	private int marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Student(String name, int roll, int marks) {
		super();
		this.name = name;
		this.roll = roll;
		this.marks = marks;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getRoll() {
//		return roll;
//	}
//
//	public void setRoll(int roll) {
//		this.roll = roll;
//	}
//
//	public int getMarks() {
//		return marks;
//	}
//
//	public void setMarks(int marks) {
//		this.marks = marks;
//	}
//
//	public Batch getB() {
//		return b;
//	}
//
//	public void setB(Batch b) {
//		this.b = b;
//	}

	
	
	

	
	
	
	
	
	

}
