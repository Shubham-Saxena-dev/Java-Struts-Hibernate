package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Task;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import dao.TaskDaoImpl;

public class TaskAction extends DispatchAction {
	
	TaskDaoImpl taskDao=new TaskDaoImpl();

	public ActionForward insert(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		System.out.println("tyry");
		Task task=(Task)form;
		try{
			
			Task t=taskDao.insert(task);
			if(t!=null)
			return mapping.findForward("success");
		}catch(Exception e){
			e.printStackTrace();
		}
		
				return mapping.findForward("errors");

}
	
	
	public ActionForward delete(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		Task task=(Task)form;
		try{
			int taskId=task.getTaskId();
			boolean result=taskDao.delete(taskId);
			if(result)
			return mapping.findForward("success");
		}catch(Exception e){
			e.printStackTrace();
		}
		
				return mapping.findForward("errors");

}
	
	
	
	public ActionForward update(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		Task task=(Task)form;
		try{
			int taskId=task.getTaskId();
			String status=task.getStatus();
			String assignedTo=task.getAssignedTo();
			String endDate=task.getEndDate();
			Task result=taskDao.update(taskId,status,assignedTo,endDate);
			if(result!= null)
			return mapping.findForward("success");
		}catch(Exception e){
			e.printStackTrace();
		}
		
				return mapping.findForward("errors");

}
	
	
	}
