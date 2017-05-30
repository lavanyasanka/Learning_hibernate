package edu.lavanya.learn.hibernate.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import edu.lavanya.learn.hibernate.Daycare_request;

public class DaycareRequest_hibernateTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		try
		{
			sessionFactory = new Configuration().configure().buildSessionFactory();
		
		}catch(Exception ex)
		{
			ex.printStackTrace();
			System.out.println("failed to create the Configuration and session factory");
		}
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		
		try
		{

		
			Daycare_request req1 = new Daycare_request();
		
		 req1.setDT_CREATED(new Date());
		 req1.setID_LAST_UPDATE_PERSON(2271);
		 req1.setID_CREATED_PERSON(24813632);
		 req1.setID_CASE(25852854);
		 req1.setID_STAGE(68326964);
		 req1.setID_EVENT(266660193);
		 req1.setIND_INVALID("Y");
		 req1.setDT_INVALID(null);
		 req1.setTXT_COMMENT_INVALID("something something somethingmay 30");
		 
		
			session.save(req1);
			//session.save(user2);
			System.out.println("Daycare request got succesfully created..with id"+ req1.getID_DAYCARE_REQUEST());
			
			trans.commit();
			session.close();
			sessionFactory.close();
			}catch(Exception ex)
			{
				trans.rollback();
				ex.printStackTrace();
			}
			
		}

	}
