package com.JavaConcepts.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableEx {

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
		String sql = "CREATE TABLE EMPLOYEE(ID NUMBER NOT NULL,FIRST_NAME VARCHAR2(200),LAST_NAME VARCHAR2(200),DISIGNATION VARCHAR2(200))";
		try {
			connection = DriverManager.getConnection(URL, username, password);
			stmt = connection.createStatement();
			boolean isExecuted = stmt.execute(sql);
			if (isExecuted) {
				System.out.println("Table created");
			} else {
				System.out.println("Table not created");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
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
