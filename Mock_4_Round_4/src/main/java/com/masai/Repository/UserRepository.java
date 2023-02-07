package com.masai.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.Exceptions.UserExceptions;
import com.masai.Model.User;
@Repository
public interface UserRepository extends JpaRepository<User, String>{
	
	

	
}
