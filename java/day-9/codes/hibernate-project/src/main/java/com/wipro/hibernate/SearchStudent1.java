package com.wipro.hibernate;

import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.wipro.hibernate.entities.Student;
import com.wipro.hibernate.utils.HibernateUtils;

public class SearchStudent1 {

	public static void main(String[] args) {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();		
		Session session = sfactory.openSession();
		
		Student st = new Student();  //transient state
		System.out.println(st);
		
		try {
			//int sid = 1001;
			int sid = 1234;
			session.load(st, sid); //persistent state
		}catch(ObjectNotFoundException ex) {
			System.err.println(ex.toString());
		}
		
		System.out.println(st);
		
		session.close();
		sfactory.close();
	}
}
