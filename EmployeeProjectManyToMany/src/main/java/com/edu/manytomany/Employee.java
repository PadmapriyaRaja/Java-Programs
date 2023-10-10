package com.edu.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Employee {

	@Id
	private int employeeid;
	private String employeename;
	
	//relation
	@ManyToMany
	@JoinTable
	(name = "empproject",
	joinColumns = 
	{@JoinColumn(name = "employeeid")},
	inverseJoinColumns = 
	{@JoinColumn(name = "projectid")}
	)
	List<Project> project;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int employeeid, String employeename) {
		super();
		this.employeeid = employeeid;
		this.employeename = employeename;
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
	
	public List<Project> getProject() {
		return project;
	}
	public void setProject(List<Project> project) {
		this.project = project;
	}
	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", employeename=" + employeename + "]";
	}
	
	
}
