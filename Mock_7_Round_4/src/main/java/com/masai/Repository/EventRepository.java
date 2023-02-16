package com.masai.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.Exceptions.EventExceptions;
import com.masai.Modle.Event;

@Repository
public interface EventRepository extends JpaRepository<Event,Integer>{
	
	public List<Event> findByMonth(String type) throws EventExceptions;


}
