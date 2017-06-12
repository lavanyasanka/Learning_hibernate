package HibernateMaven.edu.lavanya.learn.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import HibernateMaven.edu.lavanya.learn.hibernate.Check;
import HibernateMaven.edu.lavanya.learn.hibernate.CreditCard;
import edu.lavanya.learn.hibernate.util.HibernateSessionFactory;

public class TestStratergy {

	public static void main(String[] args) {
		
		Payment p = new Payment();
		p.setAmount(3000);

		CreditCard c=new CreditCard();

		//c.setPaymentId(10);
		c.setAmount(2500);
		c.setCreditCardType("Visa");



		Check c1=new Check();

		//c1.setPaymentId(11);
		c1.setAmount(2600);
		c1.setCheckType("ICICI");

		Session session = null;
		Transaction transaction = null;
		try{
			session = HibernateSessionFactory.createSessionFactory().openSession();
			transaction = session.beginTransaction();
            session.save(p);
			session.save(c);
			session.save(c1);
			System.out.println("Object saved successfully.....!!");
			transaction.commit();
		}
		catch (Exception ex){
			ex.printStackTrace();
			}
		}

	}
