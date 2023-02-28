package com.masai.Services;

import java.util.Optional;

import javax.security.auth.login.AccountException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exceptions.AccountExceptions;
import com.masai.Model.Account;
import com.masai.Repository.AccountRepository;


@Service
public class AccountServicesImpl implements AccountServices{
	
	
	@Autowired
	private AccountRepository accountRepository;

	@Override
	public Account openAccount(Account account) throws AccountExceptions {
		// TODO Auto-generated method stub
		Optional<Account> opt = accountRepository.findByAccount(account.getAccount());
		if(opt.isPresent()) {
			throw new AccountExceptions("account already exist");
		}else{
			return accountRepository.save(account);
		}
		
	}

	@Override
	public Account depositAmount(Integer amount,String account) throws AccountExceptions {
		Optional<Account> opt = accountRepository.findByAccount(account);
		if(opt.isPresent()) {
			Account ac  =opt.get();
			ac.setBalance(ac.getBalance()+amount);
			return accountRepository.save(ac);
		}else {
			throw new AccountExceptions("account does not exits");
		}
	}

	@Override
	public Account transferAmount(String ac1, String ac2, Integer amount) throws AccountExceptions {
		Optional<Account> opt1 = accountRepository.findByAccount(ac1);
		Optional<Account> opt2 = accountRepository.findByAccount(ac2);
		if(opt1.isPresent()&&opt2.isPresent()) {
			Account ac11  = opt1.get();
			Account ac21  = opt2.get();
			if(ac11.getBalance()>amount) {
				ac11.setBalance(ac11.getBalance()-amount);
				ac21.setBalance(ac21.getBalance()+amount);
				accountRepository.save(ac11);
				accountRepository.save(ac21);
			}else {
				throw new AccountExceptions("acount does not have sufficient balance");
			}
			return ac21;
			
		}else {
			throw new AccountExceptions("account does not exits");
		}
	}

}
