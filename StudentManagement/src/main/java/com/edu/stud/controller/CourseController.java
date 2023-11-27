package com.edu.stud.controller;


import java.util.List;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.edu.stud.dao.Course;
import com.edu.stud.service.CourseService;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@PostMapping("/addCourse") //http:localhost:8080/addCourse
	public Course addCourse(@Valid @RequestBody Course course) {
		return courseService.addCourse(course);
		
	}
	
	@GetMapping("/getAllCourse") //http://localhost:8080/getAllCourse
	public List<Course> getAllCourse(){
		return courseService.getAllCourse();
	}
	
}
