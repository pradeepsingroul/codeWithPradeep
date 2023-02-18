package com.masai.Exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.masai.model.MyExceptionDetails;





@ControllerAdvice
public class GlobalException {

	
	@ExceptionHandler(FIRExceptions.class)
	public ResponseEntity<MyExceptionDetails> userException(FIRExceptions fir, WebRequest we){
		
		MyExceptionDetails me = new MyExceptionDetails();
		me.setTimeStamp(LocalDateTime.now());
		me.setMessage(fir.getMessage());
		me.setDescription(we.getDescription(true));
		
		return new ResponseEntity<MyExceptionDetails>(me,HttpStatus.BAD_GATEWAY);
		
	}
	
	@ExceptionHandler(UserExceptions.class)
	public ResponseEntity<MyExceptionDetails> blogException(UserExceptions user, WebRequest we){
		
		MyExceptionDetails me = new MyExceptionDetails();
		me.setTimeStamp(LocalDateTime.now());
		me.setMessage(user.getMessage());
		me.setDescription(we.getDescription(true));
		
		return new ResponseEntity<MyExceptionDetails>(me,HttpStatus.BAD_GATEWAY);
		
	}
	@ExceptionHandler(PoliceExceptions.class)
	public ResponseEntity<MyExceptionDetails> blogException(PoliceExceptions police, WebRequest we){
		
		MyExceptionDetails me = new MyExceptionDetails();
		me.setTimeStamp(LocalDateTime.now());
		me.setMessage(police.getMessage());
		me.setDescription(we.getDescription(true));
		
		return new ResponseEntity<MyExceptionDetails>(me,HttpStatus.BAD_GATEWAY);
		
	}
	@ExceptionHandler(PoliceStationException.class)
	public ResponseEntity<MyExceptionDetails> blogException(PoliceStationException pStation, WebRequest we){
		
		MyExceptionDetails me = new MyExceptionDetails();
		me.setTimeStamp(LocalDateTime.now());
		me.setMessage(pStation.getMessage());
		me.setDescription(we.getDescription(true));
		
		return new ResponseEntity<MyExceptionDetails>(me,HttpStatus.BAD_GATEWAY);
		
	}
	
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyExceptionDetails> exceptions(Exception ex, WebRequest we){
		
		MyExceptionDetails me = new MyExceptionDetails();
		me.setTimeStamp(LocalDateTime.now());
		me.setMessage(ex.getMessage());
		me.setDescription(we.getDescription(true));
		
		return new ResponseEntity<MyExceptionDetails>(me,HttpStatus.BAD_GATEWAY);
		
	}
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<MyExceptionDetails> exceptions(MethodArgumentNotValidException ex, WebRequest we){
		
		MyExceptionDetails me = new MyExceptionDetails();
		me.setTimeStamp(LocalDateTime.now());
		me.setMessage(ex.getMessage());
		me.setDescription(we.getDescription(true));
		
		return new ResponseEntity<MyExceptionDetails>(me,HttpStatus.BAD_GATEWAY);
		
	}
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<MyExceptionDetails> noHandlerEx(NoHandlerFoundException nh, WebRequest we){
		
		MyExceptionDetails me = new MyExceptionDetails();
		me.setTimeStamp(LocalDateTime.now());
		me.setMessage(nh.getMessage());
		me.setDescription(we.getDescription(true));
		
		return new ResponseEntity<MyExceptionDetails>(me,HttpStatus.BAD_GATEWAY);
		
	}
	
}
