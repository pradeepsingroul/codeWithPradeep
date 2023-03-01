package com.FrightBox.Exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;


public class ErrorDetails {

    private String message;

    private String description;

    private LocalDateTime timeStamp;

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

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

	@Override
	public String toString() {
		return "ErrorDetails [message=" + message + ", description=" + description + ", timeStamp=" + timeStamp + "]";
	}

	public ErrorDetails(String message, String description, LocalDateTime timeStamp) {
		super();
		this.message = message;
		this.description = description;
		this.timeStamp = timeStamp;
	}

	public ErrorDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
    
}
