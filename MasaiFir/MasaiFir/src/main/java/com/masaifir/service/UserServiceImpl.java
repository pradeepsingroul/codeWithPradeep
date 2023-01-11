package com.masaifir.service;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masaifir.exception.CurrentUserException;
import com.masaifir.exception.FirException;
import com.masaifir.exception.UserException;
import com.masaifir.model.CurrentSessionUsers;
import com.masaifir.model.Fir;
import com.masaifir.model.User;
import com.masaifir.repo.CurrentSessionUserDao;
import com.masaifir.repo.FirDao;
import com.masaifir.repo.UserDao;

@Service
public class UserServiceImpl implements UserService{

	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private FirDao firDao;
	
	@Autowired
	private CurrentSessionUserDao currentSessionUserDao;
	
	@Override
	public User registerUser(User user) throws UserException {
		
		User existingUSer = this.userDao.findByMobileNumber(user.getMobileNumber());
		
		if(existingUSer!= null) {
			throw new UserException("user already register with this mobile number");
		}
		
		return this.userDao.save(user);
		
	}
	
	@Override
	public List<Fir> firList(String uuid) throws FirException, CurrentUserException {
		

		CurrentSessionUsers loginUser = currentSessionUserDao.findByUUID(uuid);
		
		if(loginUser == null) {
			throw new CurrentUserException("User not found");
		}
		
		
		Optional<User> user = this.userDao.findById(loginUser.getId());
		
		

		
	
		if(user.get().getFir_list().size()==0) {
			throw new FirException("fir not present");
		}
		
		return user.get().getFir_list();
	}
	
	
	
	

	@Override
	public String deleteFir(String uuid, Integer fir_id) throws Exception {
		
		
//		this.firDao.deleteById(fir_id);
//		
//		return "success";
//		
		
		
		
CurrentSessionUsers loginUser = currentSessionUserDao.findByUUID(uuid);
		
		if(loginUser == null) {
			throw new CurrentUserException("User not found");
		}
		
		
		Optional<User> user = this.userDao.findById(loginUser.getId());
		
		
		if(user.get().getFir_list().size()==0) {
			throw new FirException("fir not present");
		}
		
		for(Fir fir: user.get().getFir_list()) {
			
			if(fir.getId()==fir_id) {
				
				 Duration duration = Duration.between(fir.getTimeStamp(), LocalDateTime.now());
				 
				 if(duration.toHours()<24) {
//					 firDao.deleteById(fir.getId());
					 
					 firDao.delete(fir);
					 return "Delete succuessful";
				 }
				 else {
					 throw new Exception("Time Limit Exceeded");
				 }
			}
			
		}
		
		
		
		throw new Exception( "Fir not found");
	}

	

}
