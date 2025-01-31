package com.wipro.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.MutationQuery;

import com.wipro.hibernate.entities.Student;
import com.wipro.hibernate.utils.HibernateUtils;

import jakarta.persistence.TypedQuery;

public class HQLTest {

	public static void main(String[] args) {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();
		
		/*
		String hql = "from com.wipro.hibernate.entities.Student";
		//Query<Student> q = session.createQuery(hql, Student.class);
		TypedQuery<Student> q = session.createQuery(hql, Student.class);
		List<Student> students = q.getResultList();
		printStudents(students);
		*/
		
		/*
		//String hql = "from com.wipro.hibernate.entities.Student where studentName='Sanjay'";
		//String hql = "from com.wipro.hibernate.entities.Student where studentName LIKE 's%'";
		String hql = "from com.wipro.hibernate.entities.Student where studentId IN (2020, 1009, 1005, 2025, 7500, 1001)";
		TypedQuery<Student> q = session.createQuery(hql, Student.class);
		List<Student> students = q.getResultList();
		printStudents(students);
		*/
		
		/*
		String hql = "from com.wipro.hibernate.entities.Student where studentId between ?1 and ?2"; //positional parameters
		TypedQuery<Student> q = session.createQuery(hql, Student.class);
		
		q.setParameter(1, 1001);
		q.setParameter(2, 1005);
		List<Student> students = q.getResultList();
		printStudents(students);
		*/
		
		/*
		String hql = "from com.wipro.hibernate.entities.Student where studentId between :minsid and :maxsid"; //named parameters
		TypedQuery<Student> q = session.createQuery(hql, Student.class);
		
		q.setParameter("minsid", 1006);
		q.setParameter("maxsid", 2500);
		List<Student> students = q.getResultList();
		printStudents(students);
		*/
		
		//-- DML operations using HQL
		String hql = "update com.wipro.hibernate.entities.Student set studentName='Praveen', studentMobile='1234567890' where studentId=1001";
		MutationQuery mutQuery = session.createMutationQuery(hql);
		session.beginTransaction();
		int entitiesUpdated = mutQuery.executeUpdate();
		System.out.println("students updated = " + entitiesUpdated);
		session.getTransaction().commit();
		
		session.close();
		sfactory.close();
	}

	private static void printStudents(List<Student> students) {
		students.forEach(stud -> {
			System.out.println(stud);
			try {
				Thread.sleep(500);
			}catch(Exception ex) {}
		});		
	}

}
