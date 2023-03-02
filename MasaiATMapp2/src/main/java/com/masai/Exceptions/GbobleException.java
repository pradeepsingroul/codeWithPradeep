package com.masai.Exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;


@ControllerAdvice
public class GbobleException {

	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ExcetionDetails> AllExcepionsHandler(Exception e,WebRequest we){
		
		ExcetionDetails ex = new ExcetionDetails();
		ex.setDescription(we.getDescription(true));
		ex.setTimeStamp(LocalDateTime.now());
		ex.setMessage(e.getMessage());
		
		return new ResponseEntity<ExcetionDetails>(ex, HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ExcetionDetails> MethodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e,WebRequest we){
		
		ExcetionDetails ex = new ExcetionDetails();
		ex.setDescription(we.getDescription(true));
		ex.setTimeStamp(LocalDateTime.now());
		ex.setMessage(e.getMessage());
		
		return new ResponseEntity<ExcetionDetails>(ex, HttpStatus.BAD_GATEWAY);
		
	}
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<ExcetionDetails> NoHandlerFoundExceptionHandler(NoHandlerFoundException e,WebRequest we){
		
		ExcetionDetails ex = new ExcetionDetails();
		ex.setDescription(we.getDescription(true));
		ex.setTimeStamp(LocalDateTime.now());
		ex.setMessage(e.getMessage());
		
		return new ResponseEntity<ExcetionDetails>(ex, HttpStatus.BAD_GATEWAY);
		
	}
	
	@ExceptionHandler(UserException.class)
	public ResponseEntity<ExcetionDetails> UserExceptionHandler(UserException e,WebRequest we){
		
		ExcetionDetails ex = new ExcetionDetails();
		ex.setDescription(we.getDescription(true));
		ex.setTimeStamp(LocalDateTime.now());
		ex.setMessage(e.getMessage());
		
		return new ResponseEntity<ExcetionDetails>(ex, HttpStatus.BAD_GATEWAY);
		
	}
	
	
	
	
	@ExceptionHandler(AccountExceptions.class)
	public ResponseEntity<ExcetionDetails> AccountExceptionskHandler(AccountExceptions e,WebRequest we){
		
		ExcetionDetails ex = new ExcetionDetails();
		ex.setDescription(we.getDescription(true));
		ex.setTimeStamp(LocalDateTime.now());
		ex.setMessage(e.getMessage());
		
		return new ResponseEntity<ExcetionDetails>(ex, HttpStatus.BAD_GATEWAY);
		
	}
	
	
	
	
}
