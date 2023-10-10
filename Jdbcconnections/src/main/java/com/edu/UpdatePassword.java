package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdatePassword {

	public static void main(String[] args) throws SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/my_db";
		String un = "root";
		String pass = "root";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);

		try {
			// load the driver
			Class.forName(driver);
			// Make the connection
			conn = DriverManager.getConnection(url, un, pass);
			// create a Statement
			stmt = conn.createStatement();
			System.out.println("Enter email id");
			String em = sc.next();
			// select * from login where emailid='admin@gmail.com'
			String s = "select * from login where emailid='" + em + "'";
			rs = stmt.executeQuery(s);
			if (rs.next()) {
				// System.out.println("user exists with email id "+rs.getString("emailid"));
				System.out.println("Enter password to change");
				String upass = sc.next();
				String pu = "update login set password='" + upass + "' where emailid='" + em + "'";
				int i = stmt.executeUpdate(pu);
				if (i > 0) {
					System.out.println("Password changed successfully");
				} else {
					System.out.println("Error occurred");
				}
			} else {
				System.out.println("User not exists with email id =" + em);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			stmt.close();
			rs.close();
			conn.close();
		}

	}

}
