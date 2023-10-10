package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/my_db";
		String un = "root";
		String pass = "root";
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		int eid = 0, eage = 0, edid = 0;
		String ename = null, email = null;
		float esal = 0;
		Scanner sc = new Scanner(System.in);

		String genid = "select max(eid)+1 as empid from employee";

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, un, pass);
			pst = conn.prepareStatement(genid);
			rs = pst.executeQuery();

			if (rs.next()) {
				eid = rs.getInt("empid");
				System.out.println("Employee id=" + eid);
			}
			System.out.println("Enter name");
			ename = sc.next();
			System.out.println("Enter emailid");
			email = sc.next();
			System.out.println("Enter salary");
			esal = sc.nextFloat();
			System.out.println("Enter age");
			eage = sc.nextInt();
			System.out.println("Enter deptid");
			edid = sc.nextInt();

			String ins = "insert into employee(eid,ename,eage,esalary,eemail,deptid) values(?,?,?,?,?,?)";
			pst = conn.prepareStatement(ins);
			pst.setInt(1, eid);
			pst.setString(2, ename);
			pst.setInt(3, eage);
			pst.setFloat(4, esal);
			pst.setString(5, email);

			String check = "select * from department where deptid=?";
			PreparedStatement pst1 = conn.prepareStatement(check);
			pst1.setInt(1, edid);
			ResultSet rs1 = pst1.executeQuery();
			if (rs1.next()) {
				pst.setInt(6, edid);
				int i = pst.executeUpdate();
				if (i > 0) {
					System.out.println("Employee added");
				} else {
					System.out.println("Error");
				}
			} else {
				System.out.println("department not exist");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
