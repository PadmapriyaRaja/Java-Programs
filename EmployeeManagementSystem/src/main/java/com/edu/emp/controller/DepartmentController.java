package com.edu.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.emp.dao.Department;
import com.edu.emp.service.DepartmentInterface;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentInterface departmentinterface ;

	//http://localhost:8990/addDepartment
	@PostMapping("/addDepartment")
	public Department addDepartment(@RequestBody Department department) {
		return departmentinterface.addDepartment(department);
		
	}

}
