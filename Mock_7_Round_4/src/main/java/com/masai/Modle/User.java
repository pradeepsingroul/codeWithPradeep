package com.masai.Modle;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class User {
	
	@Id
	@Email(message = "email should be email format")
	private String email;
	
	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{6,12}$",message = "password should contains special char")
	private String password;
	
	@Pattern(regexp = "^[a-zA-Z]*$",message = "first Name should not contain special char")
	private String firstName;
	
	@Pattern(regexp = "^[a-zA-Z]*$",message = "last Name should not contain special char")
	private String lastName;
	
	@Size(min = 10, max = 10,message = "mobile number should not contain 10 digit")
	private String mobileNumber;
	
	
	@Past
	private LocalDate dateOfBirth;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private List<Event> events;

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
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

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", mobileNumber=" + mobileNumber + ", dateOfBirth=" + dateOfBirth + ", events=" + events + "]";
	}

	public User(String email, String firstName, String lastName, String mobileNumber, LocalDate dateOfBirth) {
		super();
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.dateOfBirth = dateOfBirth;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(@Email(message = "email should be email format") String email,
			@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{6,12}$", message = "password should contains special char") String password,
			@Pattern(regexp = "^[a-zA-Z]*$", message = "first Name should not contain special char") String firstName,
			@Pattern(regexp = "^[a-zA-Z]*$", message = "last Name should not contain special char") String lastName,
			@Size(min = 10, max = 10, message = "mobile number should not contain 10 digit") String mobileNumber,
			@Past LocalDate dateOfBirth, List<Event> events) {
		super();
		this.email = email;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.dateOfBirth = dateOfBirth;
		this.events = events;
	}
	
	

}
