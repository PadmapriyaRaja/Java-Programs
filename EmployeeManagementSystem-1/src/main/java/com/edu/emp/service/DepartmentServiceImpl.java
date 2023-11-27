package com.edu.emp.service;

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

@Service
public class DepartmentServiceImpl implements DepartmentService {
@Autowired
private DepartmentRepository departmentRepository;
	@Override
	public Department saveDepartment(Department department) {
		
		return departmentRepository.save(department);
	}
	@Override
	public List<Department> getAllDepartment() {
	
		return departmentRepository.findAll();
	}
	@Override
	public Department getDepartmentById(Integer departmentid) throws GlobalException {
	
		 Optional<Department> dept = departmentRepository.findById(departmentid);
		 if(dept.isPresent()) {
			 dept.get();
		 }else {
			 throw new GlobalException("Department id = "+departmentid+" is not present ");
		 }
		return null;
		
	}
//	@Override
//	public String deleteDepartmentById(Integer departmentid) throws GlobalException {
//		Optional<Department> dept = departmentRepository.findById(departmentid);
//		if(dept.isPresent()) {
//			departmentRepository.deleteById(departmentid);
//			return "Record is deleted";
//		}else {
//			throw new GlobalException("Department id ="+departmentid+" is not preset.Deletion is not possible");
//		}
//		
//	}
	@Override
	public List<Department> deleteDepartmentById(Integer departmentid) {
		
		departmentRepository.deleteById(departmentid);
		return departmentRepository.findAll();
	}
	@Override
	public Department putDepartment(Integer departmentid, Department department) {
		
		Department dept =  departmentRepository.findById(departmentid).get();
		
		if(dept != null) {
			dept.setDepartmentname(department.getDepartmentname());
			dept.setDepatmentlocation(department.getDepatmentlocation());
		}
		return departmentRepository.save(dept);
		
	}
	@Override
	public Department getDepartmentByName(String departmentname) {
		// TODO Auto-generated method stub
		return departmentRepository.findByDepartmentname(departmentname);
	
	 // String departmentname
		// findByDepartmentname
		
		//findByDepartmentlocation
	}
	@Override
	public List<Department> getDepartmentsPagination(Integer pno, Integer psize) {
		
		Pageable pageable = PageRequest.of(pno-1,psize);
		
		List<Department> dlist = departmentRepository.findAll(pageable).getContent();
		
		return dlist;
	}
	
	

}
