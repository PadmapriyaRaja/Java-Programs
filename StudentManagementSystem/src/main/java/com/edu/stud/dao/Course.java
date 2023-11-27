package com.edu.stud.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer courseid;
	private String coursename;
	private float coursefees;
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(String coursename, float coursefees) {
		super();
		this.coursename = coursename;
		this.coursefees = coursefees;
	}

	public Integer getCourseid() {
		return courseid;
	}

	public void setCourseid(Integer courseid) {
		this.courseid = courseid;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public float getCoursefees() {
		return coursefees;
	}

	public void setCoursefees(float coursefees) {
		this.coursefees = coursefees;
	}

	@Override
	public String toString() {
		return "Course [courseid=" + courseid + ", coursename=" + coursename + ", coursefees=" + coursefees + "]";
	}

	
	
	
	

}
