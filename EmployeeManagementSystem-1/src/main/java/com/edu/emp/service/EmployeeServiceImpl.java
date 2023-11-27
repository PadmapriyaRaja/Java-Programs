package com.edu.emp.service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.edu.emp.dao.Department;
import com.edu.emp.dao.Employee;
import com.edu.emp.error.GlobalException;
import com.edu.emp.repository.DepartmentRepository;
import com.edu.emp.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public Employee saveEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}

	@Override
	public Employee updateEmployee(Integer employeeid, Integer departmentid) {
		// TODO Auto-generated method stub
		
		//get Employee object and Department object using id
		
		Employee emp = employeeRepository.findById(employeeid).get();
		
		Department dept = departmentRepository.findById(departmentid).get();
		
		emp.updateEmployee(dept);
		
		return employeeRepository.save(emp);
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(Integer employeeid) throws GlobalException {
		
		//return employeeRepository.findById(employeeid).get();
		Optional<Employee> emp = employeeRepository.findById(employeeid);
		if(emp.isPresent()) {
			return emp.get();
		}else {
			throw new GlobalException("Employee id="+employeeid+"not present");
		}
	}

	@Override
	public String deleteEmployeeById(Integer employeeid) throws GlobalException {
		
//		employeeRepository.deleteById(employeeid);
//		return "Record deleted successfully";
		Optional<Employee> emp = employeeRepository.findById(employeeid);
		if(emp.isPresent()) {
			employeeRepository.deleteById(employeeid);
			return "Employee is deleted";
			}else {
				throw new GlobalException("Employee id="+employeeid+" not present.Deletetion is not possible");
			}
	}

	@Override
	public Employee getEmployeeByName(String employeename) {
		
		return employeeRepository.findByEmployeename(employeename);
	}

	@Override
	public Employee updateEmployeeSalaryById(float employeesalary, Integer employeeid) throws GlobalException {
		Optional<Employee> emp = employeeRepository.findById(employeeid);
		if(emp.isPresent()) {
			int i = employeeRepository.updateEmployeeSalaryById(employeesalary,employeeid); 
				return employeeRepository.findById(employeeid).get();	
			
		}else {
			throw new GlobalException("Employee id="+employeeid+" not found");
		}
		
		
	}

	@Override
	public Employee updateEmployeeSalaryByEmail(float employeesalary, String employeeemail, Integer employeeid) throws GlobalException {
		Optional<Employee> emp = employeeRepository.findById(employeeid);
		if(emp.isPresent()) {
			int i = employeeRepository.updateEmployeeSalaryByEmail(employeesalary,employeeemail,employeeid);
			return employeeRepository.findById(employeeid).get();
		}else {
			throw new GlobalException("Employee id="+employeeid+" not found");
		}
		
	}

	@Override
	public String deleteEmployeeByEmail(String employeeemail) throws GlobalException {
		
		Employee emp = employeeRepository.findByEmployeeemail(employeeemail);
		if(emp!= null) {
		 employeeRepository.delelteByEmail(employeeemail);
		return "Employee record is deleted";
		}else {
			throw new GlobalException("Employee email"+employeeemail+" not exist");
		}
	}

	@Override
	public List<Employee> getEmployeesPagination(Integer pno, Integer psize) {
		//Pagination
		
		Pageable pageable = PageRequest.of(pno-1,psize);
			
		List<Employee> elist = employeeRepository.findAll(pageable).getContent();
		return elist;
		
		
	}

	@Override
	public List<Employee> getEmployeeByDates(Date fdate, Date todate) {
		
		List<Employee> elist = employeeRepository.findByEmployeedateofbirthBetween(fdate,todate);
		return elist;
	}


	

	

}
