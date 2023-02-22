package com.springBoot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springBoot.Model.Address;

@Repository
public interface Addressdao  extends JpaRepository<Address, Integer>{

}
