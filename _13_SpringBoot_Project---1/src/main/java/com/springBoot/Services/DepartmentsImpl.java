package com.springBoot.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBoot.Model.Department;
import com.springBoot.Model.Student;
import com.springBoot.Repository.Departmentdao;

@Service
public class DepartmentsImpl implements DepartmentServices{

	@Autowired
	private Departmentdao dao;
	
	
	@Override
	public Department register(Department d) {
		return dao.save(d);
	}

	@Override
	public Department delete(int did) {
		Optional<Department> opt = dao.findById(did);
		if(opt.isPresent()) {
			Department d = opt.get();
			dao.deleteById(did);
			return d;
		}else {
			return new Department();
		}
	}

}
