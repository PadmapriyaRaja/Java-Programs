package com.edu.emp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.emp.dao.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Integer> {

	Department findByDepartmentname(String departmentname);

}
