package com.wipro.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.wipro.hibernate.entities.Student;
import com.wipro.hibernate.utils.HibernateUtils;

public class DeleteStudent {

	public static void main(String[] args) {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();		
		Session session = sfactory.openSession();
		session.beginTransaction();
		
		/*
		//-- delete an entity - approach-1
		Student st = new Student(1003, "Sachin Tendulkar", "1234567890");
		session.delete(st);		
		*/
		
		//-- delete an entity - approach-2
		Student st = session.get(Student.class, 1006);
		
		if(st != null) {
			System.out.println(st); 
			//session.delete(st);
			session.remove(st);
		}else {
			System.out.println("no matching student found!!");
		}
		
		session.getTransaction().commit();
		
		session.close();
		sfactory.close();
	}
}
