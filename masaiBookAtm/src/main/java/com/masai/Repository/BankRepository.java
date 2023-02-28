package com.masai.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.Model.Bank;

@Repository
public interface BankRepository extends JpaRepository<Bank, Integer>{

	Optional<Bank> findByName(String name);
}
