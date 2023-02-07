package com.masai.Services;

import com.masai.Exceptions.CommentExceptions;
import com.masai.Model.Comment;

public interface CommentService {
	
	public Comment writeComment(Comment c,Integer blogId) throws CommentExceptions ;

}
