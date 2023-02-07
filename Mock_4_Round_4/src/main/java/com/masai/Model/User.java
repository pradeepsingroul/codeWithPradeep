package com.masai.Model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class User {
	
	@Id
	private String email;
	private String firstName;
	private String lastName;
	private int age;
	private String gender;
	private String password;
  
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Blog> blogs;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Comment> comments;


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


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
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


	public List<Blog> getBlogs() {
		return blogs;
	}


	public void setBlogs(List<Blog> blogs) {
		this.blogs = blogs;
	}


	public List<Comment> getComments() {
		return comments;
	}


	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}


	@Override
	public String toString() {
		return "User [email=" + email + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", gender=" + gender + ", password=" + password + ", blogs=" + blogs + ", comments=" + comments + "]";
	}


	public User(String email, String firstName, String lastName, int age, String gender, String password) {
		super();
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.password = password;
	}


	public User(String email, String firstName, String lastName, int age, String gender, String password,
			List<Blog> blogs, List<Comment> comments) {
		super();
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.password = password;
		this.blogs = blogs;
		this.comments = comments;
	}


	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	

}
