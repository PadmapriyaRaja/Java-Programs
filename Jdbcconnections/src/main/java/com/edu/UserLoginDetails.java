package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserLoginDetails {

	public static void main(String[] args) {
		
		
				String driver="com.mysql.cj.jdbc.Driver";
				String url="jdbc:mysql://localhost:3306/my_db";
				String un="root";
				String pass="root";
				
				//1. Load the driver
				//2.Make the connection
				//3.create a statement object
				//execute or executeUpdate()
				
				try {
					//1. Load the driver
					//Class.forName("com.mysql.cj.jdbc.Driver");
					Class.forName(driver);
			Connection conn=DriverManager.getConnection(url,un,pass);
			    if(conn!=null) {
			    	System.out.println("connection established");
			    	Statement st = conn.createStatement();
			    	String sql = "select * from login";
			    	ResultSet rs = st.executeQuery(sql);
			    	while(rs.next()) {
			    		System.out.println(rs.getString("emailid")+ "  "+(rs.getString("password")));
			    	}
			    	
			    }
			    else {
			    	System.out.println("Not connected");
			    }
					
					
					
				}catch(Exception e) {
					e.printStackTrace();
				}

			}

		

	

}
