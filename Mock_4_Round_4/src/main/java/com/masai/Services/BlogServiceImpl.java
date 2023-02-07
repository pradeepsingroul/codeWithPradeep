package com.masai.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exceptions.BlogExceptions;
import com.masai.Model.Blog;
import com.masai.Model.Category;
import com.masai.Repository.BlogRepository;

@Service
public class BlogServiceImpl implements BlogService{
	
	@Autowired
	private BlogRepository bdao;

	@Override
	public Blog publisBlog(Blog b) throws BlogExceptions {
		Optional<Blog> bOpt = bdao.findById(b.getBlogId());
		if(bOpt.isPresent()) {
			throw new BlogExceptions("blog already publish....");
		}else {
			Blog b1 = bOpt.get();
			bdao.save(b);
			return b1;
			
		}
	}

	@Override
	public List<Blog> getByCategory(Category c) throws BlogExceptions {
		List<Blog> lBlogs = bdao.findAllByCategory(c);
		if(lBlogs.isEmpty()) {
			throw new BlogExceptions("blogs does not exits....");
		}else {
			return lBlogs;
			
		}
	}

}
