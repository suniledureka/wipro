package com.wipro.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.wipro.hibernate.entities.Product;
import com.wipro.hibernate.utils.HibernateUtils;

public class SaveProduct {

	public static void main(String[] args) {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Product prod1 = new Product("Mobile Phone", 75000f);
		Product prod2 = new Product("Laptop", 85675.5f);
		Product prod3 = new Product("Desktop", 52750f);
		
		session.persist(prod1);
		session.persist(prod2);
		session.persist(prod3);
		
		tx.commit();
		
		session.close();
		sfactory.close();
	}

}
