package com.masai.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.masai.Exceptions.EventExceptions;
import com.masai.Exceptions.UserExceptions;
import com.masai.Modle.Event;
import com.masai.Modle.LoginDto;
import com.masai.Modle.User;
import com.masai.Repository.CurrentUserRepository;
import com.masai.Repository.EventRepository;
import com.masai.Repository.UserRepository;

@Service
public class UserServicesImpl implements UserServices{
	
	@Autowired
	private UserRepository udao;
	
	@Autowired
	private CurrentUserRepository cdao;
	
	@Autowired
	private EventRepository edao;

	@JsonIgnore
	@Override
	public User registerUser(User user) throws UserExceptions {
		Optional<User> opt = udao.findById(user.getEmail());
		User u = opt.get();
		if(opt.isPresent()){
			throw new UserExceptions("User already present.....");
		    
		}else {
			
			for(int i =0; i<user.getEvents().size(); i++) {
				user.getEvents().get(i).setUser(user);
			}
			return udao.save(user);
		}
	}

	@Override
	public User loginUser(LoginDto user) throws UserExceptions {
		Optional<User> opt = cdao.findByEmailAndPassword(user.getEmail(),user.getPassword());
		if(opt.isPresent()) {
			throw new UserExceptions("User already loggedIn......");
		}else {
			cdao.save(user);
			Optional<User> optUser = udao.findById(user.getEmail());
			return optUser.get();
		}
	}

	@Override
	public List<Event> getEvents(String email) throws EventExceptions {
		Optional<User> opt = udao.findById(email);
		if(opt.isEmpty()) {
			throw new EventExceptions("Events doesnot exists..........");
		}else {
			return opt.get().getEvents();
		}
	}

	@Override
	public List<Event> getEventsByType(String type) throws EventExceptions {
		List<Event> opt = edao.findByMonth(type);
		if(opt.isEmpty()) {
			throw new EventExceptions("exception doesnot exists..........");
		}else {
			return opt;
		}
	}

	@JsonIgnore
	@Override
	public User updateUserCreadentials(User user) throws UserExceptions {
		// TODO Auto-generated method stub
		Optional<User> opt = udao.findById(user.getEmail());
		User u = opt.get();
		if(opt.isPresent()){
			for(int i =0; i<user.getEvents().size(); i++) {
				user.getEvents().get(i).setUser(user);
			}
			return udao.save(user);
		    
		}else {
			throw new UserExceptions("User already present.....");
			
		}
	}

}
