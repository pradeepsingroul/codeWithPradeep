package com.masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.PoliceStation;



@Repository
public interface PoliceStationRepo extends JpaRepository<PoliceStation, Integer>{

}
