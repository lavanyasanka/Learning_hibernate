package edu.lavanya.learn.hibernate.test;

import java.util.Date;
import java.util.List;

import edu.lavanya.learn.hibernate.daoimpl.PersonIDDaoimpl;
import edu.lavanya.learn.hibernate.entity.PersonID;

public class PersonIdTest {

	public static void main(String[] args) throws Exception {
		PersonIDDaoimpl piddao = new PersonIDDaoimpl();
		PersonID p = new PersonID(50280837);
		PersonID p1 = new PersonID(33774323);
		List<PersonID> p2= piddao.getAllIdpersonids();
		
        piddao.getidinfo(55661025);
	
        piddao.updatePersonID(p);
		piddao.deletePersonID(p1);
		
		//insert
		PersonID pid = new PersonID();
		piddao.insertPersonID(pid);
		pid.setPersonid(2271);
		pid.setIdnumber("testhibernate");
		pid.setIdtype("Twitter ID");
		pid.setIddescription("testing hibernate dao");
		pid.setIdvalidindicator("N");
		pid.setIdstartdate(new Date());
		pid.setIdenddate(null);
		pid.setValidateid("N");
		pid.setSsnsource(null);
		pid.setSsnverify(null);
	}

}
