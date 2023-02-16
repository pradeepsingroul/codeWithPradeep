package com.masai.Modle;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Future;

@Entity
public class Event {
	
	@Id
	private int eventId;
	
	private String tital;
	
	@Future
	private LocalDateTime timeStap;
	
	public Event(int eventId, String tital, @Future LocalDateTime timeStap, String month, User user) {
		super();
		this.eventId = eventId;
		this.tital = tital;
		this.timeStap = timeStap;
		this.month = month;
		this.user = user;
	}

	private String month;
	
	@ManyToOne(cascade = CascadeType.ALL )
	private User user;
	

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public String getTital() {
		return tital;
	}

	public void setTital(String tital) {
		this.tital = tital;
	}

	public LocalDateTime getTimeStap() {
		return timeStap;
	}

	public void setTimeStap(LocalDateTime timeStap) {
		this.timeStap = timeStap;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	@Override
	public String toString() {
		return "Event [eventId=" + eventId + ", tital=" + tital + ", timeStap=" + timeStap + ", month=" + month + "]";
	}

	public Event(int eventId, String tital, @Future LocalDateTime timeStap, String month) {
		super();
		this.eventId = eventId;
		this.tital = tital;
		this.timeStap = timeStap;
		this.month = month;
	}

	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
