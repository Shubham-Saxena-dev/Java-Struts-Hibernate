package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Register;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


import dao.RegisterDaoImpl;
import dao.RegisterDaoInterface;


public class RegistrationAction extends Action{

	RegisterDaoImpl registerDao=new RegisterDaoImpl();
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		System.out.println("right here");
		Register register=(Register)form;
		
		Register reg=registerDao.insert(register);
		
		if(reg==null){
			return mapping.findForward("errors");
		}
		return mapping.findForward("success");
	}

	
}
