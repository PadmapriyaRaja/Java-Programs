package com.edu.emp.service;

import java.sql.Date;
import java.util.List;

import com.edu.emp.dao.Employee;
import com.edu.emp.error.GlobalException;

public interface EmployeeService {

	public Employee saveEmployee(Employee employee);

	public Employee updateEmployee(Integer employeeid, Integer departmentid);

	public List<Employee> getAllEmployee();

	public Employee getEmployeeById(Integer employeeid) throws GlobalException;

	public String deleteEmployeeById(Integer employeeid) throws GlobalException;

	public Employee getEmployeeByName(String employeename);

	public Employee updateEmployeeSalaryById(float employeesalary, Integer employeeid) throws GlobalException;

	public Employee updateEmployeeSalaryByEmail(float employeesalary, String employeeemail, Integer employeeid) throws GlobalException;

	public String deleteEmployeeByEmail(String employeeemail) throws GlobalException;

	public List<Employee> getEmployeesPagination(Integer pno, Integer psize);

	public List<Employee> getEmployeeByDates(Date fdate, Date todate);

	

	
	

}
