package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Project;
import model.Register;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import dao.ProjectDaoImpl;

public class ProjectAction extends DispatchAction{

	ProjectDaoImpl projectDao=new ProjectDaoImpl();
	
	public ActionForward insert(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		Project project=(Project)form;
		Project pro=projectDao.insert(project);
		if(pro!=null)
	return mapping.findForward("success");
		
		return mapping.findForward("errors");
	}

	
	
	
	
	
	public ActionForward delete(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		boolean pro;
		Project project=(Project)form;
		try{
		pro=projectDao.delete(project.getProjectId());
		if(pro==true)
	return mapping.findForward("success");
		}catch(Exception e){
			e.printStackTrace();
		}
		return mapping.findForward("errors");
	}
	
	
	
	
	
	
	public ActionForward update(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		
		Project project=(Project)form;
		int projectId=project.getProjectId();
		String endDate=project.getEndDate();
		String status=project.getStatus();
		
		
		try{
		Project pro=projectDao.update(projectId,endDate,status);
		if(pro!=null)
		return mapping.findForward("success");
		}catch(Exception e){
			e.printStackTrace();
		}
		return mapping.findForward("errors");
	}
}
