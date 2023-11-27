package com.edu.emp.controller;

import java.sql.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edu.emp.dao.Employee;
import com.edu.emp.error.GlobalException;
import com.edu.emp.repository.EmployeeRepository;
import com.edu.emp.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@PostMapping("/saveEmployee") //http://localhost:8990/saveEmployee
	public ResponseEntity<Employee> saveEmployee(@Valid @RequestBody Employee employee) {
		
		Employee emp1 = employeeRepository.findByEmployeeemailOrEmployeephonenumber(employee.getEmployeeemail(),employee.getEmployeephonenumber());
		if(emp1!=null) {
			System.out.println("Emailid or phone number already exist!");
			return ResponseEntity.badRequest().body(null);
		}
		Employee emp = employeeService.saveEmployee(employee);
		return new ResponseEntity<Employee>(emp,HttpStatus.CREATED);
		
	}
	
	@PutMapping("/updateEmployee/eid/{eid}/did/{did}") //http://localhost:8990/updateEmployee/eid/1/did/1
	public Employee updateEmployee(@PathVariable("eid") Integer employeeid,@PathVariable("did") Integer departmentid) {
		return employeeService.updateEmployee(employeeid,departmentid);
		
	}
	
	@GetMapping("/getAllEmployee") //http://localhost:8990/getAllEmployee
	public List<Employee> getAllEmployee(){
		return employeeService.getAllEmployee();
		
	}
	
	@GetMapping("/getEmployeeById/{eid}") //http://localhost:8990/getEmployeeById/1
	public Employee getEmployeeById(@PathVariable("eid") Integer employeeid) throws GlobalException {
		return employeeService.getEmployeeById(employeeid);
		
	}
	
	@GetMapping("/getEmployeeByName/name/{ename}") //http://localhost:8990/getEmployeeByName/name{ename}
	public Employee getEmployeeByName(@PathVariable("ename") String employeename) {
		return employeeService.getEmployeeByName(employeename);
		
	}
	
	@GetMapping("/getEmployeeByDates/{fromdate}/{todate}") //http://localhost:8990/getEmployeeByDates/{fromdate}/{todate}
	public List<Employee> getEmployeeByDates(@PathVariable("fromdate") Date fdate,@PathVariable("todate") Date todate){
		
		return employeeService.getEmployeeByDates(fdate,todate);
		
	}
	@GetMapping("/getEmployeesPagination/{pno}/{psize}")

	public ResponseEntity<List<Employee>> getEmployeesPagination(@PathVariable("pno") Integer pno, @PathVariable("psize") Integer psize){
		List<Employee> elist = employeeService.getEmployeesPagination(pno,psize);
		return ResponseEntity.ok(elist);
	}
	
	@DeleteMapping("/deleteEmployeeById/{eid}") //http://localhost:8990/deleteEmployeeById/1
	public String deleteEmployeeById(@PathVariable("eid") Integer employeeid) throws GlobalException {
		return employeeService.deleteEmployeeById(employeeid);
		
	}
	
	@DeleteMapping("/deleteEmployeeByEmail/{eemailid}") //http://localhost:8990/deleteEmployeeByEmail/priya@gmail.com
	public String deleteEmployeeByEmail(@PathVariable("eemailid") String employeeemail) throws GlobalException {
		return employeeService.deleteEmployeeByEmail(employeeemail);
		
	}
	
	
	@PutMapping("/updateEmployeeSalaryById/{esalary}/{eid}") //http://localhost:8990/updateEmployeeSalaryById/75000/2
	public Employee updateEmployeeSalaryById(@PathVariable("esalary") float employeesalary,@PathVariable("eid") Integer employeeid) throws GlobalException {
		return employeeService.updateEmployeeSalaryById(employeesalary,employeeid);
	}
	
	@PutMapping("/updateEmployeeSalaryByEmail/{esalary}/{eemail}/{eid}") //http://localhost:8990/updateEmployeeSalaryByEmail/55000/sneha@gmail.com/2
	public Employee updateEmployeeSalaryByEmail(@PathVariable("esalary") float employeesalary,@PathVariable("eemail") String employeeemail,@PathVariable("eid") Integer employeeid) throws GlobalException {
		return employeeService.updateEmployeeSalaryByEmail(employeesalary,employeeemail,employeeid);
		
	}
}
