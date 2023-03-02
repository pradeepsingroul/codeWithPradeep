package com.masai.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.Model.Account;



@Repository
public interface AccountRepository extends JpaRepository<Account, Integer>{

	Optional<Account> findByAccountNumber(String account);
}
