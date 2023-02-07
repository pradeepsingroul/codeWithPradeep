package com.masai.Model;

import java.time.LocalDateTime;

public class MyExceptionDetails {
	
	private LocalDateTime timeStamp;
	private String message;
	private String description;
	
	
	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "MyExceptionDetails [timeStamp=" + timeStamp + ", message=" + message + ", description=" + description
				+ "]";
	}
	public MyExceptionDetails(LocalDateTime timeStamp, String message, String description) {
		super();
		this.timeStamp = timeStamp;
		this.message = message;
		this.description = description;
	}
	public MyExceptionDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
