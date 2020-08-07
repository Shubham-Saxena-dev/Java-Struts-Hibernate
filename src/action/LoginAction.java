package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Login;
import model.Register;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import dao.HiberUtil;

public class LoginAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		Login login=(Login)form;
		System.out.println("working");

		boolean val=validate(login);
		if(val==true){
		return mapping.findForward("success");
		}
		
		return mapping.findForward("errors");
	}

	
	private boolean validate(Login login){
		
		Session session=HiberUtil.getSession();
		Transaction trans=null;
	try{
		
		trans=session.beginTransaction();
		
		Criteria criteria = session.createCriteria(Register.class); 
		String email=login.getEmail();
		String password=login.getPassword();
		System.out.println(email+" "+password);
	Criterion email1	  =	Restrictions.eq("email", login.getEmail());
	Criterion password1= Restrictions.eq("password",login.getPassword());
	criteria.add(Restrictions.and(email1, password1));
	
	
	Register result=(Register)criteria.uniqueResult();
	System.out.println("check"+result);
		
	if(result!=null){
		
		System.out.println("check"+result);
			return true;
	}
			
	}catch(Exception e){
		
		trans.rollback();
		e.printStackTrace();
	}
	return false;
	}
	
}
