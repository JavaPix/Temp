package com.JavaConcepts.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDataExample {

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
		String sql = "select * from employee";
		
		try {
			connection = DriverManager.getConnection(URL, username, password);
			stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println("----------");
				System.out.println(rs.getString("1")+" : "+rs.getString("2")+" : "+rs.getString("3")+" : "+rs.getString("4"));
				System.out.println("----------");
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
