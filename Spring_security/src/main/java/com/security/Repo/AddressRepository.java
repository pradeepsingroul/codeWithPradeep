package com.security.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.security.Model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer>{

}
