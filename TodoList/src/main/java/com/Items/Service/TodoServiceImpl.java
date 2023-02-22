package com.Items.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Items.Exceptions.TodoTaskException;
import com.Items.Model.TodoTask;
import com.Items.Repository.TodotaskIntegerface;

@Service
public class TodoServiceImpl implements TodoService{
	
	@Autowired
	private TodotaskIntegerface tdao;

	@Override
	public List<TodoTask> getAllTask(Integer userId) throws TodoTaskException {
		List<TodoTask> ts = tdao.findAllByUser(userId);
		if(ts.isEmpty()) {
			throw new TodoTaskException("user does not have any task");
		}else {
			return ts;
		}

	}

	@Override
	public TodoTask createTask(TodoTask tdTask) throws TodoTaskException {
		Optional<TodoTask> opt = tdao.findById(tdTask.getTask());
		if(opt.isEmpty()) {
			return tdao.save(tdTask);
		}else {
			throw new TodoTaskException("task already exist...");
		}
	}

	@Override
	public TodoTask deleteTask(String taskId) throws TodoTaskException {
		Optional<TodoTask> opt = tdao.findById(taskId);
		if(opt.isEmpty()) {
			throw new TodoTaskException("task does not exists...");
		}else {
			TodoTask t = opt.get();
			tdao.deleteById(taskId);
			return t;
		}
	}

	@Override
	public TodoTask updateTask(TodoTask tdTask) throws TodoTaskException {
		Optional<TodoTask> opt = tdao.findById(tdTask.getTask());
		if(opt.isEmpty()) {
			throw new TodoTaskException("task does not exits exist...");
		}else {
			return tdao.save(tdTask);
		}
	}

}
