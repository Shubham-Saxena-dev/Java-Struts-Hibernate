package dao;



import org.hibernate.Session;
import org.hibernate.Transaction;

import model.Task;

public class TaskDaoImpl implements TaskDaoInterface{

Session session=HiberUtil.getSession();
Transaction trans=null;


	public Task insert(Task task) {
		
		try{
		trans=session.beginTransaction();
		session.save(task);
		return task;
		}catch(Exception e){
			trans.rollback();
			e.printStackTrace();
		}
		return null;
	}


	public boolean delete(int taskId) {

		try{
			trans=session.beginTransaction();
		Task task=(Task) session.get(Task.class, taskId);
		session.delete(task);
		return true;
	}catch(Exception e){
		trans.rollback();
		e.printStackTrace();
	}
		return false;
		}


	public Task update(int taskId,String status, String assignedTo, String endDate) {

		try{
			
			trans=session.beginTransaction();
			Task task=(Task) session.get(Task.class, taskId);
			if(task!=null){
				task.setStatus(status);
				task.setAssignedTo(assignedTo);
				task.setEndDate(endDate);
				session.update(task);
			}
			
		}catch(Exception e){
			trans.rollback();
			e.printStackTrace();
		}
		
		return null;
	}

	
}
