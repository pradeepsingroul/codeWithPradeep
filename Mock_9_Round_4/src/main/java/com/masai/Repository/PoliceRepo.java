package com.masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Police;

@Repository
public interface PoliceRepo extends JpaRepository<Police, Integer>{

}
