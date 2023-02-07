package com.masai.Services;

import java.util.List;

import com.masai.Exceptions.BlogExceptions;
import com.masai.Model.Blog;
import com.masai.Model.Category;

public interface BlogService {
	
	public Blog publisBlog(Blog b) throws BlogExceptions ;
	
	public List<Blog> getByCategory(Category c) throws BlogExceptions ;
		
	

}
