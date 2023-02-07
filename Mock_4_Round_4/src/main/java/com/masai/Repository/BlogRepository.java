package com.masai.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.Exceptions.BlogExceptions;
import com.masai.Exceptions.UserExceptions;
import com.masai.Model.Blog;
import com.masai.Model.Category;
import com.masai.Model.User;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Integer>{

	public List<Blog> findAllByCategory(Category c) throws BlogExceptions;
	
}
