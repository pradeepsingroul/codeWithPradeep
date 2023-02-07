package com.masai.Exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.masai.Model.MyExceptionDetails;

@ControllerAdvice
public class GlobalException {

	
	@ExceptionHandler(UserExceptions.class)
	public ResponseEntity<MyExceptionDetails> userException(UserExceptions user, WebRequest we){
		
		MyExceptionDetails me = new MyExceptionDetails();
		me.setTimeStamp(LocalDateTime.now());
		me.setMessage(user.getMessage());
		me.setDescription(we.getDescription(true));
		
		return new ResponseEntity<MyExceptionDetails>(me,HttpStatus.BAD_GATEWAY);
		
	}
	
	@ExceptionHandler(BlogExceptions.class)
	public ResponseEntity<MyExceptionDetails> blogException(BlogExceptions blog, WebRequest we){
		
		MyExceptionDetails me = new MyExceptionDetails();
		me.setTimeStamp(LocalDateTime.now());
		me.setMessage(blog.getMessage());
		me.setDescription(we.getDescription(true));
		
		return new ResponseEntity<MyExceptionDetails>(me,HttpStatus.BAD_GATEWAY);
		
	}
	
	@ExceptionHandler(CommentExceptions.class)
	public ResponseEntity<MyExceptionDetails> commentExceptions(CommentExceptions comment, WebRequest we){
		
		MyExceptionDetails me = new MyExceptionDetails();
		me.setTimeStamp(LocalDateTime.now());
		me.setMessage(comment.getMessage());
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
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<MyExceptionDetails> noHandlerEx(NoHandlerFoundException nh, WebRequest we){
		
		MyExceptionDetails me = new MyExceptionDetails();
		me.setTimeStamp(LocalDateTime.now());
		me.setMessage(nh.getMessage());
		me.setDescription(we.getDescription(true));
		
		return new ResponseEntity<MyExceptionDetails>(me,HttpStatus.BAD_GATEWAY);
		
	}
	
}
