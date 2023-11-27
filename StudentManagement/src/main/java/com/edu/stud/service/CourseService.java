package com.edu.stud.service;

import java.util.List;
import java.util.Set;

import javax.validation.Valid;

import com.edu.stud.dao.Course;

public interface CourseService {

	public Course addCourse(@Valid Course course);

	public List<Course> getAllCourse();

	


}
