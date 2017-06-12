package HibernateMaven.edu.lavanya.learn.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "pay")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) 
public class Payment {
	@Id  
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private int paymentId;
	private double amount;
	
	
	//getters and setters
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Payment() {
		super();
	}
	
}
