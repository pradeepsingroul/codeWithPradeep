package com.springBoot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springBoot.Model.Student;
@Repository
public interface Studentdao extends JpaRepository<Student, Integer>{

}
