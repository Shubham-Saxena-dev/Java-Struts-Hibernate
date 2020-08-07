package dao;

import model.Project;

public interface ProjectDaoInterface {

	Project insert(Project project);
	boolean delete(int projectId);
	Project update(int projectId,String endDate,String status);
}
