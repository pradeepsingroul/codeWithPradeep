package com.pdf.Exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;


@ControllerAdvice
public class GlobalException {
	
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ExceptionDetails> AllExcepionsHandler(Exception e,WebRequest we){
		
		ExceptionDetails ex = new ExceptionDetails();
		ex.setDescription(we.getDescription(true));
		ex.setTimeStamp(LocalDateTime.now());
		ex.setMessage(e.getMessage());
		
		return new ResponseEntity<ExceptionDetails>(ex, HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ExceptionDetails> MethodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e,WebRequest we){
		
		ExceptionDetails ex = new ExceptionDetails();
		ex.setDescription(we.getDescription(true));
		ex.setTimeStamp(LocalDateTime.now());
		ex.setMessage(e.getMessage());
		
		return new ResponseEntity<ExceptionDetails>(ex, HttpStatus.BAD_GATEWAY);
		
	}
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<ExceptionDetails> NoHandlerFoundExceptionHandler(NoHandlerFoundException e,WebRequest we){
		
		ExceptionDetails ex = new ExceptionDetails();
		ex.setDescription(we.getDescription(true));
		ex.setTimeStamp(LocalDateTime.now());
		ex.setMessage(e.getMessage());
		
		return new ResponseEntity<ExceptionDetails>(ex, HttpStatus.BAD_GATEWAY);
		
	}
	
	@ExceptionHandler(SellerExceptions.class)
	public ResponseEntity<ExceptionDetails> UserExceptionHandler(SellerExceptions e,WebRequest we){
		
		ExceptionDetails ex = new ExceptionDetails();
		ex.setDescription(we.getDescription(true));
		ex.setTimeStamp(LocalDateTime.now());
		ex.setMessage(e.getMessage());
		
		return new ResponseEntity<ExceptionDetails>(ex, HttpStatus.BAD_GATEWAY);
		
	}
	
	
	
	
	@ExceptionHandler(BuyerExceptions.class)
	public ResponseEntity<ExceptionDetails> AccountExceptionskHandler(BuyerExceptions e,WebRequest we){
		
		ExceptionDetails ex = new ExceptionDetails();
		ex.setDescription(we.getDescription(true));
		ex.setTimeStamp(LocalDateTime.now());
		ex.setMessage(e.getMessage());
		
		return new ResponseEntity<ExceptionDetails>(ex, HttpStatus.BAD_GATEWAY);
		
	}
	
	@ExceptionHandler(ItemExceptions.class)
	public ResponseEntity<ExceptionDetails> AccountExceptionskHandler(ItemExceptions e,WebRequest we){
		
		ExceptionDetails ex = new ExceptionDetails();
		ex.setDescription(we.getDescription(true));
		ex.setTimeStamp(LocalDateTime.now());
		ex.setMessage(e.getMessage());
		
		return new ResponseEntity<ExceptionDetails>(ex, HttpStatus.BAD_GATEWAY);
		
	}
	
	


}
