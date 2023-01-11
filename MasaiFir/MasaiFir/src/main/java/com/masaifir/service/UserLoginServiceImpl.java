package com.masaifir.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masaifir.dto.LoginDto;
import com.masaifir.exception.CurrentUserException;
import com.masaifir.exception.FirException;
import com.masaifir.exception.UserException;
import com.masaifir.model.CurrentSessionUsers;
import com.masaifir.model.Fir;
import com.masaifir.model.User;
import com.masaifir.repo.CurrentSessionUserDao;
import com.masaifir.repo.FirDao;
import com.masaifir.repo.UserDao;

import net.bytebuddy.utility.RandomString;

@Service
public class UserLoginServiceImpl implements UserLoginService{

	@Autowired
	private CurrentSessionUserDao currentSessionUserDao;
	
	@Autowired
	private UserDao usrDao;
	
	@Autowired
	private FirDao firDao;
	
	
	
	
	@Override
	public CurrentSessionUsers loginUser(LoginDto loginDto) throws CurrentUserException,UserException {
		
		User checkUser = this.usrDao.findByMobileNumber(loginDto.getMobileNumber());
		
		if(checkUser == null) {
			throw new UserException("User not found with this mobile number " +loginDto.getMobileNumber());
		}
		
		CurrentSessionUsers currentSessionUsers = currentSessionUserDao.findByMobileNumber(loginDto.getMobileNumber());	
		
		if(currentSessionUsers != null) {
			throw new CurrentUserException("user already login");
		}
		
		if(!checkUser.getPassword().equals(loginDto.getPassword())) {
			
			throw new UserException("Password Wrong ");
		
		}
			
			String key = RandomString.make(6);
			
			CurrentSessionUsers savingCurrentSessionUsers = new CurrentSessionUsers(checkUser.getId(), LocalDate.now(), key, checkUser.getMobileNumber());
			
			
		return currentSessionUserDao.save(savingCurrentSessionUsers);
			
		
		
		
		
		
	}
	
	
	@Override
	public List<Fir> firList(String uuid) throws FirException, CurrentUserException {
		

		CurrentSessionUsers loginUser = currentSessionUserDao.findByUUID(uuid);
		
		if(loginUser == null) {
			throw new CurrentUserException("User not found");
		}

		List<Fir> firList= firDao.findAll();
		
		
		if(firList.size()==0) {
			throw new FirException("fir not present");
		}
		
		return firList;
	}
	

}









































