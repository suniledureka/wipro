package com.wipro.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.wipro.hibernate.entities.Student;
import com.wipro.hibernate.utils.HibernateUtils;

public class SearchStudent2 {

	public static void main(String[] args) {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();		
		Session session = sfactory.openSession();
		
		Student st = session.get(Student.class, 1001);
		//Student st = session.get(Student.class, 1234);
		
		if(st != null) {
			System.out.println(st);
		}else {
			System.out.println("no matching student found!!");
		}
		
		session.close();
		sfactory.close();
	}
}
