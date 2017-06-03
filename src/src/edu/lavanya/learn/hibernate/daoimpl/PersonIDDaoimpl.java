package edu.lavanya.learn.hibernate.daoimpl;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import edu.lavanya.learn.hibernate.HibernateSessionFactory;
import edu.lavanya.learn.hibernate.Dao.PersonIdDao;
import edu.lavanya.learn.hibernate.entity.PersonID;


public class PersonIDDaoimpl implements PersonIdDao {
	SessionFactory sessionfactory = null;
	public static Session getSession() throws Exception{
		SessionFactory sessionfactory = null;
		Session session = null;


		if(sessionfactory == null)
		{
			sessionfactory = HibernateSessionFactory.createSessionFactory();
			session = sessionfactory.openSession();
		}
		return session;
	}


	@Override
	public List<PersonID> getAllIdpersonids() throws Exception {
		

		try {

			Session session = PersonIDDaoimpl.getSession();
			Transaction trans = session.beginTransaction();
			Query querry = session.createQuery("from PersonID where personid = 83351148");
			List<PersonID> PersonID = querry.list();
			PersonID.forEach(personids -> System.out.println(personids));
			trans.commit();
			session.close();
			return PersonID;
		}catch (Exception ex){
			ex.printStackTrace();
		}
	
		return null;
	}

	@Override
	public PersonID getidinfo(int idpersonidentifier) {

		try {

			Session session = PersonIDDaoimpl.getSession();
			Transaction trans = session.beginTransaction();
			PersonID personid = session.load(PersonID.class, idpersonidentifier);
			System.out.println("Record to be fetched is : " +personid);
			session.get(PersonID.class,idpersonidentifier);
			trans.commit();
			session.close();
			return personid;
		} 
		catch (Exception e) {

			e.printStackTrace();
			
		}

		return null;
	}


	@Override//
	public void updatePersonID(PersonID personidentifier) {
		try {

			Session session = PersonIDDaoimpl.getSession();
			Transaction trans = session.beginTransaction();
			PersonID personid = session.load(PersonID.class, personidentifier.getIdpersonidentifier());
			System.out.println("Record to be updated is : " +personid.getIdpersonidentifier());
		    personid.setPersonid(personidentifier.getPersonid());
			session.saveOrUpdate(personid);
			trans.commit();
			System.out.println("Record updated successfully "+personid );
			session.close();

		} 
		catch (Exception e) {

			e.printStackTrace();
			
		}
	}

	@Override
	public void deletePersonID(PersonID personidentifier) {
		try {
			Session session = PersonIDDaoimpl.getSession();
			Transaction trans = session.beginTransaction();
			PersonID personid = session.load(PersonID.class, personidentifier.getIdpersonidentifier());

			System.out.println("Record to be deleted is : " +personid.getIdpersonidentifier());

			session.delete(personid);
			trans.commit();
			System.out.println("Record is deleted successfully ");
			session.close();

		} 
		catch (Exception e) {

			e.printStackTrace();
		}
		
	}

	@Override
	public void insertPersonID(PersonID personidentifier) {
		try {
	
			Session session = PersonIDDaoimpl.getSession();
			Transaction trans = session.beginTransaction();
			PersonID pid = new PersonID();
			
			pid.setPersonid(personidentifier.getPersonid());
			pid.setIdnumber(personidentifier.getIdnumber());
			pid.setIdtype(personidentifier.getIdtype());
			pid.setIddescription(personidentifier.getIddescription());
			pid.setIdvalidindicator(personidentifier.getIdvalidindicator());
			pid.setIdstartdate(personidentifier.getIdstartdate());
			pid.setIdenddate(personidentifier.getIdenddate());
			pid.setValidateid(personidentifier.getValidateid());
			pid.setSsnsource(personidentifier.getSsnsource());
			pid.setSsnverify(personidentifier.getSsnverify());

			session.save(pid);

			trans.commit();
			System.out.println("PersonIdentifer got succesfully created..with id"+ pid.getIdpersonidentifier());
			//session.flush();
			session.close();
			
           // sessionfactory.close();
		}
		catch(Exception ex){
			ex.printStackTrace();

		}
		
	}
	
	

	
}
