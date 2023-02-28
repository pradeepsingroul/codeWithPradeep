package com.masai.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.Model.Account;

import jakarta.persistence.Entity;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer>{

	Optional<Account> findByAccount(String account);
}
