package com.masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.Model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer>{

}
