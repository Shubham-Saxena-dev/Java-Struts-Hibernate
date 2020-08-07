package dao;


import org.hibernate.Session;
import org.hibernate.Transaction;

import model.Project;


public class ProjectDaoImpl implements ProjectDaoInterface {

	Session session=HiberUtil.getSession();
	Transaction trans=null;
	
	public Project insert(Project project) {

		Transaction trans=null;
		
		try{
			System.out.println("dao class");
			trans=session.beginTransaction();
			System.out.println("go");
			
			session.save(project);
			trans.commit();
			System.out.println("Project Record inserted");
			return project;
			
		}catch(Exception e){
			if(trans !=null) 
				trans.rollback();
			e.printStackTrace();
		}
		return null;
	}
	
	
	public boolean delete(int projectId) {

		Transaction trans=null;
		
		try{
			System.out.println("dao class");
			trans=session.beginTransaction();
			
			Project pro=(Project) session.get(Project.class, projectId);
			session.delete(pro);
			trans.commit();
			System.out.println("Project Record deleted");
			return true;
			
		}catch(Exception e){
			if(trans !=null) 
				trans.rollback();
			e.printStackTrace();
		}
		return false;
	}
	

	public Project update(int projectId,String endDate,String status) {

		Transaction trans=null;
		
		try{
			System.out.println("dao class");
			trans=session.beginTransaction();
			
			
			/*int projectId=project.getProjectId();
			String endDate=project.getEndDate();
			String status=project.getStatus();*/
			
			
			Project pro=(Project) session.get(Project.class, projectId);
			pro.setEndDate(endDate);
			pro.setStatus(status);
			session.update(pro);
			
			
			trans.commit();
			System.out.println("Project Record updated");
			return pro;
			
		}catch(Exception e){
			if(trans !=null) 
				trans.rollback();
			e.printStackTrace();
		}
		return null;
		
	}
	

	
}
