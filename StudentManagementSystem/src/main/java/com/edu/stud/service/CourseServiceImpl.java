package com.edu.stud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.stud.dao.Course;
import com.edu.stud.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseRepository courseRepository;

	@Override
	public Course saveCourse(Course course) {
		
		return courseRepository.save(course);
	}



}
