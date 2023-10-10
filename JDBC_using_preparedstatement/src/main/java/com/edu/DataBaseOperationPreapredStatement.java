package com.edu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DataBaseOperationPreapredStatement {
	private static  Connection con;
	//private static Statement st;
	private static String s;
	private static ResultSet rs;
	private static Scanner sc;
	private static String uemail,pu;
	private static PreparedStatement pst;
	
	public static void displayRecords() throws SQLException {
		System.out.println("Displaying Records...");
		 con = DataBaseConnectionPreparedStatement.getConnection();
		// st = con.createStatement();
		 s = "select * from login";
		 pst=con.prepareStatement(s);
		 rs = pst.executeQuery();
		 System.out.println("EmailId\t\tPassword");
		 while(rs.next()) {
			 System.out.println(rs.getString("emailid")+" "+rs.getString("password"));
		 }	
	}

	public static void addRecords() throws SQLException {
		
		System.out.println("Adding Records...");
		con = DataBaseConnectionPreparedStatement.getConnection();
		//st = con.createStatement();
		sc = new Scanner(System.in);
		System.out.println("Enter the email id of the record to be added:");
		 uemail = sc.next();
	     s  = "select * from login where emailid = ?";
	     pst = con.prepareStatement(s);
	     pst.setString(1, uemail);
	     rs = pst.executeQuery();
	     if(!rs.next()) {
	    	 System.out.println("Enter the password:");
	    	 pu = sc.next();
	    	 s = "insert into login values(?,?)";
	    	 pst = con.prepareStatement(s);
	    	 pst.setString(1, uemail);
	    	 pst.setString(2, pu);
	    	 int i = pst.executeUpdate();
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
		
		con = DataBaseConnectionPreparedStatement.getConnection();
		//st = con.createStatement();
		sc = new Scanner(System.in);
		System.out.println("Enter the email id of the record to be deleted:");
		 uemail = sc.next();
		 s  = "select * from login where emailid =?";
		 pst = con.prepareStatement(s);
		 pst.setString(1, uemail);
	     rs = pst.executeQuery();
	     //record should be deleted in databse
	     if(rs.next()) {
	    	 s = "delete from login where emailid = ?";
	    	 pst = con.prepareStatement(s);
	    	 pst.setString(1, uemail);
	    	 int i = pst.executeUpdate();
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
		con = DataBaseConnectionPreparedStatement.getConnection();
		//st = con.createStatement();
		sc = new Scanner(System.in);
		System.out.println("Enter the email id of the record to be updated:");
		 uemail = sc.next();
		 s  = "select * from login where emailid = ?";
		 pst = con.prepareStatement(s);
		 pst.setString(1, uemail);
	     rs = pst.executeQuery();
	     if(rs.next()) {
	    	 System.out.println("Enter new password to be changed:");
			 pu = sc.next();
	    	 s = "update login set password=? where emailid=?";
	    	 pst = con.prepareStatement(s);
	    	 pst.setString(1, pu);
	    	 pst.setString(2, uemail);
	    	 int i = pst.executeUpdate();
				if(i>0) {
					System.out.println("Updated data sucessfully...");
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


