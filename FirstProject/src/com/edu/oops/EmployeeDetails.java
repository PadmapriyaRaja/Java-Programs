package com.edu.oops;

import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int e_id;
		String first_name;
		String last_name;
		String dept;
		Double salary;
		char gender;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee id: ");
		e_id=sc.nextInt();
		
		System.out.println("Enter the first name: ");
		first_name=sc.next();
		
		System.out.println("Enter the last name: ");
		last_name=sc.next();
		
		System.out.println("Enter the department: ");
		dept = sc.next();
		sc.nextLine();
		
		System.out.println("Enter the salary : ");
		salary=(double) sc.nextFloat();
		
		System.out.println("Enter the gender : ");
		gender = sc.next().charAt(0);
		
		System.out.println("Employee id : "+e_id);
		System.out.println("First name: "+first_name);
		System.out.println("Last name: "+last_name);
		System.out.println("Department: "+dept);
		System.out.println("Salary: "+salary);
		System.out.println("Gender: "+gender);

	}

}
