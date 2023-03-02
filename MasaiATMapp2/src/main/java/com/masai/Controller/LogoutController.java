package com.masai.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Exceptions.UserException;
import com.masai.Model.User;
import com.masai.Repository.UserRepository;

@RestController
@RequestMapping("/masaiAtm/user")
public class LogoutController {
	
	
	@Autowired
	private UserRepository userRepository;

	
	@PostMapping("/logout")
	public ResponseEntity<User> registerUserHandler(Authentication auth ){

		Optional<User> opt = userRepository.findByEmail(auth.getName());
		if(opt.isPresent()) {
			User u = opt.get();
			userRepository.delete(u);
			return new ResponseEntity<User>(u,HttpStatus.OK);
		}else {
			throw new UserException("user does not exist...");
		}
		
	
		
	}


}
