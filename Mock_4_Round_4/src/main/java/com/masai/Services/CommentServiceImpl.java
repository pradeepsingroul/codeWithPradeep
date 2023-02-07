package com.masai.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.masai.Exceptions.BlogExceptions;
import com.masai.Exceptions.CommentExceptions;
import com.masai.Model.Blog;
import com.masai.Model.Comment;
import com.masai.Repository.BlogRepository;
import com.masai.Repository.CommentRepository;
@Service
public class CommentServiceImpl implements CommentService{
	
	@Autowired
	private BlogRepository bdao;
	
	@Autowired
	private CommentRepository cdao;

	
	@JsonIgnore
	@Override
	public Comment writeComment(Comment c,Integer blogId) throws CommentExceptions {
		Optional<Blog> bOpt = bdao.findById(blogId); 
		if(bOpt.isEmpty()) {
			throw new BlogExceptions("Blog does not exists.....");
		}else {
			c.setBlogs(bOpt.get());
			cdao.save(c);
			return c;
		}
	}

}
