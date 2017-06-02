package edu.lavanya.learn.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactory {
	
	static SessionFactory sessionFactory = null;
	public static SessionFactory createSessionFactory() throws Exception {
		
		if(sessionFactory == null)
			sessionFactory = new Configuration().configure().buildSessionFactory();
		
		return sessionFactory;
	}


}
