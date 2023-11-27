package com.edu.stud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edu.stud.dao.Course;
import com.edu.stud.service.CourseServiceImpl;

@RestController
public class CourseController {
	
	@Autowired
	private CourseServiceImpl courseServiceImpl;
	
	@PostMapping("/saveCourse")  //http://localhost:8080/saveCourse
	public Course saveCourse(@RequestBody Course course) {
		return courseServiceImpl.saveCourse(course);
		
	}

}
