package com.edu;

import java.util.Scanner;

class Employee{
	
	int e_id;
	String name;
	String dept;
	double salary;
	char gender;
	
	void inputEmpDetails(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee id: ");
		e_id=sc.nextInt();
		
		System.out.println("Enter the  name: ");
		name = sc.nextLine();	
		sc.next();
		
		System.out.println("Enter the department: ");
		dept = sc.next();
		
		System.out.println("Enter the salary : ");
		salary=(double) sc.nextFloat();
		
		System.out.println("Enter the gender : ");
		gender = sc.next().charAt(0);
		
	}
	
	void displayEmpdetails() {
		
		System.out.println("Employee id : "+ e_id);
		System.out.println("name: "+ name);
		System.out.println("Department: "+dept);
		System.out.println("Salary: "+salary);
		System.out.println("Gender: "+gender);
		
		
	}
}

public class EmpDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.inputEmpDetails();
		emp.displayEmpdetails();
		
		Employee emp1 = new Employee();
		emp1.inputEmpDetails();
		emp1.displayEmpdetails();
		

	}

}
