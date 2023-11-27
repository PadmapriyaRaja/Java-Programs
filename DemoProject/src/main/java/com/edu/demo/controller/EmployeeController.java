package com.edu.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.edu.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	//@GetMapping - select
	//@PostMapping - insert
	//@PutMapping - update
	//@DeleteMapping - delete
	
	@Autowired
	private EmployeeService employeeService;
}
