package com.masai.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exceptions.AccountExceptions;
import com.masai.Exceptions.UserException;
import com.masai.Model.Account;
import com.masai.Model.Role;
import com.masai.Model.User;
import com.masai.Repository.AccountRepository;
import com.masai.Repository.UserRepository;



@Service
public class AccountServicesImpl implements AccountServices{
	
	
	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<Account> getAccountHandler(String email) throws AccountExceptions {
		
		Optional<User> opt = userRepository.findByEmail(email);
		if(opt.isPresent()) {
			User AdminOrNot = opt.get();
			if(AdminOrNot.getRole()==Role.ADMIN) {
				List<Account> accounts = accountRepository.findAll();
				return accounts;
			}{
				throw new UserException("You are not admin.....");
			}
		}else {
			throw new UserException("user does not exist....");
		}
	
	}

	@Override
	public Account getYourAccountById(String userEmail,String account) throws AccountExceptions {
		
		Optional<User> opt = userRepository.findByEmail(userEmail);
		if(opt.isPresent()) {
			User AdminOrNot = opt.get();
			if(AdminOrNot.getRole()==Role.ADMIN) {
				Optional<Account> opt2 = accountRepository.findByAccountNumber(account);
				if(opt.isEmpty()) {
					throw new AccountExceptions("Account did not opened for you...");
				}else {
					Account ac = opt2.get();
					return ac;
				}
			}else{
				throw new UserException("You are not admin.....");
			}
		}else {
			throw new UserException("user does not exist....");
		}
		
		
	}



	@Override
	public Account deleteAccountById(String userEmail,String account) throws AccountExceptions {
		Optional<User> opt = userRepository.findByEmail(userEmail);
		if(opt.isPresent()) {
			User AdminOrNot = opt.get();
			if(AdminOrNot.getRole()==Role.ADMIN) {
				Optional<Account> opt2 = accountRepository.findByAccountNumber(account);
				if(opt.isEmpty()) {
					throw new AccountExceptions("Account did not opened for you...");
				}else {
					Account a  = opt2.get();
					accountRepository.delete(opt2.get());
					return a;
				}
			}else{
				throw new UserException("You are not admin.....");
			}
		}else {
			throw new UserException("user does not exist....");
		}
		
	}

	@Override
	public Account upDateAccountById(String userMail, Account account) throws AccountExceptions {
		Optional<User> opt = userRepository.findByEmail(userMail);
		if(opt.isPresent()) {
			User AdminOrNot = opt.get();
			if(AdminOrNot.getRole()==Role.ADMIN) {
				Optional<Account> opt2 = accountRepository.findByAccountNumber(account.getAccountNumber());
				if(opt.isEmpty()) {
					throw new AccountExceptions("Account did not opened for you...");
				}else {
					return accountRepository.save(opt2.get());
				}
			}else{
				throw new UserException("You are not admin.....");
			}
		}else {
			throw new UserException("user does not exist....");
		}
		
	}
	
}
