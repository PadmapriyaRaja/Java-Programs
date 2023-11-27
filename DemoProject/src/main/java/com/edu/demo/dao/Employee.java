package com.edu.demo.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	//@Entity
	//instance variable-PK -@Id
	//const from superclass
	//const using fields
	//getter and setter
	//toString()
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)//auto-generation for primary key
	private Integer employeeid;
	private String  employeename;
	private String  employeeemail;
	private double  employeesalary;
	private String  employeephonenumber;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer employeeid, String employeename, String employeeemail, double employeesalary,
			String employeephonenumber) {
		super();
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.employeeemail = employeeemail;
		this.employeesalary = employeesalary;
		this.employeephonenumber = employeephonenumber;
	}

	public Integer getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(Integer employeeid) {
		this.employeeid = employeeid;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public String getEmployeeemail() {
		return employeeemail;
	}

	public void setEmployeeemail(String employeeemail) {
		this.employeeemail = employeeemail;
	}

	public double getEmployeesalary() {
		return employeesalary;
	}

	public void setEmployeesalary(double employeesalary) {
		this.employeesalary = employeesalary;
	}

	public String getEmployeephonenumber() {
		return employeephonenumber;
	}

	public void setEmployeephonenumber(String employeephonenumber) {
		this.employeephonenumber = employeephonenumber;
	}

	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", employeename=" + employeename + ", employeeemail="
				+ employeeemail + ", employeesalary=" + employeesalary + ", employeephonenumber=" + employeephonenumber
				+ "]";
	}

	
	
	
	
	
	
}
