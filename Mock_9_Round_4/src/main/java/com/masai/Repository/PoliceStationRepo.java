package com.masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.Exceptions.PoliceExceptions;

public interface PoliceStationRepo extends JpaRepository<PoliceExceptions, Integer>{

}
