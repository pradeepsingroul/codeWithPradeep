package com.Items.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Items.Exceptions.TodoTaskException;
import com.Items.Model.TodoTask;


public interface TodoService {
	
	public List<TodoTask> getAllTask(Integer userId) throws TodoTaskException;
	
	public TodoTask createTask(TodoTask tdTask) throws TodoTaskException;
	
	public TodoTask deleteTask(String taskId) throws TodoTaskException;
	
	public TodoTask updateTask(TodoTask tdTask) throws TodoTaskException;

}
