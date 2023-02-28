package com.masai.Model;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Account {
	
	@Id
	private String account;

	private String ifsc;
	
	private LocalDateTime accountopen;
	
	private Integer balance;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Bank bank;
	
	@OneToOne
	private User user;

	public Account(String account, String ifsc, LocalDateTime accountopen, Integer balance, Bank bank, User user) {
		super();
		this.account = account;
		this.ifsc = ifsc;
		this.accountopen = accountopen;
		this.balance = balance;
		this.bank = bank;
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public LocalDateTime getAccountopen() {
		return accountopen;
	}

	public void setAccountopen(LocalDateTime accountopen) {
		this.accountopen = accountopen;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	@Override
	public String toString() {
		return "Account [account=" + account + ", ifsc=" + ifsc + ", accountopen=" + accountopen + ", balance="
				+ balance + ", bank=" + bank + ", user=" + user + "]";
	}

	public Account(String account, String ifsc, LocalDateTime accountopen, Integer balance, Bank bank) {
		super();
		this.account = account;
		this.ifsc = ifsc;
		this.accountopen = accountopen;
		this.balance = balance;
		this.bank = bank;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
