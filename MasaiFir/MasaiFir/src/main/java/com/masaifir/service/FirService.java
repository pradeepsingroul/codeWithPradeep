package com.masaifir.service;

import java.util.List;

import com.masaifir.exception.CurrentUserException;
import com.masaifir.exception.FirException;
import com.masaifir.exception.UserException;
import com.masaifir.model.Fir;

public interface FirService {
	
	public Fir addFir(Fir fir,String uuid)throws UserException, CurrentUserException;

}
