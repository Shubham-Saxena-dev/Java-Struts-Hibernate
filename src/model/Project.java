package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.apache.struts.action.ActionForm;


@Entity
public class Project extends ActionForm {


/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
@Id
@GeneratedValue
private int projectId;
private String projectTitle;
private String startDate;
private String endDate;
private String status;

public int getProjectId() {
	return projectId;
}
public void setProjectId(int projectId) {
	this.projectId = projectId;
}
public String getProjectTitle() {
	return projectTitle;
}
public void setProjectTitle(String projectTitle) {
	this.projectTitle = projectTitle;
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
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
@Override
public String toString() {
	return "Project [projectId=" + projectId + ", projectTitle=" + projectTitle
			+ ", startDate=" + startDate + ", endDate=" + endDate + ", status="
			+ status + "]";
}


}
