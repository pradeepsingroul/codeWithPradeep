package com.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.Model.CustomerUser;
import com.security.Repo.UserRepository;
import com.security.Services.UserServices;

import jakarta.validation.Valid;

@RestController

public class LoginController {
	
	@Autowired
	private UserRepository userRepository;

	
	@PostMapping("/signin")
	public ResponseEntity<CustomerUser> registerUserHandler(Authentication auth ){

		CustomerUser user = userRepository.findByEmail(auth.getName()).orElseThrow(() -> new BadCredentialsException("user is not autenticayed..."));
		
		return new ResponseEntity<CustomerUser>(user ,HttpStatus.CREATED);
		
	}
	
}
