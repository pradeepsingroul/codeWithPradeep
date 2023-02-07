package com.masai.Model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Blog {
	
	@Id
	private int blogId;
	private Category category;
	private String content;
	private LocalDateTime timeStamp;
	
	
	@OneToOne
	private User user;
	
	public int getBlogId() {
		return blogId;
	}

	public void setBlogId(int blogId) {
		this.blogId = blogId;
	}

	@OneToMany
	private List<Comment> comments;

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "Blog [category=" + category + ", content=" + content + ", timeStamp=" + timeStamp + ", user=" + user
				+ ", comments=" + comments + "]";
	}

	public Blog(Category category, String content, LocalDateTime timeStamp) {
		super();
		this.category = category;
		this.content = content;
		this.timeStamp = timeStamp;
	}

	public Blog(Category category, String content, LocalDateTime timeStamp, User user, List<Comment> comments) {
		super();
		this.category = category;
		this.content = content;
		this.timeStamp = timeStamp;
		this.user = user;
		this.comments = comments;
	}

	public Blog() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
