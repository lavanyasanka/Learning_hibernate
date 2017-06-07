package edu.lavanya.learn.hibernate.Test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.lavanya.learn.hibernate.model.Cart1;
import edu.lavanya.learn.hibernate.model.Items1;
import edu.lavanya.learn.hibernate.util.HibernateSessionFactory;

public class TestOneToManyAnnotation {

	public static void main(String[] args) {
		
		Cart1 cart = new Cart1();
		cart.setName("My Shopping Cart");
		
		Items1 item1 = new Items1("item1",30,1,cart);
		Items1 item2 = new Items1("item2",20,1,cart);
		Items1 item3 = new Items1("item3",10,1,cart);
		
		Set<Items1> items = new HashSet<Items1>();
		items.add(item1);
		items.add(item2);
		items.add(item3);
		
		cart.setItems1(items);
		cart.setTotal(10*1 + 20*1 + 30*1);
		
		Session session = null;
		Transaction trans = null;
		try{
			session =  HibernateSessionFactory.createSessionFactory().openSession();
			trans = session.beginTransaction();
			session.save(cart);
			session.save(item1);
			session.save(item2);
			session.save(item3);
			
			trans.commit();
			
			//System.out.println(cart);
			//System.out.println(items);
			session.close();
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
	}

}
