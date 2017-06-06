package edu.lavanya.learn.hibernate.Test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import edu.lavanya.learn.hibernate.model.Student;

public class PersistStudent {




		public static void main(String[] args) {
			// TODO Auto-generated method stub
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
			
			Student st = new Student();
			st.setSid(5);
			st.setSname("Arav");
			st.setMarks(360);
			
			session.save(st);
			
			System.out.println("Student got succesfully created..with id"+st.getSid());
			
			trans.commit();
			session.close();
			}catch(Exception ex)
			{
				trans.rollback();
				ex.printStackTrace();
			}
			
		}

	}

