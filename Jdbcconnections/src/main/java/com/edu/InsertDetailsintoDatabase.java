package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class InsertDetailsintoDatabase {

	public static void main(String[] args) {
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/my_db";
		String un = "root";
		String pass = "root";
		
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,un,pass);
			st = conn.createStatement();
			System.out.println("Enter the email id:");
			String em = sc.next();
			String sql = "select * from login where emailid = '"+em+"'";
			rs=st.executeQuery(sql);
			if(rs.next()) {
				System.out.println("The entered email id : '"+em+"' already exist.");
			}
			else {
				System.out.println("Enter the password:");
				String pu = sc.next();
				String in = "insert into login values('"+em+"','"+pu+"')";
				int i = st.executeUpdate(in);
				if(i>0) {
					System.out.println("Data inserted successfully..");
				}
				else {
					System.out.println("Error occured..");
				}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
