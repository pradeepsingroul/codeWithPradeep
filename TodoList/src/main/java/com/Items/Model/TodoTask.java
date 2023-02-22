package com.Items.Model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class TodoTask {
	
	@Id
	private int taskId;
	private String task;
	private LocalDateTime timeStamp;
	private boolean status;
	
//	@ManyToOne 
//	private User user;

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = LocalDateTime.now();
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}

	@Override
	public String toString() {
		return "TodoTask [task=" + task + ", timeStamp=" + timeStamp + ", status=" + status + ", user=" + "]";
	}

//	public TodoTask(String task, LocalDateTime timeStamp, boolean status, User user) {
//		super();
//		this.task = task;
//		this.timeStamp = timeStamp;
//		this.status = status;
//		this.user = user;
//	}

	public TodoTask(String task, LocalDateTime timeStamp, boolean status) {
		super();
		this.task = task;
		this.timeStamp = timeStamp;
		this.status = status;
	}

	public TodoTask() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

	
}
