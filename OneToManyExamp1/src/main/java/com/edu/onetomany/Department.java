package com.edu.onetomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
//import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "department")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int  deptid;
	@Column(length=30,nullable=false)
	private String deptname;
	@Column(length=30,nullable=false)
	private String departmentlocation;
	
	//@OneToOne(mappedBy = "department")
	
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "departmentid")
	private List<Employee> employee;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(String deptname, String departmentlocation) {
		super();
		this.deptname = deptname;
		this.departmentlocation = departmentlocation;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getDepartmentlocation() {
		return departmentlocation;
	}
	public void setDepartmentlocation(String departmentlocation) {
		this.departmentlocation = departmentlocation;
	}
	
	public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", deptname=" + deptname + ", departmentlocation=" + departmentlocation
				+ "]";
	}
	
    
}
