package com.edu.emp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.emp.dao.Department;
import com.edu.emp.repository.DepartmentRepository;

@Service
public class DepartmentInterfaceImpl implements DepartmentInterface {

	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public Department addDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepository.save(department);
	}
	

}
