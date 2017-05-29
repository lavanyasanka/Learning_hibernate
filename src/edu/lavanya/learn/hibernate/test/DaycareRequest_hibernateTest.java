package edu.lavanya.learn.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import edu.lavanya.learn.hibernate.DaycareRequest_hibernate;

public class DaycareRequest_hibernateTest {

	public static void main(String[] args) {
		
		DaycareRequest_hibernate req1 = new DaycareRequest_hibernate();
		
		 //req1.setDT_CREATED(todate('25/05/2017', 'DD/MM/YYYY'));
		 req1.setID_LAST_UPDATE_PERSON(24813632);
		 req1.setID_CREATED_PERSON(24813632);
		 req1.setID_CASE(25852854);
		 req1.setID_STAGE(68326964);
		 req1.setID_EVENT(266660193);
		 req1.setIND_INVALID("Y");
		 req1.setDT_INVALID(null);
		 req1.setTXT_COMMENT_INVALID("something something something");
		 
		 SessionFactory sessionfactory=new Configuration().configure().buildSessionFactory();
			Session session=sessionfactory.openSession();
			session.beginTransaction();
			session.save(req1);
			//session.save(user2);
			session.getTransaction().commit();

	}

}
