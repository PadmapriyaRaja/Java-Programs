package com.edu.emp.dao;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Department {
	
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer departmentid;
   
   @Column(name ="departmentname",length = 30,unique = true)
   @NotBlank(message = "Department name should not be blank")
   private String departmentname;
   
   @Column(name = "depatmentlocation",length = 40)
   @NotBlank(message = "Department location should not be blank")
   private String depatmentlocation;
   
   //Relation between employee and department
  
   @JsonIgnore
   @OneToMany(mappedBy = "department" , cascade = CascadeType.ALL)
   private List<Employee> employeelist;
   
   public Department() {
	super();
	// TODO Auto-generated constructor stub
   }
   
   public Department(String departmentname, String depatmentlocation) {
	super();
	this.departmentname = departmentname;
	this.depatmentlocation = depatmentlocation;
   }
   
   public Integer getDepartmentid() {
	   return departmentid;
   }
   
   public void setDepartmentid(Integer departmentid) {
	   this.departmentid = departmentid;
   }
   
   public String getDepartmentname() {
	   return departmentname;
   }
   
   public void setDepartmentname(String departmentname) {
	   this.departmentname = departmentname;
   }
   
   public String getDepatmentlocation() {
	   return depatmentlocation;
   }
   
   public void setDepatmentlocation(String depatmentlocation) {
	   this.depatmentlocation = depatmentlocation;
   }

   public List<Employee> getEmployeelist() {
	   return employeelist;
   }

   public void setEmployeelist(List<Employee> employeelist) {
	   this.employeelist = employeelist;
   }

@Override
public String toString() {
	return "Department [departmentid=" + departmentid + ", departmentname=" + departmentname + ", depatmentlocation="
			+ depatmentlocation + "]";
}


   
   
   
}
