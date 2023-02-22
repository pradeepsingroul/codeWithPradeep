package com.Items.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	// i am facing some issue on sts so lombok is not working
	
	@Id // to define primary key
	@GeneratedValue(strategy = GenerationType.AUTO)// to generate primary key automatically
	private Long userId;
	private String userName;
	private String Address;
	
	// one user/person can have multiple task so i am declaring @one to many relation with TodoTask 
	@OneToMany(cascade = CascadeType.ALL)
	private List<TodoTask> items;


	public Long getUserId() {
		return userId;
	}


	public void setUserId(Long userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	public List<TodoTask> getItems() {
		return items;
	}


	public void setItems(List<TodoTask> items) {
		this.items = items;
	}


	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", Address=" + Address + ", items=" + items + "]";
	}


	public User(Long userId, String userName, String address) {
		super();
		this.userId = userId;
		this.userName = userName;
		Address = address;
	}


	public User(Long userId, String userName, String address, List<TodoTask> items) {
		super();
		this.userId = userId;
		this.userName = userName;
		Address = address;
		this.items = items;
	}


	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
