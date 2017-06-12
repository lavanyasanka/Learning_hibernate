package HibernateMaven.edu.lavanya.learn.hibernate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity  


public class Check extends Payment{
	
	private String CheckType;

	public String getCheckType() {
		return CheckType;
	}

	public void setCheckType(String checkType) {
		CheckType = checkType;
	}

	public Check() {
		super();
	}
	
	

}
