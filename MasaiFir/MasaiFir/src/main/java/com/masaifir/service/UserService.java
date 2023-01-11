package com.masaifir.service;

import java.util.List;

import com.masaifir.exception.CurrentUserException;
import com.masaifir.exception.FirException;
import com.masaifir.exception.UserException;
import com.masaifir.model.Fir;
import com.masaifir.model.User;

public interface UserService {
	
	public User registerUser(User user)throws UserException;

	public List<Fir> firList(String uuid) throws FirException, CurrentUserException;
	
	public String deleteFir(String uuid, Integer fir_id) throws CurrentUserException, FirException, Exception;

}
