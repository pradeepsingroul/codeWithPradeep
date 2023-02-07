package com.masai.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Model.Comment;
import com.masai.Model.User;
import com.masai.Services.CommentService;

@RestController
@RequestMapping("/masaiblog")
public class CommentController {
	
	
	@Autowired
	private CommentService cs;

	@PostMapping("/user/{blogId}")
	public ResponseEntity<Comment> registerEntity(@RequestBody Comment c,@PathVariable("blogId") Integer blogId){
	
		Comment cm = cs.writeComment( c, blogId);
		return new ResponseEntity<Comment>(cm,HttpStatus.OK);
	}
	
	
}
