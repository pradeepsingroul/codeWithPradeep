package com.masai.Model;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Account {
	
	@Id
	private String accountNumber;

	private String ifsc;
	
	private LocalDateTime accountOpen;
	
	private Integer balance;
	
	private String bank;
	
	@OneToOne(cascade = CascadeType.ALL)
	private User user;

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public LocalDateTime getAccountOpen() {
		return accountOpen;
	}

	public void setAccountOpen(LocalDateTime accountOpen) {
		this.accountOpen = accountOpen;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", ifsc=" + ifsc + ", accountOpen=" + accountOpen
				+ ", balance=" + balance + ", bank=" + bank + "]";
	}

	public Account(String accountNumber, String ifsc, LocalDateTime accountOpen, Integer balance, String bank) {
		super();
		this.accountNumber = accountNumber;
		this.ifsc = ifsc;
		this.accountOpen = accountOpen;
		this.balance = balance;
		this.bank = bank;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
