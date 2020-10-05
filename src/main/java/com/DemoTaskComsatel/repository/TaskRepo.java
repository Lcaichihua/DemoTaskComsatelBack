package com.DemoTaskComsatel.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.DemoTaskComsatel.model.Task;

public interface TaskRepo extends JpaRepository<Task, Integer>{

}
