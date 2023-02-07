package com.masai.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.Exceptions.UserExceptions;
import com.masai.Model.LoginDto;
import com.masai.Model.User;

public interface CurruntUserSession extends JpaRepository<LoginDto, String>{

	public Optional<User> findByEmailAndPassword(String email,String password) throws UserExceptions;
}
