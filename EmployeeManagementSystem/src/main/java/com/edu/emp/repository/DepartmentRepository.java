package com.edu.emp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.emp.dao.Department;

public interface DepartmentRepository extends JpaRepository<Department,Integer>{

}
