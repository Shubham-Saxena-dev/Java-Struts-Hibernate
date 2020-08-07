package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.apache.struts.action.ActionForm;

@Entity
public class Build extends ActionForm {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private int buildId;
	private int taskId;
	private String status;
	private String comments;
	private List<Task> task;
	
	public int getBuildId() {
		return buildId;
	}
	public void setBuildId(int buildId) {
		this.buildId = buildId;
	}
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
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
	@Override
	public String toString() {
		return "Build [buildId=" + buildId + ", taskId=" + taskId + ", status="
				+ status + ", comments=" + comments + "]";
	}
	
	
	@OneToMany(targetEntity=Task.class,mappedBy="build",cascade=CascadeType.ALL)
	public List<Task> getTask() {
		return task;
	}
	public void setTask(List<Task> task) {
		this.task = task;
	}
	
	
	
}
