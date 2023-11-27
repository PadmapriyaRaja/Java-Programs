package com.edu.stud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.stud.dao.Course;

@Repository
public interface CourseRepository  extends JpaRepository<Course, Integer>{

}
