package com.edu.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student_course")
public class StudentCourse {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentid; //auto generated
	@Column(name = "sname",length = 40,nullable = false)
	private String studentname;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cid")
	private Course course;
	public StudentCourse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentCourse(String studentname) {
		super();
		this.studentname = studentname;
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "StudentCourse [studentid=" + studentid + ", studentname=" + studentname + "]";
	}
	

}
