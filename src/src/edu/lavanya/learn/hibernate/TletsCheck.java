package edu.lavanya.learn.hibernate;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table (name="TLETS_CHECK")
public class TletsCheck {
	@Id
	private int ID_TLETS_CHECK;
	private int ID_LAST_UPDATE_PERSON;
	private Date DT_CREATED ;
	private int ID_CREATED_PERSON;
	private int ID_PERSON;
	private int ID_CASE;
	private int ID_STAGE;	
	private String CD_TLETS;
	private Date DT_CONDUCTED;
	private String IND_INVALID;
	private Date DT_INVALID;
	
	//constructors
	public TletsCheck(int iD_TLETS_CHECK, int iD_LAST_UPDATE_PERSON, Date dT_CREATED, int iD_CREATED_PERSON,
			int iD_PERSON, int iD_CASE, int iD_STAGE, String cD_TLETS, Date dT_CONDUCTED, String iND_INVALID,
			Date dT_INVALID) {
		super();
		ID_TLETS_CHECK = iD_TLETS_CHECK;
		ID_LAST_UPDATE_PERSON = iD_LAST_UPDATE_PERSON;
		DT_CREATED = dT_CREATED;
		ID_CREATED_PERSON = iD_CREATED_PERSON;
		ID_PERSON = iD_PERSON;
		ID_CASE = iD_CASE;
		ID_STAGE = iD_STAGE;
		CD_TLETS = cD_TLETS;
		DT_CONDUCTED = dT_CONDUCTED;
		IND_INVALID = iND_INVALID;
		DT_INVALID = dT_INVALID;
	}
	
	
	public TletsCheck(int iD_TLETS_CHECK) {
		super();
		ID_TLETS_CHECK = iD_TLETS_CHECK;
	}


	public TletsCheck() {
		super();
	}


	//getters and setters
	public int getID_TLETS_CHECK() {
		return ID_TLETS_CHECK;
	}

	public void setID_TLETS_CHECK(int iD_TLETS_CHECK) {
		ID_TLETS_CHECK = iD_TLETS_CHECK;
	}
	public int getID_LAST_UPDATE_PERSON() {
		return ID_LAST_UPDATE_PERSON;
	}
	public void setID_LAST_UPDATE_PERSON(int iD_LAST_UPDATE_PERSON) {
		ID_LAST_UPDATE_PERSON = iD_LAST_UPDATE_PERSON;
	}
	public Date getDT_CREATED() {
		return DT_CREATED;
	}
	public void setDT_CREATED(Date dT_CREATED) {
		DT_CREATED = dT_CREATED;
	}
	public int getID_CREATED_PERSON() {
		return ID_CREATED_PERSON;
	}
	public void setID_CREATED_PERSON(int iD_CREATED_PERSON) {
		ID_CREATED_PERSON = iD_CREATED_PERSON;
	}
	public int getID_PERSON() {
		return ID_PERSON;
	}
	public void setID_PERSON(int iD_PERSON) {
		ID_PERSON = iD_PERSON;
	}
	public int getID_CASE() {
		return ID_CASE;
	}
	public void setID_CASE(int iD_CASE) {
		ID_CASE = iD_CASE;
	}
	public int getID_STAGE() {
		return ID_STAGE;
	}
	public void setID_STAGE(int iD_STAGE) {
		ID_STAGE = iD_STAGE;
	}
	public String getCD_TLETS() {
		return CD_TLETS;
	}
	public void setCD_TLETS(String cD_TLETS) {
		CD_TLETS = cD_TLETS;
	}
	public Date getDT_CONDUCTED() {
		return DT_CONDUCTED;
	}
	public void setDT_CONDUCTED(Date dT_CONDUCTED) {
		DT_CONDUCTED = dT_CONDUCTED;
	}
	public String getIND_INVALID() {
		return IND_INVALID;
	}
	public void setIND_INVALID(String iND_INVALID) {
		IND_INVALID = iND_INVALID;
	}
	public Date getDT_INVALID() {
		return DT_INVALID;
	}
	public void setDT_INVALID(Date dT_INVALID) {
		DT_INVALID = dT_INVALID;
	}


	@Override
	public String toString() {
		return "TletsCheck [ID_TLETS_CHECK=" + ID_TLETS_CHECK + ", ID_LAST_UPDATE_PERSON=" + ID_LAST_UPDATE_PERSON
				+ ", DT_CREATED=" + DT_CREATED + ", ID_CREATED_PERSON=" + ID_CREATED_PERSON + ", ID_PERSON=" + ID_PERSON
				+ ", ID_CASE=" + ID_CASE + ", ID_STAGE=" + ID_STAGE + ", CD_TLETS=" + CD_TLETS + ", DT_CONDUCTED="
				+ DT_CONDUCTED + ", IND_INVALID=" + IND_INVALID + ", DT_INVALID=" + DT_INVALID + "]";
	}
	
	

}
