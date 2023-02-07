package com.masai.Services;

import java.util.List;

import com.masai.Exceptions.UserExceptions;
import com.masai.Model.Blog;
import com.masai.Model.Comment;
import com.masai.Model.LoginDto;
import com.masai.Model.User;

public interface userService {
	
	public User registerUser(User user) throws UserExceptions ;
	
	public User loginUser(LoginDto user) throws UserExceptions;

	public List<Blog> getBlogs(String email) throws UserExceptions ;
	
	public Blog deleteBlogs(String email,Integer blogId) throws UserExceptions ;
	
	public Comment deleteComment(String email,Integer commentId) throws UserExceptions ;
}
