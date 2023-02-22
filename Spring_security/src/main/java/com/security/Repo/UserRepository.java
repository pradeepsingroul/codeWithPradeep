package com.security.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.security.Model.CustomerUser;

@Repository
public interface UserRepository extends JpaRepository<CustomerUser, Integer>{

	public Optional<CustomerUser> findByEmail(String email);
	
}
