package com.masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.Model.Blog;

public interface BlogRepository extends JpaRepository<Blog, Integer>{

}
