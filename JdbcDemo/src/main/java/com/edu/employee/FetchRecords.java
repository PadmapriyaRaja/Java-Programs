package com.edu.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FetchRecords {

	public static void main(String[] args) {
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/my_db";
	String un="root";
	String pass = "root";
	Connection con = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	
		try {
			System.out.println("Display records");
			Class.forName(driver);
			con = DriverManager.getConnection(url,un,pass);
			String sql = "select * from employee";
			pst = con.prepareStatement(sql);
			rs=pst.executeQuery();
			System.out.println("EID\tENAME\tEAGE\tESALARY\tEEMAIL\tDEPTID");
			while(rs.next()) {
				System.out.println(rs.getInt("eid")+" "+rs.getString("ename")+" "+rs.getInt("eage")+" "+rs.getFloat("esalary")+" "+rs.getString("eemail")+" "+rs.getInt("deptid"));
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
