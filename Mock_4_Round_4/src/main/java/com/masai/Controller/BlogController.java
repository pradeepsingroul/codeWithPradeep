package com.masai.Controller;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Model.Blog;
import com.masai.Model.Category;
import com.masai.Model.User;
import com.masai.Services.BlogService;

@RestController
@RequestMapping("/masaiblog/user")
public class BlogController {
	
	@Autowired
	private BlogService bs;
	

	@PostMapping("/blog")
	public ResponseEntity<Blog> registerEntity(@RequestBody Blog blog){
	
		Blog u = bs.publisBlog(blog);
		return new ResponseEntity<Blog>(u,HttpStatus.CREATED);
	}
	
//	@GetMapping("/blog/{category}")
//	public ResponseEntity<List<Blog>> getBlogs(@RequestParam("category") Category c){
//	
//		List<Blog> bList = bs.getByCategory(c);
//		return new ResponseEntity<List<Blog>>(bList,HttpStatus.OK);
//	}
	
	
}
