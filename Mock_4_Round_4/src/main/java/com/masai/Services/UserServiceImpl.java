package com.masai.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.masai.Exceptions.BlogExceptions;
import com.masai.Exceptions.UserExceptions;
import com.masai.Model.Blog;
import com.masai.Model.Comment;
import com.masai.Model.LoginDto;
import com.masai.Model.User;
import com.masai.Repository.BlogRepository;
import com.masai.Repository.CommentRepository;
import com.masai.Repository.CurruntUserSession;
import com.masai.Repository.UserRepository;

@Service
public class UserServiceImpl implements userService{
	
	@Autowired
	private UserRepository udao;
	
	@Autowired
	private BlogRepository bdao;
	
	@Autowired
	private CommentRepository cdao;
	
	@Autowired
	private CurruntUserSession curDao; 

	@JsonIgnore
	@Override
	public User registerUser(User user) throws UserExceptions {
		Optional<User> opt = udao.findById(user.getEmail());
		User u = opt.get();
		if(opt.isPresent()){
			throw new UserExceptions("User already present.....");
		    
		}else {
			
			for(int i =0; i<user.getComments().size(); i++) {
				user.getComments().get(i).getUsers().add(user);
			}
			for(int i =0; i<user.getBlogs().size(); i++) {
				user.getBlogs().get(i).setUser(user);
			}
			return udao.save(user);
		}
	}

	@Override
	public User loginUser(LoginDto user) throws UserExceptions {
		Optional<User> opt = curDao.findByEmailAndPassword(user.getEmail(),user.getPassword());
		if(opt.isPresent()) {
			throw new UserExceptions("User already loggedIn......");
		}else {
			curDao.save(user);
			Optional<User> optUser = udao.findById(user.getEmail());
			return optUser.get();
		}
		
	}

	@Override
	public List<Blog> getBlogs(String email) throws UserExceptions {
		Optional<User> opt = udao.findById(email);
		if(opt.isEmpty()) {
			throw new UserExceptions("User doesnot exists..........");
		}else {
			return opt.get().getBlogs();
		}
	}

	@Override
	public Blog deleteBlogs(String email, Integer blogId) throws UserExceptions {
		Optional<User> opt = udao.findById(email);
		if(opt.isEmpty()) {
			throw new UserExceptions("User does not exists....");
		}else{
			Optional<Blog> bOpt = bdao.findById(blogId);
			if(bOpt.isEmpty()) {
				throw new BlogExceptions("does not have any blog with this Id");
			}else {
				Blog b = bOpt.get();
				bdao.delete(b);
				return b;
			}
		}
	}

	@Override
	public Comment deleteComment(String email, Integer commentId) throws UserExceptions {
		Optional<User> opt = udao.findById(email);
		if(opt.isEmpty()) {
			throw new UserExceptions("User does not exists....");
		}else{
			Optional<Comment> cOpt = cdao.findById(commentId);
			if(cOpt.isEmpty()) {
				throw new BlogExceptions("does not have any blog with this Id");
			}else {
				Comment c = cOpt.get();
				cdao.delete(c);
				return c;
			}
		}
	}

}
