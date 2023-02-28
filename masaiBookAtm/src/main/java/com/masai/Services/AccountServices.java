package com.masai.Services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.Exceptions.AccountExceptions;
import com.masai.Model.Account;

public interface AccountServices {
	
	Account openAccount(Account account) throws AccountExceptions;
	
	Account depositAmount(Integer amount,String account) throws AccountExceptions;
	
	Account transferAmount(String ac1, String ac2,Integer amount) throws AccountExceptions;
	
	
}
