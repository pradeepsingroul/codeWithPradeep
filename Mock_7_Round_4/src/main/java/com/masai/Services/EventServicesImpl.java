package com.masai.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exceptions.EventExceptions;
import com.masai.Exceptions.UserExceptions;
import com.masai.Modle.Event;
import com.masai.Modle.User;
import com.masai.Repository.EventRepository;

@Service
public class EventServicesImpl implements EventServices{

	@Autowired
	private EventRepository edao;
	
	
	@Override
	public Event registerEvent(Event event) throws EventExceptions {
		Optional<Event> opt = edao.findById(event.getEventId());
		Event u = opt.get();
		if(opt.isPresent()){
			throw new EventExceptions("events already present.....");
		    
		}else {
			return edao.save(u);
		}
	}

	@Override
	public Event updateEvent(Event event) throws EventExceptions {
		Optional<Event> opt = edao.findById(event.getEventId());
		Event u = opt.get();
		if(opt.isPresent()){
			return edao.save(u);
		    
		}else {
			throw new EventExceptions("events already present.....");
		}
	}

	@Override
	public Event deletEvent(int id) throws EventExceptions {
		Optional<Event> opt = edao.findById(id);
		Event u = opt.get();
		if(opt.isPresent()){
			edao.deleteById(id);
			return u;
		    
		}else {
			throw new EventExceptions("events does not exists.....");
		}
	}

}
