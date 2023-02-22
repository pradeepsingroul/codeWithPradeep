package com.springBoot.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.springBoot.Model.Address;
import com.springBoot.Model.Department;
import com.springBoot.Repository.Addressdao;
import com.springBoot.Repository.Departmentdao;

public class AddressImpl implements AddressServices{

	@Autowired
	private Addressdao aao;
	
	
	@Override
	public Address register(Address d) {
		return aao.save(d);
	}

	@Override
	public Address delete(int did) {
		Optional<Address> opt = aao.findById(did);
		if(opt.isPresent()) {
			Address d = opt.get();
			aao.deleteById(did);
			return d;
		}else {
			return new Address();
		}
	}

}
