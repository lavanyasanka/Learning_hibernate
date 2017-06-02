package edu.lavanya.learn.hibernate.Dao;

import java.util.List;

import edu.lavanya.learn.hibernate.entity.PersonID;

public interface PersonIdDao {
	   public List<PersonID> getAllIdpersonids() throws Exception;
	   public PersonID getidinfo(int idpersonidentifier);
	   public void updatePersonID(PersonID personidentifier);
	   public void deletePersonID(PersonID personidentifier);
	   public void insertPersonID(PersonID personidentifier);
}
