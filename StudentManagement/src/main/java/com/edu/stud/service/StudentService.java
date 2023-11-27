package com.edu.stud.service;

import java.util.List;

import javax.validation.Valid;

import com.edu.stud.dao.Student;

public interface StudentService {

	public Student addStudent(@Valid Student student);

	public List<Student> getAllStudent();

}
