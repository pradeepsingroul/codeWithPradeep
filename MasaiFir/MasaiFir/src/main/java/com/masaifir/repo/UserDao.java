package com.masaifir.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masaifir.model.User;

public interface UserDao extends JpaRepository<User, Integer>{
	
	public User findByMobileNumber(String mobileNumber);

}
