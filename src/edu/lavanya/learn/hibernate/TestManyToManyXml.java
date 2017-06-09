package edu.lavanya.learn.hibernate.Test;

import java.util.HashSet;

import org.hibernate.Session;

import edu.lavanya.learn.hibernate.daoimpl.EmployeeCRUD;
import edu.lavanya.learn.hibernate.model.Certificate;
import edu.lavanya.learn.hibernate.util.HibernateSessionFactory;

public class TestManyToManyXml {
	  
		   public static void main(String[] args) throws Exception {
		      try{
		    	   Session session = null;
		 	      session = HibernateSessionFactory.createSessionFactory().openSession();
		      }catch (Throwable ex) { 
		         System.err.println("Failed to create sessionFactory object." + ex);
		         throw new ExceptionInInitializerError(ex); 
		      }
		      EmployeeCRUD ME = new EmployeeCRUD();
		      /* Let us have a set of certificates for the first employee  */
		      HashSet certificates = new HashSet();

		      certificates.add(new Certificate("MCA"));
		      certificates.add(new Certificate("MBA"));
		      certificates.add(new Certificate("PMP"));
		     
		      /* Add employee records in the database */
		      Integer empID1 = ME.addEmployee("Manoj", "Kumar", 4000, certificates);

		      /* Add another employee record in the database */
		      Integer empID2 = ME.addEmployee("Dilip", "Kumar", 3000, certificates);

		      /* List down all the employees */
		      ME.listEmployees();

		      /* Update employee's salary records */
		      ME.updateEmployee(empID1, 5000);

		      /* Delete an employee from the database */
		      ME.deleteEmployee(empID2);

		      /* List down all the employees */
		      ME.listEmployees();

		   }

		  
	}

