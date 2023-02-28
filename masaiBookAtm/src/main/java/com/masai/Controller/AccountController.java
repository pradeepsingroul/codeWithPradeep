package com.masai.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Model.Account;
import com.masai.Model.User;
import com.masai.Services.AccountServices;
import com.masai.Services.UserServices;

import jakarta.validation.Valid;

@RestController
public class AccountController {
	
	@Autowired
	private AccountServices ac;
	
	@Autowired
	private UserServices us;
	
	@PostMapping("/masaiAtm/user/account")
	public ResponseEntity<Account> registerUserHandler(@Valid @RequestBody Account account){
		
		Account ac1 = 	ac.openAccount(account);
		return new ResponseEntity<Account>(ac1,HttpStatus.OK);
	}
	
	@PutMapping("/masaiAtm/user/transfer/{accountID}/{amount}")
	public ResponseEntity<Account> depositeAmount(@Valid @PathVariable("accountID") String accountid , @PathVariable("amount") Integer amount) {
		
		Account ac1 = 	ac.depositAmount(amount,accountid);
		return new ResponseEntity<Account>(ac1,HttpStatus.OK);
	}
	
	

}
