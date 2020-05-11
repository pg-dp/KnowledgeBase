package com.aamir.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.aamir.hibernate.entity.Student;

public class QueryObject {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		// Create Session Factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		// Create Session
		Session session = factory.getCurrentSession();

		try {

			// start a transaction
			session.beginTransaction();

			// query students
			List<Student> theStudents = session.createQuery("from Student").getResultList();

			// display students
			displayStudents(theStudents);
			
			// query students with condition
			theStudents = session.createQuery("from Student s where s.lastName='Mohammed'").getResultList();

			// display students
			System.out.println("Students who have last name with Mohammed: "+ theStudents);
			displayStudents(theStudents);
			
			// commit transaction
			session.getTransaction().commit();

			// confirm message
			System.out.println("Done.");
		} finally {
			factory.close();
		}

	}

	private static void displayStudents(List<Student> theStudents) {
		for (Student tempStudent : theStudents) {
			System.out.println(tempStudent);
		}
	}

}
