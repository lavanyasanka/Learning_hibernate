package edu.lavanya.learn.hibernate.Test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.lavanya.learn.hibernate.model.Cart;
import edu.lavanya.learn.hibernate.model.Items;
import edu.lavanya.learn.hibernate.util.HibernateSessionFactory;

public class TestOneToMany {

	public static void main(String[] args) {

		Cart cart = new Cart();
		cart.setName("Lavanya's cart");

		Items items1 = new Items("Item1", 10, 1, cart);
		Items items2 = new Items("Item2", 20, 2, cart);
		Items items3 = new Items("Item3", 30, 3, cart);

		Set<Items> itemsSet = new HashSet<Items>();
		itemsSet.add(items1);
		itemsSet.add(items2);
		itemsSet.add(items3);

		cart.setItems(itemsSet);
		cart.setTotal(10*1 + 20*2 + 30*3);


		Session session = null;
		Transaction transaction = null;
		try{
			session = HibernateSessionFactory.createSessionFactory().openSession();
			transaction = session.beginTransaction();

			session.save(cart);
			session.save(items1);
			session.save(items2);
			session.save(items3);

			transaction.commit();
			System.out.println("Cart ID="+cart.getId());

		}
		catch (Exception ex){
			ex.printStackTrace();
		}

	}

}
