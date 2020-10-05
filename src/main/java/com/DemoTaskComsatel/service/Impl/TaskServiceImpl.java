package com.DemoTaskComsatel.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DemoTaskComsatel.model.Task;
import com.DemoTaskComsatel.repository.TaskRepo;
import com.DemoTaskComsatel.service.TaskService;
@Service
public class TaskServiceImpl implements TaskService {

	
	@Autowired
	private TaskRepo repo;
	
	
	@Override
	public Task save(Task t) {
		return repo.save(t);
	}

	@Override
	public Task update(Task t) {
		return repo.save(t);
	}

	@Override
	public Task read(Integer id) {
		return repo.findById(id).get();
	}

	@Override
	public List<Task> list() {
		return repo.findAll();
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);
		
	}

}
