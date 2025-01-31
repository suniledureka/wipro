package com.wipro.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.wipro.hibernate.entities.Address;
import com.wipro.hibernate.entities.Employee;
import com.wipro.hibernate.utils.HibernateUtils;

public class O2OMapping {

	public static void main(String[] args) {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();

		Transaction tx = session.beginTransaction();

		Employee emp = new Employee();
		emp.setEmployeeName("Sanjay Patil");

		Address addr = new Address();
		addr.setStreet("Mothinagar");
		addr.setCity("Hyderabad");
		addr.setState("Telangana");

		emp.setEmployeeAddress(addr);
		
		session.persist(emp);
		
		tx.commit();

		session.close();
		sfactory.close();

	}

}
