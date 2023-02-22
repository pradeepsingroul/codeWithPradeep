package com.masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.FIR;

@Repository
public interface FIRRepo extends JpaRepository<FIR, Integer>{

}
