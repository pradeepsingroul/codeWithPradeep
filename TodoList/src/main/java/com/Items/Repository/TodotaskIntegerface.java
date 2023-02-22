package com.Items.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Items.Model.TodoTask;


@Repository
public interface TodotaskIntegerface extends JpaRepository<TodoTask, String>{

	public List<TodoTask> findAllByUser(Integer userId);
	
}
