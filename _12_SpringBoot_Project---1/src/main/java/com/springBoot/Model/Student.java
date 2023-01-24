package com.springBoot.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Component
@Data
@AllArgsConstructor
@ToString
public class Student {
	
	private String name;
	private int roll;
	private int marks;
	
	@Autowired(required = false)
	private Batch b;

	public Batch getB() {
		return b;
	}

	public void setB(Batch b) {
		this.b = b;
	}
	
	
	
	

}
