package com.edu.springcore;

public class Employee {
	private String empname;
	private int eage;
	public Employee(String empname,int eage) {
		this.empname = empname;
		this.eage = eage;
	}
	public void displayEmployee() {
		System.out.println("Employee name: "+empname);
		System.out.println("Employee age: "+eage);
	}
}
