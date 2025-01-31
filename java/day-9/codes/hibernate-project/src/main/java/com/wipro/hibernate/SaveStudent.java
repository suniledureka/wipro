package com.wipro.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.hibernate.entities.Student;

public class SaveStudent {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");  
		
		SessionFactory sfactory = config.buildSessionFactory();		
		Session session = sfactory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Student st = new Student();
		st.setStudentId(1001);
		st.setStudentName("Praveen");
		st.setStudentMobile("9848586878");
		
		//session.save(st);
		session.persist(st);
		
		System.out.println("-".repeat(100));
		
		tx.commit();
		
		session.close();
		sfactory.close();
	}

}
