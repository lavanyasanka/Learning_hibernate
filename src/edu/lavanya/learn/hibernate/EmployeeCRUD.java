package edu.lavanya.learn.hibernate.daoimpl;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import edu.lavanya.learn.hibernate.model.Certificate;
import edu.lavanya.learn.hibernate.model.EmployeeManyToMany;
import edu.lavanya.learn.hibernate.util.HibernateSessionFactory;


public class EmployeeCRUD {

	/* Method to add an employee record in the database */
	public Integer addEmployee(String fname, String lname, 
			int salary, Set cert)throws Exception, Exception{
		Session session = null;
		session = HibernateSessionFactory.createSessionFactory().openSession();
		Transaction tx = null;
		Integer employeeID = null;
		try{
			tx = session.beginTransaction();
			EmployeeManyToMany employee = new EmployeeManyToMany(fname, lname, salary);
			employee.setCertificates(cert);
			employeeID = (Integer) session.save(employee); 
			tx.commit();
		}catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace(); 
		}finally {
			session.close(); 
		}
		return employeeID;
	}

	/* Method to list all the employees detail */
	public void listEmployees( )throws Exception, Exception{
		Session session = null;
		session = HibernateSessionFactory.createSessionFactory().openSession();
		Transaction tx = null;
		try{
			tx = session.beginTransaction();
			List employees = session.createQuery("FROM EmployeeManyToMany").list(); 
			for (Iterator iterator1 = 
					employees.iterator(); iterator1.hasNext();){
				EmployeeManyToMany employee =  (EmployeeManyToMany) iterator1.next(); 
				System.out.print("First Name: " + employee.getFirstName()); 
				System.out.print("  Last Name: " + employee.getLastName()); 
				System.out.println("  Salary: " + employee.getSalary());
				Set certificates = employee.getCertificates();
				for (Iterator iterator2 = certificates.iterator(); iterator2.hasNext();){
					Certificate certName = (Certificate) iterator2.next(); 
					System.out.println("Certificate: " + certName.getName()); 
				}
			}
			tx.commit();
		}catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace(); 
		}finally {
			session.close(); 
		}
	}
	/* Method to update salary for an employee */
	public void updateEmployee(Integer EmployeeID, int salary ) throws Exception, Exception{
		Session session = null;
		session = HibernateSessionFactory.createSessionFactory().openSession();
		Transaction tx = null;
		try{
			tx = session.beginTransaction();
			EmployeeManyToMany employee = 
					(EmployeeManyToMany)session.get(EmployeeManyToMany.class, EmployeeID); 
			employee.setSalary( salary );
			session.update(employee);
			tx.commit();
		}catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace(); 
		}finally {
			session.close(); 
		}
	}
	/* Method to delete an employee from the records */
	public void deleteEmployee(Integer EmployeeID) throws Exception, Exception{
		Session session = null;
		session = HibernateSessionFactory.createSessionFactory().openSession();
		Transaction tx = null;
		try{
			tx = session.beginTransaction();
			EmployeeManyToMany employee = 
					(EmployeeManyToMany)session.get(EmployeeManyToMany.class, EmployeeID); 
			session.delete(employee); 
			tx.commit();
		}catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace(); 
		}finally {
			session.close(); 
		}
	}


}
