package com.masaifir.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masaifir.exception.CurrentUserException;
import com.masaifir.exception.UserException;
import com.masaifir.model.CurrentSessionUsers;
import com.masaifir.model.Fir;
import com.masaifir.model.User;
import com.masaifir.repo.CurrentSessionUserDao;
import com.masaifir.repo.FirDao;
import com.masaifir.repo.UserDao;

@Service
public class FirServiceImpl implements FirService{

	
	@Autowired
	private FirDao firDao;
	
	@Autowired
	private CurrentSessionUserDao currentSessionUserDao;
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public Fir addFir(Fir fir, String uuid) throws UserException, CurrentUserException {

	CurrentSessionUsers loginUser = currentSessionUserDao.findByUUID(uuid);
	
	if(loginUser == null) {
		throw new CurrentUserException("User not found");
	}
	
	
	
	User user = this.userDao.findByMobileNumber(loginUser.getMobileNumber());
	
	fir.setUser(user);
	
	
	
	Fir saveFir = this.firDao.save(fir);
	
	user.getFir_list().add(saveFir);
	
	
	this.userDao.save(user);
	return saveFir;
			
	}

	
	
}
































