package com.masai.Exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import com.masai.Model.MyExceptionDetails;


public class UserExceptions extends RuntimeException{
	
	public UserExceptions(String message) {
		
		super(message);
		
	}
   public UserExceptions() {
		
		
   }

}
