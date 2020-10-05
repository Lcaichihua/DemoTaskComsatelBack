package com.DemoTaskComsatel.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




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

	public Task() {
	}

	public Task(Integer idTask, String description, boolean state) {
	
		this.idTask = idTask;
		this.description = description;
		this.state = state;
	}

	public Integer getIdTask() {
		return idTask;
	}

	public void setIdTask(Integer idTask) {
		this.idTask = idTask;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}
	
	
	
	
	
}
