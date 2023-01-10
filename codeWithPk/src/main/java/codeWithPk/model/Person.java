package codeWithPk.model;

import org.springframework.stereotype.Component;

@Component
public class Person {
	
	private int personId;
	private String personName;
	private String email;
	private int age;
	private String mobile;
	
	
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", email=" + email + ", age=" + age
				+ ", mobile=" + mobile + "]";
	}
	public Person(int personId, String personName, String email, int age, String mobile) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.email = email;
		this.age = age;
		this.mobile = mobile;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
