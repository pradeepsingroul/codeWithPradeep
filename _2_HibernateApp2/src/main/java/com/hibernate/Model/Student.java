package com.hibernate.Model;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
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
public class Student {
	
	@Id
	private int roll;
	private String studentName;
	private int marks;
	
//	@Embedded
//	private Address address; // for this hibernate create a table with address field as well;
	
	@ElementCollection
	@Embedded
	private List<Address> lstAddress; // for this hibernate create a seperate table to maintain two or more address;

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	
	
	public Student(int roll, String studentName, int marks, List<Address> lstAddress) {
		super();
		this.roll = roll;
		this.studentName = studentName;
		this.marks = marks;
		this.lstAddress = lstAddress;
	}

	public List<Address> getLstAddress() {
		return lstAddress;
	}

	public void setLstAddress(List<Address> lstAddress) {
		this.lstAddress = lstAddress;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", studentName=" + studentName + ", marks=" + marks + ", lstAddress="
				+ lstAddress + "]";
	}

	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
