package com.aamir.jdbc;

import java.sql.DriverManager;
import java.sql.Connection;

public class TestConnection {

	public static void main(String[] args) {
		
		String jdbcurl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String user = "hbstudent";
		String password = "hbstudent";
		
		
		try {
			System.out.println("Connecting to DataBase:" + jdbcurl );
			Connection myConn = DriverManager.getConnection(jdbcurl, user, password);
			System.out.println("Connection Success!!!" + myConn);
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		
	}

}
