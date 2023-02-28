package com.masai.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Model.User;
import com.masai.Services.UserServices;

import jakarta.validation.Valid;

@RestController
public class UserController {
	
	@Autowired
	private UserServices us;
	
	@Autowired
	private PasswordEncoder pw;

	
	@PostMapping("/register")
	public ResponseEntity<User> registerUserHandler(@Valid @RequestBody User user){
		user.setPassword(pw.encode(user.getPassword()));
		User user1 = us.registerUserHandler(user);
		
		return new ResponseEntity<User>(user1 ,HttpStatus.CREATED);
		
	}

	@GetMapping("/users/{field}/{order}")
	public ResponseEntity<List<User>> returnSortedlist(@Valid @PathVariable("field") String field , @PathVariable("order") String order) {
		
		List<User> users = us.getSortedUser(field, order);
		return new ResponseEntity<List<User>>(users,HttpStatus.OK);
	}
	
	@GetMapping("/users/{pageNo}/{noOfRec}")
	public ResponseEntity<List<User>> returnSortedUserByPagesEntity(@Valid @PathVariable("pageNo") Integer pageNo , @PathVariable("noOfRec") Integer noOfRec) {
		
		List<User> users = us.getParticularPageList(pageNo, noOfRec);
		return new ResponseEntity<List<User>>(users,HttpStatus.OK);
	}
	
	@GetMapping("/users/{pageNo}/{noOfRec}/{field}/{order}")
	public ResponseEntity<List<User>> returnSortedButParticularPage(@Valid @PathVariable("pageNo") Integer pageNo , @PathVariable("noOfRec") Integer noOfRec,@PathVariable("field") String field , @PathVariable("order") String order) {
		
		List<User> users = us.getparticularPageBySorted(pageNo, pageNo, field, order);
		return new ResponseEntity<List<User>>(users,HttpStatus.OK);
	}
	
}
