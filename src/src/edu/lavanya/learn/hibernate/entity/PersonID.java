package edu.lavanya.learn.hibernate.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity 
@Table (name = "PERSON_ID")
public class PersonID {
	@Id
	@ Column (name = "ID_PERSON_ID")
	private int idpersonidentifier;
	
	@ Column (name = "DT_LAST_UPDATE")
	private Date datelastupdate;
	
	@ Column(name = "ID_PERSON")
	private int personid;
	
	@ Column(name = "NBR_PERSON_ID_NUMBER")
	private String idnumber;
	
	@ Column(name = "CD_PERSON_ID_TYPE")
	private String idtype;
	
	@ Column(name = "DESC_PERSON_ID")	
	private String iddescription;
	
	@ Column(name = "IND_PERSON_ID_INVALID")
	private String idvalidindicator;
	
	@ Column(name = "DT_PERSON_ID_START")
	private Date idstartdate;
	
	@ Column(name = "DT_PERSON_ID_END")
	private Date idenddate;
	
	@ Column(name = "IND_VALIDATE_BY_INTERFACE")
	private String validateid;

	@ Column(name = "CD_SSN_SOURCE")
	private String ssnsource;
	
	@ Column(name = "CD_SSN_VERIF_METH")	
	private String ssnverify;

	//constructors
	public PersonID(int idpersonidentifier, Date datelastupdate, int personid, String idnumber, String idtype,
			String iddescription, String idvalidindicator, Date idstartdate, Date idenddate, String validateid,
			String ssnsource, String ssnverify) {
		super();
		this.idpersonidentifier = idpersonidentifier;
		this.datelastupdate = datelastupdate;
		this.personid = personid;
		this.idnumber = idnumber;
		this.idtype = idtype;
		this.iddescription = iddescription;
		this.idvalidindicator = idvalidindicator;
		this.idstartdate = idstartdate;
		this.idenddate = idenddate;
		this.validateid = validateid;
		this.ssnsource = ssnsource;
		this.ssnverify = ssnverify;
	}

	
	public PersonID(int idpersonidentifier) {
		super();
		this.idpersonidentifier = idpersonidentifier;
	}

	public PersonID() {
		super();
	}


	//getter and setter methods
	public int getIdpersonidentifier() {
		return idpersonidentifier;
	}


	public void setIdpersonidentifier(int idpersonidentifier) {
		this.idpersonidentifier = idpersonidentifier;
	}

	public Date getDatelastupdate() {
		return datelastupdate;
	}

	public void setDatelastupdate(Date datelastupdate) {
		this.datelastupdate = datelastupdate;
	}

	public int getPersonid() {
		return personid;
	}

	public void setPersonid(int personid) {
		this.personid = personid;
	}

	public String getIdnumber() {
		return idnumber;
	}

	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}

	public String getIdtype() {
		return idtype;
	}

	public void setIdtype(String idtype) {
		this.idtype = idtype;
	}

	public String getIddescription() {
		return iddescription;
	}

	public void setIddescription(String iddescription) {
		this.iddescription = iddescription;
	}

	public String getIdvalidindicator() {
		return idvalidindicator;
	}

	public void setIdvalidindicator(String idvalidindicator) {
		this.idvalidindicator = idvalidindicator;
	}

	public Date getIdstartdate() {
		return idstartdate;
	}

	public void setIdstartdate(Date idstartdate) {
		this.idstartdate = idstartdate;
	}

	public Date getIdenddate() {
		return idenddate;
	}

	public void setIdenddate(Date idenddate) {
		this.idenddate = idenddate;
	}

	public String getValidateid() {
		return validateid;
	}

	public void setValidateid(String validateid) {
		this.validateid = validateid;
	}

	public String getSsnsource() {
		return ssnsource;
	}

	public void setSsnsource(String ssnsource) {
		this.ssnsource = ssnsource;
	}

	public String getSsnverify() {
		return ssnverify;
	}

	public void setSsnverify(String ssnverify) {
		this.ssnverify = ssnverify;
	}

	@Override
	public String toString() {
		return "PersonID [idpersonidentifier=" + idpersonidentifier + ", datelastupdate=" + datelastupdate
				+ ", personid=" + personid + ", idnumber=" + idnumber + ", idtype=" + idtype + ", iddescription="
				+ iddescription + ", idvalidindicator=" + idvalidindicator + ", idstartdate=" + idstartdate
				+ ", idenddate=" + idenddate + ", validateid=" + validateid + ", ssnsource=" + ssnsource
				+ ", ssnverify=" + ssnverify + "]";
	}

	
}
