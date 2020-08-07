package model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.apache.struts.action.ActionForm;

@Entity
public class Task extends ActionForm {
	
	/**
	 * 
	 */
private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
private int taskId;
private String status;
private String startDate;
private String endDate;
private String assignedTo;
private int buildId;
private int projectId;



public int getTaskId() {
	return taskId;
}

public void setTaskId(int taskId) {
	this.taskId = taskId;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public String getStartDate() {
	return startDate;
}

public void setStartDate(String startDate) {
	this.startDate = startDate;
}

public String getEndDate() {
	return endDate;
}

public void setEndDate(String endDate) {
	this.endDate = endDate;
}

public String getAssignedTo() {
	return assignedTo;
}

public void setAssignedTo(String assignedTo) {
	this.assignedTo = assignedTo;
}


@Override
public String toString() {
	return "Task [taskId=" + taskId + ", status=" + status + ", startDate="
			+ startDate + ", endDate=" + endDate + ", assignedTo=" + assignedTo
			+ "]";
}

public int getBuildId() {
	return buildId;
}

public void setBuildId(int buildId) {
	this.buildId = buildId;
}

public int getProjectId() {
	return projectId;
}

public void setProjectId(int projectId) {
	this.projectId = projectId;
}


}



