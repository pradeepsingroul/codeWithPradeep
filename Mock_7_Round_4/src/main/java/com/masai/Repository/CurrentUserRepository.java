package com.masai.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.masai.Exceptions.UserExceptions;

import com.masai.Modle.LoginDto;
import com.masai.Modle.User;

@Repository
public interface CurrentUserRepository extends JpaRepository<LoginDto, Integer>{
	
	public Optional<User> findByEmailAndPassword(String email,String password) throws UserExceptions;

	

}

