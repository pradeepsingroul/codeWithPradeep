package com.masai.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Model.Bank;
import com.masai.Services.BankServices;

import jakarta.validation.Valid;

@RestController
public class BankController {

	@Autowired
	private BankServices bs;
	
	
	public ResponseEntity<Bank> register(@Valid @RequestBody Bank bank){
		Bank bank1  = bs.registerBank(bank);
		return new ResponseEntity<Bank>(bank1,HttpStatus.CREATED);
		
		
	}
	
}
