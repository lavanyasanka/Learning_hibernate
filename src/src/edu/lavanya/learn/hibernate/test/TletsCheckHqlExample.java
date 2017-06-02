package edu.lavanya.learn.hibernate.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import edu.lavanya.learn.hibernate.TletsCheck;

import edu.lavanya.learn.hibernate.HibernateSessionFactory;

public class TletsCheckHqlExample {
	public static void main(String[] args) {
	
		Transaction trans = null;
		SessionFactory sessionfactory = null;
		Session session = null;
		
		try{
			sessionfactory = HibernateSessionFactory.createSessionFactory();
			session = sessionfactory.openSession();
			trans = session.beginTransaction();
			
			//HQL example - Get All Tletscheck
			
			Query query = session.createQuery("from TletsCheck where id_created_person =41526742");
			List<TletsCheck> tlets = query.list();
			for(TletsCheck tlet : tlets){
				System.out.println("List of Tletchecks ::"+tlet);
			}
			 trans.commit();
			 session.close();
			 sessionfactory.close();
			
		}
		catch(Exception ex){
			ex.printStackTrace();
			
		}

		

	}

}
