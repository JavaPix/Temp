package com.JavaConcepts.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDataExample {

	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Connection connection = null;
		Statement stmt = null;
		String URL = "jdbc:mysql://localhost:3306/employee";
		String username = "root";
		String password = "root";
		String sql = "UPDATE EMPLOYEE SET FIRST_NAME='Mahesh',LAST_NAME='Jayesh' WHERE DISIGNATION='Employee'";
		
		try {
			connection = DriverManager.getConnection(URL, username, password);
			stmt = connection.createStatement();
			int i = stmt.executeUpdate(sql);
			if(i!=0) {
				System.out.println("Data updated successfully");
			}else {
				System.out.println("Data not updated successfully");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(stmt!=null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
