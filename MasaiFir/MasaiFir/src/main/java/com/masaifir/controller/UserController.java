package com.masaifir.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masaifir.exception.CurrentUserException;
import com.masaifir.exception.FirException;
import com.masaifir.exception.UserException;
import com.masaifir.model.Fir;
import com.masaifir.model.User;
import com.masaifir.repo.UserDao;
import com.masaifir.service.FirService;
import com.masaifir.service.UserService;


@RestController
public class UserController {
	
	
	@Autowired
	private UserService userService;
	
	
	
	
	@PostMapping("/addUser")
	public ResponseEntity<User> addUser(@Valid @RequestBody User user) throws UserException{
		
		User saveUSer = this.userService.registerUser(user);
		
		return new ResponseEntity<User>(saveUSer,HttpStatus.CREATED);
		
		
	}
	
	@GetMapping("/getListOfFir")
	public ResponseEntity<List<Fir>> addUser(@RequestParam String uuid) throws FirException, CurrentUserException   {
		

List<Fir> firList = userService.firList(uuid);
		
		return new ResponseEntity<List<Fir>>(firList,HttpStatus.ACCEPTED);
		
		
	}
	
	
	
	
//	public String deleteFir(String uuid, Integer fir_id) throws CurrentUserException, FirException;
	@DeleteMapping("/deleteFir")
	public ResponseEntity<String> deleteFir(@RequestParam String uuid,@RequestParam Integer firid) throws Exception   {
		

String result = this.userService.deleteFir(uuid, firid)
;		
		return new ResponseEntity<String>(result,HttpStatus.OK);
		
		
	}

}
