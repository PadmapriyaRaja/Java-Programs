package com.edu.emp.dao;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employeeid")
	private Integer employeeid;
	
	@Column(name = "employeename",length =50,nullable = false)
	@NotBlank(message = "Employeename should not be blank")
	private String employeename;
	
	@Email(message = "Email should contain @ and .")
	@NotBlank(message ="Email should not be blank")
	@Column(name = "employeeemail",length = 30,unique = true)
	private String employeeemail;
	
	@Column(name = "employeesalary",nullable = false)
	@Min(value = 50000,message = "Minimum value should be 50000")
	@Max(200000)
	private float employeesalary;
	
	@Future(message = "Date should be a future date")
	private Date employeejoiningdate;//@past @future
	
	
	@Past(message = "Date should be a past date")
	private Date employeedateofbirth;
	
	@Column(name = "employeephonenumber" , length = 10,unique = true)
	private String employeephonenumber;
	
	//Relation between employee and department
	@ManyToOne
	@JoinColumn(name = "departmentid")
	private Department department;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String employeename, String employeeemail, @Min(50000) @Max(200000) float employeesalary,
			@Future Date employeejoiningdate, @Past Date employeedateofbirth, String employeephonenumber) {
		super();
		this.employeename = employeename;
		this.employeeemail = employeeemail;
		this.employeesalary = employeesalary;
		this.employeejoiningdate = employeejoiningdate;
		this.employeedateofbirth = employeedateofbirth;
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

	public float getEmployeesalary() {
		return employeesalary;
	}

	public void setEmployeesalary(float employeesalary) {
		this.employeesalary = employeesalary;
	}

	public Date getEmployeejoiningdate() {
		return employeejoiningdate;
	}

	public void setEmployeejoiningdate(Date employeejoiningdate) {
		this.employeejoiningdate = employeejoiningdate;
	}

	public Date getEmployeedateofbirth() {
		return employeedateofbirth;
	}

	public void setEmployeedateofbirth(Date employeedateofbirth) {
		this.employeedateofbirth = employeedateofbirth;
	}

	public String getEmployeephonenumber() {
		return employeephonenumber;
	}

	public void setEmployeephonenumber(String employeephonenumber) {
		this.employeephonenumber = employeephonenumber;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", employeename=" + employeename + ", employeeemail="
				+ employeeemail + ", employeesalary=" + employeesalary + ", employeejoiningdate=" + employeejoiningdate
				+ ", employeedateofbirth=" + employeedateofbirth + ", employeephonenumber=" + employeephonenumber + "]";
	}

	public void updateEmployee(Department dept) {
		this.department = dept;
		
	}
	
	
	

	
	
	
	
	
	
	

}
