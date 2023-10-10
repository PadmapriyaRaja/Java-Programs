package com.edu.hibernate2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "courseTable")
public class Course {

@Id
private int courseid;
@Column(name="Cname",nullable=false,unique=true,length=40)
private String coursename;
private float coursefees;

public Course() {
	super();
	// TODO Auto-generated constructor stub
}
public Course(int courseid, String coursename, float coursefees) {
	super();
	this.courseid = courseid;
	this.coursename = coursename;
	this.coursefees = coursefees;
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
