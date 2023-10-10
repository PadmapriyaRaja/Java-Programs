package com.edu.onetomany;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Employee_table")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeid;
	@Column(length = 40,nullable = false)
	private String employeename;
	private  int employeeage;
	private float employeesalary;
	//private Date employeedob;
	

	@ManyToOne
	@JoinColumn(name = "departmentid")
	private Department dept;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String employeename, int employeeage, float employeesalary) {
		super();
		this.employeename = employeename;
		this.employeeage = employeeage;
		this.employeesalary = employeesalary;
		//this.employeedob = employeedob;
	}
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public int getEmployeeage() {
		return employeeage;
	}
	public void setEmployeeage(int employeeage) {
		this.employeeage = employeeage;
	}
	public float getEmployeesalary() {
		return employeesalary;
	}
	public void setEmployeesalary(float employeesalary) {
		this.employeesalary = employeesalary;
	}
//	public Date getEmployeedob() {
//		return employeedob;
//	}
//	public void setEmployeedob(Date employeedob) {
//		this.employeedob = employeedob;
//	}
	
	
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", employeename=" + employeename + ", employeeage=" + employeeage
				+ ", employeesalary=" + employeesalary +"]";
	}
	
	
}
