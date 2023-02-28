package com.masai.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class User {

	@Id
	@Email(message = "format should be an email")
	private String email;
	
	@Pattern(regexp="^[A-Z][a-z]*")
	private String firstName;
	@Pattern(regexp="^[A-Z][a-z]*")
	private String lastname;
	@Size(max = 10,min = 10)
	private String mobileNumber;
	
	private String Address;
	@Min(value = 12)
	private Integer age;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	@Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$")
	@JsonProperty(access = Access.WRITE_ONLY)
	private String password;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Account account;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", firstName=" + firstName + ", lastname=" + lastname + ", mobileNumber="
				+ mobileNumber + ", Address=" + Address + ", age=" + age + ", gender=" + gender + ", password="
				+ password + ", account=" + account + "]";
	}

	public User(@Email String email, String firstName, String lastname, String mobileNumber, String address,
			Integer age, Gender gender, String password, Account account) {
		super();
		this.email = email;
		this.firstName = firstName;
		this.lastname = lastname;
		this.mobileNumber = mobileNumber;
		Address = address;
		this.age = age;
		this.gender = gender;
		this.password = password;
		this.account = account;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	
	
	
}
