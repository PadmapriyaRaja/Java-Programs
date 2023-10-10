package com.edu;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DataBaseOperation {

	private static  Connection con;
	private static Statement st;
	private static String s;
	private static ResultSet rs;
	private static Scanner sc;
	private static String uemail,pu;
	
	
	public static void displayRecords() throws SQLException {
		System.out.println("Displaying Records...");
		 con = DataBaseConnection.getConnection();
		 st = con.createStatement();
		 s = "select * from login";
		 rs = st.executeQuery(s);
		 System.out.println("EmailId\t\tPassword");
		 while(rs.next()) {
			 System.out.println(rs.getString("emailid")+" "+rs.getString("password"));
		 }	
	}

	public static void addRecords() throws SQLException {
		
		System.out.println("Adding Records...");
		con = DataBaseConnection.getConnection();
		st = con.createStatement();
		sc = new Scanner(System.in);
		System.out.println("Enter the email id of the record to be added:");
		 uemail = sc.next();
	     s  = "select * from login where emailid = '"+uemail+"'";
	     rs = st.executeQuery(s);
	     if(!rs.next()) {
	    	 System.out.println("Enter the password:");
	    	 pu = sc.next();
	    	 s = "insert into login values('"+uemail+"','"+pu+"')";
	    	 int i = st.executeUpdate(s);
	    	 if(i>0) {
	    		 System.out.println("Registred successfully..");
	    	 }
	    	 else {
	    		 System.out.println("Error occured..");
	    	 }
	     }
	     else {
	    	 System.out.println(uemail+" already exit..");
	     }
		
		
	}

	public static void deleteRecords() throws SQLException {
		System.out.println("Deleting the Records");
		
		con = DataBaseConnection.getConnection();
		st = con.createStatement();
		sc = new Scanner(System.in);
		System.out.println("Enter the email id of the record to be added:");
		 uemail = sc.next();
		 s  = "select * from login where emailid = '"+uemail+"'";
	     rs = st.executeQuery(s);
	     //record should be deleted in databse
	     if(rs.next()) {
	    	 s = "delete from login where emailid = '"+uemail+"'";
	    	 int i = st.executeUpdate(s);
				if(i>0) {
					System.out.println("Deleted data sucessfully...");
				}
				else {
					System.out.println("Error occured...");
				}
	     }
	     else {
	    	 System.out.println(uemail+" does not exist. ");
	     }
		
	}

	public static void updateRecords() throws SQLException {

		System.out.println("Updating the Records");
		con = DataBaseConnection.getConnection();
		st = con.createStatement();
		sc = new Scanner(System.in);
		System.out.println("Enter the email id of the record to be added:");
		 uemail = sc.next();
		 s  = "select * from login where emailid = '"+uemail+"'";
	     rs = st.executeQuery(s);
	     if(rs.next()) {
	    	 System.out.println("Enter new password to be changed:");
			 pu = sc.next();
	    	 s = "update login set password='" + pu + "' where emailid='" + uemail + "'";
	    	 int i = st.executeUpdate(s);
				if(i>0) {
					System.out.println("Deleted data sucessfully...");
				}
				else {
					System.out.println("Error occured...");
				}
	    	 
	     }
	     else {
	    	 System.out.println(uemail+" does not exist.");
	     }
	}

}
