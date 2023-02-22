package com.Items.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Items.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
