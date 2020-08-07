package dao;

import model.Register;

import org.hibernate.Session;
import org.hibernate.Transaction;



public class RegisterDaoImpl implements RegisterDaoInterface {
	
	Session session=HiberUtil.getSession();
	
	
	public Register insert(Register register) {
		
		Transaction trans=null;
		
		try{
			System.out.println("dao class");
			trans=session.beginTransaction();
			System.out.println("go");
			session.save(register);
			trans.commit();
			System.out.println("User Record inserted");
			return register;
		}catch(Exception e){
			if(trans !=null) 
				trans.rollback();
			e.printStackTrace();
		}
		return null;
	}

	

}
