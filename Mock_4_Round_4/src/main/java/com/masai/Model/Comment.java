package com.masai.Model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Comment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int commentId;
	private String comment;
	private LocalDateTime timeStamp;
	
	
	@ManyToOne
	private List<Blog> blogs;
	
	@ManyToOne
	private List<User> users;

	public int getCommentId() {
		return commentId;
	}

	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

	public List<Blog> getBlogs() {
		return blogs;
	}

	public void setBlogs(List<Blog> blogs) {
		this.blogs = blogs;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "Comment [commentId=" + commentId + ", comment=" + comment + ", timeStamp=" + timeStamp + ", blogs="
				+ blogs + ", users=" + users + "]";
	}

	public Comment(int commentId, String comment, LocalDateTime timeStamp) {
		super();
		this.commentId = commentId;
		this.comment = comment;
		this.timeStamp = timeStamp;
	}

	public Comment(int commentId, String comment, LocalDateTime timeStamp, List<Blog> blogs, List<User> users) {
		super();
		this.commentId = commentId;
		this.comment = comment;
		this.timeStamp = timeStamp;
		this.blogs = blogs;
		this.users = users;
	}

	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
