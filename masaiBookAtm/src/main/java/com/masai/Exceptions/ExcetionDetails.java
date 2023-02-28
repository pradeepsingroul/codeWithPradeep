package com.masai.Exceptions;

import java.time.LocalDateTime;

public class ExcetionDetails {
	
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
		return "ExcetionDetails [timeStamp=" + timeStamp + ", message=" + message + ", description=" + description
				+ "]";
	}

	public ExcetionDetails(LocalDateTime timeStamp, String message, String description) {
		super();
		this.timeStamp = timeStamp;
		this.message = message;
		this.description = description;
	}

	public ExcetionDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
