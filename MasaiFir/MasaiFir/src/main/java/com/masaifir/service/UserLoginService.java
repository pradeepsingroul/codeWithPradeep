package com.masaifir.service;

import java.util.List;

import com.masaifir.dto.LoginDto;
import com.masaifir.exception.CurrentUserException;
import com.masaifir.exception.FirException;
import com.masaifir.exception.UserException;
import com.masaifir.model.CurrentSessionUsers;
import com.masaifir.model.Fir;

public interface UserLoginService {

	public CurrentSessionUsers loginUser(LoginDto loginDto) throws CurrentUserException, UserException;

	List<Fir> firList(String uuid) throws FirException, CurrentUserException;
	
}
