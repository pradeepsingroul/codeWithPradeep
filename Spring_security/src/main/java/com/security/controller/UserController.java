package com.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.Model.CustomerUser;
import com.security.Services.UserServices;

import jakarta.validation.Valid;

@RestController
public class UserController {
	
	@Autowired
	private UserServices us;
	
	@Autowired
	private PasswordEncoder pw;
	
	
	@PostMapping("/register")
	public ResponseEntity<CustomerUser> registerUserHandler(@Valid @RequestBody CustomerUser user){
//		System.out.println("s,kfdgjhdksgv");
		user.setPassword(pw.encode(user.getPassword()));
		CustomerUser user1 = us.registerUser(user);
		
		return new ResponseEntity<CustomerUser>(user1 ,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/getMessage")
	public ResponseEntity<String> getMessageHandler(){
//		System.out.println("s,kfdgjhdksgv");
		String mes = "hey mr.welcome to my universe";
		return new ResponseEntity<String>(mes ,HttpStatus.CREATED);
	}

}
