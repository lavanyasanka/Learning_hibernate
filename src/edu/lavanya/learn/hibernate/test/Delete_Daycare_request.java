package edu.lavanya.learn.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import edu.lavanya.learn.hibernate.Daycare_request;
import edu.lavanya.learn.hibernate.HibernateSessionFactory;

public class Delete_Daycare_request {

	public static void main(String[] args) {
		
		Transaction trans = null;
		SessionFactory sessionfactory = null;
		Session session = null;
		
		try{
			sessionfactory = HibernateSessionFactory.createSessionFactory();
			session = sessionfactory.openSession();
			trans = session.beginTransaction();
			
			Daycare_request req1 = session.load(Daycare_request.class, 1294118);
			System.out.println("record to be deleted is " + req1.getID_DAYCARE_REQUEST());
			session.delete(req1);
			System.out.println("Record got deleted successfully");
			trans.commit();
			
			session.close();
			sessionfactory.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}

	}

}
