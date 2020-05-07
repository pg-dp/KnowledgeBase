package com.aamir.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.aamir.hibernate.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {

		// Create Session Factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		// Create Session
		Session session = factory.getCurrentSession();

		try {
			int studentId = 1;

			// now get a new session and begin transaction
			session = factory.getCurrentSession();
			session.beginTransaction();

			// getting student id
			System.out.println("\n Getting student id: "+ studentId);
			
			// creating a student object and taking id
			Student myStudent = session.get(Student.class, studentId);

			System.out.println("Updating student..");
			myStudent.setFirstName("Aman");

			// commit transaction
			session.getTransaction().commit();

			// confirm message
			System.out.println("Done.");
		} finally {
			factory.close();
		}

	}

}
