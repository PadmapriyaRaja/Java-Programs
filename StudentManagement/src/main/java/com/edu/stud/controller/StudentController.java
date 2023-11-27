package com.edu.stud.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.edu.stud.dao.Student;
import com.edu.stud.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/addStudent")
	public Student addStudent(@Valid @RequestBody Student student) {
		return studentService.addStudent(student);
		
	}
	
	@GetMapping("/getAllStudent") //http://localhost:8080/getAllStudent
	public List<Student> getAllStudent(){
		return studentService.getAllStudent();
	}
	
}
