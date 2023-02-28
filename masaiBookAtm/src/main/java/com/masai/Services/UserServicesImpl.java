package com.masai.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.stereotype.Service;

import com.masai.Exceptions.UserException;
import com.masai.Model.LoginDTO;
import com.masai.Model.User;
import com.masai.Repository.UserRepository;


@Service
public class UserServicesImpl implements UserServices{
	
	@Autowired
	private UserRepository userRepository;
	
	

	@Override
	public User registerUserHandler(User user) throws UserException {
		Optional<User> opt = userRepository.findByEmail(user.getEmail());
		if(opt.isEmpty()) {
			return userRepository.save(user);
		}else {
			throw new UserException("user already exist");
		}
	}

	@Override
	public User LoginUser(LoginDTO loginDto) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getSortedUser(String paramenter, String order) throws UserException {
		// TODO Auto-generated method stub
		List<User> list = userRepository.getSortedList(paramenter, order);
		return list;
	}

	@Override
	public List<User> getParticularPageList(Integer pages, Integer nuOfPages) throws UserException {
		List<User> list = userRepository.getSpecificPages(pages, nuOfPages);
		return list;
	}

	@Override
	public List<User> getparticularPageBySorted(Integer pages, Integer nuOfPages ,String field, String order) throws UserException {
		List<User> list = userRepository.getSortedSpecificPages(pages, nuOfPages, field, order);
		return list;
	}

}
