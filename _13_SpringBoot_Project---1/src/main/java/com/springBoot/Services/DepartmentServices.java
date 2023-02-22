package com.springBoot.Services;

import com.springBoot.Model.Department;

public interface DepartmentServices {
	
	public Department register(Department d);
	
	public Department delete(int did);

}
