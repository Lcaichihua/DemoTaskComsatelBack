package com.DemoTaskComsatel.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;



@Data
@Entity
@Table(name="task")
public class Task {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idtask_task")
	private Integer idTask;

	@Column(name = "description_task")
	private String description;
	
	@Column(name = "state_task")
	private boolean state;

	
	
	
	
	
}
