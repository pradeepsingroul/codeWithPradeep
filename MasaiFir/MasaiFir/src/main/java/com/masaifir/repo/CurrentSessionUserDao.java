package com.masaifir.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masaifir.model.CurrentSessionUsers;

public interface CurrentSessionUserDao extends JpaRepository<CurrentSessionUsers, Integer>{
	
	public CurrentSessionUsers findByMobileNumber(String mobileNumber);
	
	public CurrentSessionUsers findByUUID(String uUID);

}
