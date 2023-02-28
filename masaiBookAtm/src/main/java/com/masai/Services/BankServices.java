package com.masai.Services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.Exceptions.BankExceptions;
import com.masai.Exceptions.UserException;
import com.masai.Model.Bank;
import com.masai.Model.User;

public interface BankServices {
	
	Bank registerBank(Bank bank)throws BankExceptions;
	
	

}
