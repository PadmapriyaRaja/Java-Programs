package com.edu.stud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.stud.dao.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
