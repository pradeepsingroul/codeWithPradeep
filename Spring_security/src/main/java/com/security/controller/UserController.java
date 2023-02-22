package com.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.Model.User;
import com.security.Services.UserServices;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserServices us;
	
	
	@PostMapping("/register")
	public ResponseEntity<User> registerUserHandler(@Valid @RequestBody User user){
//		System.out.println("s,kfdgjhdksgv");
		User user1 = us.registerUser(user);
		
		return new ResponseEntity<User>(user1 ,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/getMessage")
	public ResponseEntity<String> getMessageHandler(){
//		System.out.println("s,kfdgjhdksgv");
		String mes = "hey mr.welcome to my universe";
		return new ResponseEntity<String>(mes ,HttpStatus.CREATED);
	}

}
