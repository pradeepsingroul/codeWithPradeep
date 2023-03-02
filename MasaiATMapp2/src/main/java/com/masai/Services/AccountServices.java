package com.masai.Services;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.Exceptions.AccountExceptions;
import com.masai.Model.Account;

public interface AccountServices {
	
	List<Account> getAccountHandler(String userMail) throws AccountExceptions;
	  
    Account getYourAccountById(String email,String account) throws AccountExceptions;
    
    Account upDateAccountById(String userMail,Account account) throws AccountExceptions;
	
    Account deleteAccountById(String userMail,String account) throws AccountExceptions;
	
}
