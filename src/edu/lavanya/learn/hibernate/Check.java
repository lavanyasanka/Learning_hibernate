package HibernateMaven.edu.lavanya.learn.hibernate;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity  
@Table(name="Pay_check")  

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
