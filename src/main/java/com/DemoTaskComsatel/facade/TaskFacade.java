package com.DemoTaskComsatel.facade;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DemoTaskComsatel.model.Task;
import com.DemoTaskComsatel.service.TaskService;

@Service
public class TaskFacade {
	
	@Autowired
	private TaskService service;
	
	public Task createTask(Task task) {
		Task pac = service.save(task);
	return pac;
	}
	
	public List<Task> listTask(){
		
		List<Task> tasks = service.list();
		return tasks;
		
	}
	
	 public void deleteTask(int id) {
		 service.delete(id);
			
	 }
	 
	 public Task updateTask(Task task) {
		 Task pac = service.update(task);
			return pac; 
	 }
	 public Task ListById(int id) {
		 Task t = service.read(id);
		 return t;
	 }

}