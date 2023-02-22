package com.springBoot.Services;

import java.lang.StackWalker.Option;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBoot.Model.Student;
import com.springBoot.Repository.Studentdao;

@Service
public class StudentServicesImpl implements StudentServicess{
	
	@Autowired
	private Studentdao sdao;
	
	public Student register(Student s) {
		return sdao.save(s);
	}
	
	public Student delete(int sid) {
	 
		Optional<Student> opt = sdao.findById(sid);
		Student s = opt.get();
		if(opt.isPresent()) {
		
			sdao.deleteById(sid);
			return s;
		}else {
			return new Student();
		}
	}
	
	

}
