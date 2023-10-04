package com.edu.main;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Subject {

	@Id
	private int subjectid;
	private String subjectname;
	
	//relation with subject-teacher
	@ManyToOne
	@JoinColumn(name = "teacherid")
	private Teacher teacher;
	
	//relation with subject-student
	@ManyToMany
	@JoinTable(name = "studentsubject",
	joinColumns = {@JoinColumn(name = "subjectid")},
	inverseJoinColumns = {@JoinColumn(name = "studentid")}
	)
	private List<Student> student;
	
	
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Subject(int subjectid, String subjectname) {
		super();
		this.subjectid = subjectid;
		this.subjectname = subjectname;
	}
	public int getSubjectid() {
		return subjectid;
	}
	public void setSubjectid(int subjectid) {
		this.subjectid = subjectid;
	}
	public String getSubjectname() {
		return subjectname;
	}
	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}
	
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Subject [subjectid=" + subjectid + ", subjectname=" + subjectname + "]";
	}
	
	
}
