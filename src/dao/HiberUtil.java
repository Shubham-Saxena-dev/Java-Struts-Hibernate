package dao;

import model.Register;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class HiberUtil  {

	private static final SessionFactory sessionFactory;

	static {
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Register.class);
		cfg.configure();
		sessionFactory = cfg.buildSessionFactory();
	}

	public static SessionFactory getSessionFactory() {

		return sessionFactory;
	}


	public static Session getSession() {
		
		return sessionFactory.openSession();
	}
}
