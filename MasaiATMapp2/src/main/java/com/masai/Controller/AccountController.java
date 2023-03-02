package com.masai.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Model.Account;
import com.masai.Model.User;
import com.masai.Services.AccountServices;
import com.masai.Services.UserServices;

@RestController
@RequestMapping("/masaiAtm/user")
public class AccountController {
	
	@Autowired
	private AccountServices ac;
	
	@Autowired
	private UserServices us;
	
	
	@GetMapping("/accounts")
	public ResponseEntity<List<Account>> getAllAcounts(@Valid @RequestParam("email") String email){
		List<Account> list = ac.getAccountHandler(email);
		return new ResponseEntity<List<Account>>(list,HttpStatus.OK);
	}
	
	@GetMapping("/accounts/{id}")
	public ResponseEntity<Account> getAccuontById(@Valid @PathVariable("id") String id, @RequestParam("email") String email){
	      Account account = ac.getYourAccountById(email,id);
		return new ResponseEntity<Account>(account,HttpStatus.OK);
	}
	
	@PutMapping("/{email}")
	public ResponseEntity<Account> upDate(@Valid @PathVariable("email") String email, @RequestBody Account account){
	      Account acc = ac.upDateAccountById(email,account);
		  return new ResponseEntity<Account>(acc,HttpStatus.OK);
	}
	
	@DeleteMapping("/accounts/{id}")
	public ResponseEntity<Account> deleteAccount(@Valid @PathVariable("id") String id, @RequestParam("email") String email){
	      Account account = ac.deleteAccountById(email,id);
		return new ResponseEntity<Account>(account,HttpStatus.OK);
	}
	
	
	
	
	
	

}
