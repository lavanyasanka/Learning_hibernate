package edu.lavanya.learn.hibernate.Test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.lavanya.learn.hibernate.model.Address;
import edu.lavanya.learn.hibernate.model.Employee;
import edu.lavanya.learn.hibernate.util.HibernateSessionFactory;

public class TestEmbedded {

	public static void main(String[] args) {
		Session session = null;
		Transaction transaction = null;
		try{
		session = HibernateSessionFactory.createSessionFactory().openSession();
		
		transaction = session.beginTransaction();
		Address addr = new Address();
		addr.setCity("Hyderad");
		addr.setStreet("Madhapurt");
		addr.setStreetnumber("8-434");
		addr.setPin_code(78613);
		
		Address addr1= new Address();
		addr1.setCity("Hyderabd");
		addr1.setStreet("malakpet");
		addr1.setStreetnumber("8-434");
		addr1.setPin_code(500036);
		
		Employee emp = new Employee();
		emp.setEid(12);
		emp.setEname("Krishna");
		emp.setSal(89323.00);
		
		emp.setAddress(addr);
		emp.setAddress(addr1);
		
		session.save(emp);
		
		transaction.commit();
		
		}catch(Exception ex){
			ex.printStackTrace();
			transaction.rollback();
		}finally {
			session.close();
		}
		
	}
}
