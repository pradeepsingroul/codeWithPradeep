package com.springBoot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springBoot.Model.Department;
@Repository
public interface Departmentdao extends JpaRepository<Department, Integer>{

}
