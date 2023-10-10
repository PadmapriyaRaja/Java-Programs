package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteDetails {

	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/my_db";
		String un = "root";
		String pass="root";
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
			rs = st.executeQuery(sql);
			if(rs.next()) {
				//Delete the data
				String del = "delete from login where emailid = '"+em+"'";
				int i = st.executeUpdate(del);
				if(i>0) {
					System.out.println("Deleted data sucessfully...");
				}
				else {
					System.out.println("Error occured...");
				}
			}
			else {
				System.out.println("Entered email id : '"+em+"' does not exist.");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
