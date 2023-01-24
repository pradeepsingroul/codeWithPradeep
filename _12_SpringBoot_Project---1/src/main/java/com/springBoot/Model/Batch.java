package com.springBoot.Model;

import org.springframework.stereotype.Component;

@Component
public class Batch {
	
	private String batch = "Java batch";

	@Override
	public String toString() {
		return "Batch [batch=" + batch + "]";
	}
	
	
	

}
