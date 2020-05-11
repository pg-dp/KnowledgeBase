package com.aamir.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.aamir.hibernate.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {

		// Create Session Factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		// Create Session
		Session session = factory.getCurrentSession();

		try {
			// use session object to save the java object
			System.out.println("Creating a new student object");
			Student tempStudent = new Student("Aamir", "Mohammed", "abc@gmail.com");

			// start a transaction
			session.beginTransaction();

			// save a student object
			System.out.println("Saving a student object");
			session.save(tempStudent);

			// commit transaction
			session.getTransaction().commit();

			// confirm message
			System.out.println("Done.");
		} finally {
			factory.close();
		}

	}

}
