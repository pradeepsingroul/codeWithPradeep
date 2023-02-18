package com.masai.model;

import jakarta.persistence.Id;

public class User {
	
	@Id
	private Integer userId;
	
	private String firstName;
	
	private String lastNAme;
	
	private String mobileNumber;
	
	private String adderess;
	
	private Integer age;
	
	private String gender;
	
	private String password;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastNAme() {
		return lastNAme;
	}

	public void setLastNAme(String lastNAme) {
		this.lastNAme = lastNAme;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAdderess() {
		return adderess;
	}

	public void setAdderess(String adderess) {
		this.adderess = adderess;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastNAme=" + lastNAme + ", mobileNumber="
				+ mobileNumber + ", adderess=" + adderess + ", age=" + age + ", gender=" + gender + ", password="
				+ password + "]";
	}

	public User(Integer userId, String firstName, String lastNAme, String mobileNumber, String adderess, Integer age,
			String gender, String password) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastNAme = lastNAme;
		this.mobileNumber = mobileNumber;
		this.adderess = adderess;
		this.age = age;
		this.gender = gender;
		this.password = password;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
