package com.masai.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.model.Address;
import com.masai.model.User;
import com.masai.repo.AddressRepo;
import com.masai.repo.UserRepo;


@Service
public class AddressSErviceImpl implements AddressServices{

	
	
	@Autowired
	private UserRepo udao;
	
	@Autowired
	private AddressRepo adao;
	
	@Override
	public Address registerAddress(Address address) {
//		address.getUsers();
		List<User> users = address.getUsers();
		for(User u : users) {
			u.setAddress(address);
		}
		return adao.save(address);
	}

}
