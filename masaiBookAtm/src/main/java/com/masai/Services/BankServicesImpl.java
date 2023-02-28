package com.masai.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exceptions.BankExceptions;
import com.masai.Model.Bank;
import com.masai.Repository.BankRepository;

@Service
public class BankServicesImpl implements BankServices{
	
	@Autowired
	private BankRepository bankRepository;

	@Override
	public Bank registerBank(Bank bank) throws BankExceptions {

		Optional<Bank> opt = bankRepository.findByName(bank.getName());
		if(opt.isEmpty()) {
			return bankRepository.save(bank);
		}else {
			throw new BankExceptions("bank already exist...");
		}
	}

}
