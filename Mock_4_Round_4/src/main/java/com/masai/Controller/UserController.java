package com.masai.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Model.Blog;
import com.masai.Model.Comment;
import com.masai.Model.LoginDto;
import com.masai.Model.User;
import com.masai.Services.userService;

@RestController
@RequestMapping("/masaiblog/user")
public class UserController {
	
	@Autowired
	private userService us;
	
//	@Autowired
//	private userService us
	
	@PostMapping("/register")
	public ResponseEntity<User> registerEntity(@RequestBody User user){
	
		User u = us.registerUser(user);
		return new ResponseEntity<User>(u,HttpStatus.CREATED);
	}
	
	@PostMapping("/login")
	public ResponseEntity<User> loginEntity(@RequestBody LoginDto lDto){
	
		User u = us.loginUser(lDto);
		return new ResponseEntity<User>(u,HttpStatus.OK);
	}
	
	@GetMapping("/blogs")
	public ResponseEntity<List<Blog>> getBlogsEntity(@RequestParam("email") String email){
	
		List<Blog> lst = us.getBlogs(email);
		return new ResponseEntity<List<Blog>>(lst,HttpStatus.OK);
	}
	@DeleteMapping("/blogs/{blogId)")
	public ResponseEntity<Blog> deleteBlogEntity(@RequestParam String email,@PathVariable("blogId") Integer blogId){
	
		Blog lst = us.deleteBlogs(email,blogId);
		return new ResponseEntity<Blog>(lst,HttpStatus.OK);
	}
	
	@DeleteMapping("/blogs/{commentId)")
	public ResponseEntity<Comment> deleteCommEntity(@RequestParam String email,@PathVariable("commentId") Integer blogId){
	
		Comment lst = us.deleteComment(email,blogId);
		return new ResponseEntity<Comment>(lst,HttpStatus.OK);
	}
	
	
	
	
    
}
