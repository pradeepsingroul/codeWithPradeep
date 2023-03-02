package com.masai.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;


@Entity
public class User {
	

	@Id
	@Email
	@Email(message = "format should be an email")
	private String email;
	
	@Pattern(regexp="^[A-Z][a-z]*")
	private String fristName;
	
	@Pattern(regexp="^[A-Z][a-z]*")
	private String lastName;
	
	@Size(max = 10,min = 10)
	private String mobileNumber;
	
	private String address;
	
	@Min(value = 12)
	private Integer age;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Account account;
	
	@Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$")
	@JsonProperty(access = Access.WRITE_ONLY)
	private String password;
	
	@Enumerated(EnumType.STRING)
	private Role role;
	
	
	
	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFristName() {
		return fristName;
	}

	public void setFristName(String fristName) {
		this.fristName = fristName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", fristName=" + fristName + ", lastName=" + lastName + ", mobileNumber="
				+ mobileNumber + ", address=" + address + ", age=" + age + ", gender=" + gender + ", account=" + account
				+ "]";
	}

	public User(@Email String email, String fristName, String lastName, String mobileNumber, String address,
			Integer age, Gender gender, Account account) {
		super();
		this.email = email;
		this.fristName = fristName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.age = age;
		this.gender = gender;
		this.account = account;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
