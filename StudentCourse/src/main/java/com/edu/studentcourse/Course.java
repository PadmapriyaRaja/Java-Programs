package com.edu.studentcourse;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Course {

	@Id
	private int courseid;
	private String coursename;
	
	@ManyToMany(mappedBy = "course")
	List<Student> student;
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int courseid, String coursename) {
		super();
		this.courseid = courseid;
		this.coursename = coursename;
	}
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Course [courseid=" + courseid + ", coursename=" + coursename + "]";
	}
	
}
