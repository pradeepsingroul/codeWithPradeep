package com.security.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.security.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
