package com.edu.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int courseid;
	@Column (name = "coursename")
	private String cname;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(String cname) {
		super();
		this.cname = cname;
	}
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "Course [courseid=" + courseid + ", cname=" + cname + "]";
	}
	
	
}
