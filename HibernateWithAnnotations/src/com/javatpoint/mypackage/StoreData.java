package com.javatpoint.mypackage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class StoreData {
	public static void main(String[] args) {

		SessionFactory sf = new AnnotationConfiguration().configure(
				"hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		Employee employee = new Employee();
		employee.setId(5);
		employee.setFirstName("asdas");
		employee.setLastName("asdasdsfds");
		session.persist(employee);// persisting the object
		session.beginTransaction().commit();
		session.close();

		System.out.println("successful");
	}
}