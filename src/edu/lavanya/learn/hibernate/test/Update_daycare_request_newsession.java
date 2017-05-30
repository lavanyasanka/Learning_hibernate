package edu.lavanya.learn.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import edu.lavanya.learn.hibernate.Daycare_request;
import edu.lavanya.learn.hibernate.HibernateSessionFactory;

public class Update_daycare_request_newsession {

	public static void main(String[] args) {
		
		Transaction trans = null;
		Session session = null;
		SessionFactory sessionfactory = null;
		try{
			
			sessionfactory = new Configuration().configure().buildSessionFactory();
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
			System.out.println("failed to create the Configuration and session factory");
		}
         session = sessionfactory.openSession();
          trans = session.beginTransaction();
		
		try
		{
						
			Daycare_request daycarereq = session.load(Daycare_request.class, 1294118);


			daycarereq.setTXT_COMMENT_INVALID("something something *******");
			
			session.saveOrUpdate(daycarereq);
			
            System.out.println("dayacre request updated succesfully ");
			
            trans.commit();
			session.close();
			sessionfactory.close();
			
			}catch(Exception ex)
			{
				trans.rollback();
				ex.printStackTrace();
			}
			
		}

	}

