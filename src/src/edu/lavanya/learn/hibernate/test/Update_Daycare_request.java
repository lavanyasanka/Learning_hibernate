package edu.lavanya.learn.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import edu.lavanya.learn.hibernate.Daycare_request;
import edu.lavanya.learn.hibernate.HibernateSessionFactory;

public class Update_Daycare_request {

	public static void main(String[] args) {
		
		Transaction trans = null;
		Session session = null;
		SessionFactory sessionfactory = null;
		try{
			
			sessionfactory = HibernateSessionFactory.createSessionFactory();
			session = sessionfactory.openSession();
	         trans = session.beginTransaction();
	         
			Daycare_request daycarereq = session.load(Daycare_request.class, 1294119);
			
			System.out.println(daycarereq.getID_DAYCARE_REQUEST());
			
			daycarereq.setTXT_COMMENT_INVALID("something");
			session.update(daycarereq);
            System.out.println("dayacre request updated succesfully ");
			
			trans.commit();

			
		}catch(Exception ex)
		{
			trans.rollback();
			ex.printStackTrace();
		}
		finally{
			
			session.close();
			sessionfactory.close();
		}


	}

}
