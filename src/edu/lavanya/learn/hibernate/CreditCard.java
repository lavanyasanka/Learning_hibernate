package HibernateMaven.edu.lavanya.learn.hibernate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity  

public class CreditCard extends Payment {
	private String CreditCardType;

	public String getCreditCardType() {
		return CreditCardType;
	}

	public void setCreditCardType(String creditCardType) {
		CreditCardType = creditCardType;
	}

	public CreditCard() {
		super();
	}
	
	
}
