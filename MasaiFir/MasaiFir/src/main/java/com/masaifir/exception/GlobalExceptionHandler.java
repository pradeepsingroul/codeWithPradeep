package com.masaifir.exception;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(UserException.class)
	public ResponseEntity<MyErrorDetails> user_Exception(UserException e, WebRequest req) {
		
		MyErrorDetails myErrorDetails = new MyErrorDetails(LocalDate.now(), e.getMessage(), req.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(myErrorDetails, HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(FirException.class)
	public ResponseEntity<MyErrorDetails> user_Exception(FirException e, WebRequest req) {
		
		MyErrorDetails myErrorDetails = new MyErrorDetails(LocalDate.now(), e.getMessage(), req.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(myErrorDetails, HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(CurrentUserException.class)
	public ResponseEntity<MyErrorDetails> user_Exception(CurrentUserException e, WebRequest req) {

		MyErrorDetails myErrorDetails = new MyErrorDetails(LocalDate.now(), e.getMessage(), req.getDescription(false));

		return new ResponseEntity<MyErrorDetails>(myErrorDetails, HttpStatus.BAD_REQUEST);
	}

	

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<MyErrorDetails> myMANVExceptionHandler(MethodArgumentNotValidException me,WebRequest req) {
		
		
		MyErrorDetails myErrorDetails = new MyErrorDetails(LocalDate.now(), me.getBindingResult().getFieldError().getDefaultMessage(),req.getDescription(false));
		return new ResponseEntity<>(myErrorDetails, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> parent_Exception(Exception e, WebRequest req) {

		MyErrorDetails myErrorDetails = new MyErrorDetails(LocalDate.now(), e.getMessage(), req.getDescription(false));

		return new ResponseEntity<MyErrorDetails>(myErrorDetails, HttpStatus.BAD_REQUEST);
	}

}
