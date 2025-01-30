package com.wipro.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.hibernate.entities.Student;
import com.wipro.hibernate.utils.HibernateUtils;

public class SaveStudents {

	public static void main(String[] args) {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		
		Session session = sfactory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Student st1 = new Student(1002, "Sanjay", "8527419635");
		Student st2 = new Student(1003, "Sachin", "7527419635");
		Student st3 = new Student(1004, "Anirudh", "6527419635");
		Student st4 = new Student(1005, "Soma", "2527419635");
		Student st5 = new Student(1006, "Manu", "3527419635");
		
		session.persist(st1);
		session.persist(st2);
		session.persist(st3);
		session.persist(st4);
		session.persist(st5);
		
		System.out.println("-".repeat(100));
		
		tx.commit();
		
		session.close();
		sfactory.close();
	}

}
