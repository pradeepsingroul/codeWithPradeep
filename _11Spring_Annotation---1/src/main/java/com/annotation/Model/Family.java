package com.annotation.Model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Family {
	
	@Value("Nanhe lal singroul")
	private String FatherName;
	@Value("Imarti bai Singroul")
	private String motherName;
	@Value("Narendra singroul")
	private String brotherName;
	@Value("Somvati and Anhoti singroul")
	private String sisterName;
	
	public void printNames() {
		System.out.println("father name is :"+ FatherName);
		System.out.println("mother Name is :"+ motherName);
		System.out.println("brothe rName is :"+ brotherName);
		System.out.println("siste rName is :"+ sisterName);
	}
	
	public String getFatherName() {
		return FatherName;
	}
	public void setFatherName(String fatherName) {
		FatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getBrotherName() {
		return brotherName;
	}
	public void setBrotherName(String brotherName) {
		this.brotherName = brotherName;
	}
	public String getSisterName() {
		return sisterName;
	}
	public void setSisterName(String sisterName) {
		this.sisterName = sisterName;
	}
	@Override
	public String toString() {
		return "Family [FatherName=" + FatherName + ", motherName=" + motherName + ", brotherName=" + brotherName
				+ ", sisterName=" + sisterName + "]";
	}
	public Family(String fatherName, String motherName, String brotherName, String sisterName) {
		super();
		FatherName = fatherName;
		this.motherName = motherName;
		this.brotherName = brotherName;
		this.sisterName = sisterName;
	}
	public Family() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
