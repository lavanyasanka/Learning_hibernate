package edu.lavanya.learn.hibernate.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import edu.lavanya.learn.hibernate.HibernateSessionFactory;
import edu.lavanya.learn.hibernate.TletsCheck;

public class TletsCheckDao {

	static SessionFactory sessionfactory = null;
	static Session session = null;
	static Transaction trans = null;


	public static Session getSession() throws Exception{


		if(sessionfactory == null)
		{
			sessionfactory = HibernateSessionFactory.createSessionFactory();
			session = sessionfactory.openSession();
		}
		return session;
	}

	public void insertTletsCheck(){

		try {

			session = TletsCheckDao.getSession();
			trans = session.beginTransaction();

			TletsCheck tcheck = new TletsCheck();
			tcheck.setID_LAST_UPDATE_PERSON(90849603);
			tcheck.setID_PERSON(90849603);
			tcheck.setID_CREATED_PERSON(90849603);
			tcheck.setID_CASE(45112667);
			tcheck.setID_STAGE(68494160);
			tcheck.setCD_TLETS("10");
			tcheck.setDT_CONDUCTED(new Date());
			tcheck.setIND_INVALID("Y");
			tcheck.setDT_INVALID(new Date());

			session.save(tcheck);

			trans.commit();
			System.out.println("Tlets check request got succesfully created..with id"+ tcheck.getID_TLETS_CHECK());
			session.close();
			sessionfactory.close();
		}
		catch(Exception ex){
			ex.printStackTrace();

		}

	}
	public void deleteTletsCheck(){

		try {
			session = TletsCheckDao.getSession();
			trans = session.beginTransaction();
			TletsCheck tcheck = session.load(TletsCheck.class, 30653);

			System.out.println("Record to be deleted is : " +tcheck.getID_TLETS_CHECK());

			session.delete(tcheck);
			trans.commit();
			System.out.println("Record is deleted successfully ");
			session.close();
			sessionfactory.close();
		} 
		catch (Exception e) {

			e.printStackTrace();
		}

	}
	public void updateTletsCheck(){

		try {

			session = TletsCheckDao.getSession();
			trans = session.beginTransaction();
			TletsCheck tcheck = session.load(TletsCheck.class, 30654);
			System.out.println("Record to be updated is : " +tcheck.getID_TLETS_CHECK());
			tcheck.setID_CREATED_PERSON(2271);
			session.saveOrUpdate(tcheck);
			trans.commit();
			System.out.println("Record updated successfully " +session.load(TletsCheck.class, 30654));
			session.close();
			sessionfactory.close();
		} 
		catch (Exception e) {

			e.printStackTrace();
			
		}


	}

	public void fetchTletsCheck(){
		try {

			session = TletsCheckDao.getSession();
			trans = session.beginTransaction();
			
			//Get TletsCheck
			TletsCheck tcheck= (TletsCheck) session.get(TletsCheck.class, 30655);
			System.out.println("TletsCheck get called");
			System.out.println("TletsCheck ID= "+tcheck.getID_TLETS_CHECK());
			System.out.println("TletsCheck Get Details:: "+tcheck+"\n");
			
			//load Example
			TletsCheck tcheck1= (TletsCheck) session.load(TletsCheck.class, 30656);
			System.out.println("TletsCheck load called");
			System.out.println("TletsCheck ID= "+tcheck.getID_TLETS_CHECK());
			System.out.println("TletsCheck Get Details:: "+tcheck1+"\n");
			
			trans.commit();
			session.close();
			sessionfactory.close();
		} 
		catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		
		
		TletsCheckDao dao = new TletsCheckDao();
		dao.fetchTletsCheck();
//		dao.deleteTletsCheck();
//		dao.updateTletsCheck();
//		dao.insertTletsCheck();
//		
		

	}


}
