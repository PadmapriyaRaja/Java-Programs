package com.edu.emp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edu.emp.dao.Department;
import com.edu.emp.dao.Employee;
import com.edu.emp.error.GlobalException;
import com.edu.emp.repository.DepartmentRepository;
import com.edu.emp.service.DepartmentService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class DepartmentController {
	//Inject an object of service interface
	@Autowired
	private DepartmentService departmentService;
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	// Insert into database
//	@PostMapping("/saveDepartment") //http://localhost:8990/saveDepartment
//	public Department saveDepartment(@Valid @RequestBody Department department) {
//		return departmentService.saveDepartment(department);
//		
//	}
	
	@PostMapping("/saveDepartment")
	public ResponseEntity<Department> saveDepartment(@Valid @RequestBody Department department){
		//departmentname is unique check whether it exist
		Department dept1 = departmentRepository.findByDepartmentname(department.getDepartmentname());
		
		if(dept1!=null) {
			System.out.println("Department name already exist!");
			return ResponseEntity.badRequest().body(null);
		}
		
		Department dept = departmentService.saveDepartment(department);
		return new ResponseEntity<Department>(dept,HttpStatus.CREATED);
	}
	
	
	//Retrive All DEpartments(select * from department)
	
	@GetMapping("/getAllDepartment") //http://localhost:8990/getAllDepartment
	public List<Department> getAllDepartment(){
		return departmentService.getAllDepartment();
	}
	
	//select * from department where departmentid =?
	@GetMapping("/getDepartmentById/{did}") //http://localhost:8990/getDepartmentById/1
	public Department getDepartmentById(@PathVariable("did") Integer departmentid) throws GlobalException {
		return departmentService.getDepartmentById(departmentid);
		
	}
	
	//pagination
	@GetMapping("/getDepartmentsPagination/{pno}/{psize}")

	public ResponseEntity <List<Department>> getDepartmentsPagination(@PathVariable("pno") Integer pno, @PathVariable("psize") Integer psize){
		List<Department> dlist = departmentService.getDepartmentsPagination(pno,psize);
		return ResponseEntity.ok(dlist);
	}
	
	//find department by name
		//using naming convention
		
		@GetMapping("/getDepartmentByName/name/{dname}")
		public Department getDepartmentByName(@PathVariable("dname") String departmentname) {
			return departmentService.getDepartmentByName(departmentname);
			
		}
	
//	@DeleteMapping("/deleteDepartmentById/{did}") //http://localhost:8990/deleteDepartmentById/1
//	public String deleteDepartmentById(@PathVariable("did") Integer departmentid) throws GlobalException {
//		return departmentService.deleteDepartmentById(departmentid);
//		
//	}
	
	@DeleteMapping("/deleteDepartmentById/{did}") 
	public List<Department> deleteDepartmentById(@PathVariable("did") Integer departmentid) {
		return departmentService.deleteDepartmentById(departmentid);
		
	}
	
	//update set departmentname = ? where departmentid =?;
	@PutMapping("/putDepartment/{did}") //http://localhost:8990/putDepartment/3
	public Department putDepartmeant(@PathVariable("did") Integer departmentid,@RequestBody Department department ) {
		return departmentService.putDepartment(departmentid,department);
		
	}
	
	

}
