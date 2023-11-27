package com.edu.emp.service;

import java.util.List;

import com.edu.emp.dao.Department;
import com.edu.emp.error.GlobalException;

public interface DepartmentService {

	public Department saveDepartment(Department department);

	public List<Department> getAllDepartment();

	public Department getDepartmentById(Integer departmentid) throws GlobalException;

	public List<Department> deleteDepartmentById(Integer departmentid);

	public Department putDepartment(Integer departmentid, Department department);

	
	
	//public String deleteDepartmentById(Integer departmentid) throws GlobalException;

	public Department getDepartmentByName(String departmentname);

	public List<Department> getDepartmentsPagination(Integer pno, Integer psize);

}
