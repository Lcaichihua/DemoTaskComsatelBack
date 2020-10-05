package com.DemoTaskComsatel.controller;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DemoTaskComsatel.exception.ModeloNotFoundException;
import com.DemoTaskComsatel.model.Task;
import com.DemoTaskComsatel.service.TaskService;

@RestController
@RequestMapping("/task")
public class TaskController {
	
	@Autowired
	private TaskService service;
	
	@GetMapping
	public ResponseEntity<List<Task>> listar() {
		List<Task> tasks = service.list();
		System.out.println(tasks);
		return new ResponseEntity<List<Task>>(tasks, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Task> listarPorId(@PathVariable("id") Integer id) {
		Task task = service.read(id);
		System.out.println(task);
		return new ResponseEntity<Task>(task, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Object> registrar(@RequestBody Task task) {
		Task pac = service.save(task);
		
		
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Object> modificar( @RequestBody Task task) {
		service.update(task);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> eliminar(@PathVariable("id") Integer id) {
		Task task = service.read(id);
		System.out.println(task);
		if (task == null) {
			throw new ModeloNotFoundException("idTask no encontrado: " + id);
		} else {
			service.delete(id);
		}
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	
	
}
