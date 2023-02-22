package com.springBoot.Services;

import com.springBoot.Model.Address;
import com.springBoot.Model.Department;

public interface AddressServices {

	public Address register(Address a);

	public Address delete(int aid);
}
