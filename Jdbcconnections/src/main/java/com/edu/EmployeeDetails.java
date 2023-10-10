package com.edu;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeDetails {

	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/my_db";
		String un="root";
		String pass = "root";
		
		
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url,un,pass);
			if(conn!=null) {
		    System.out.println("Connection established");
			Statement st = conn.createStatement();
			String sql = "select * from employee";
			ResultSet rs = st.executeQuery(sql);
			System.out.println("EID\tENAME\tEAGE\tESALARY\tEEMAIL\tDEPTID");
			while(rs.next()) {
				System.out.println(rs.getInt("eid")+"   "+rs.getString("ename")+"  "+rs.getInt("eage")+"   "+rs.getFloat("esalary")+"  "+rs.getString("eemail")+"  "+rs.getInt("deptid"));
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

