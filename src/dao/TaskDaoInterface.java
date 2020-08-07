package dao;

import model.Task;

public interface TaskDaoInterface {

Task insert(Task task);
boolean delete(int taskId);
Task update(int taskId,String status,String assignedTo,String endDate);
}
