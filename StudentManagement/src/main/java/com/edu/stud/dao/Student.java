package com.edu.stud.dao;

import java.sql.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer studentid;
	@Column(name="student_name", length = 50, nullable = false)
	@NotBlank(message = "Enter the Student Name ")
	private String studentname;
	@Min(value=18, message = "Age should be greter than 18")
	@Max(value=70, message = "Age should be less than 70")
	private Integer studentage;
	@Column(unique = true)
	@NotBlank(message = "Enter the student email")
	private String studentemailid;
	@Future
	private Date studentdate;
	
	@ManyToOne
	@JoinColumn(name="courseid" , referencedColumnName = "courseid")
	private Course course;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(@NotBlank(message = "Enter the Student Name ") String studentname,
			@Min(value = 18, message = "Age should be greter than 18") @Max(value = 70, message = "Age should be less than 70") Integer studentage,
			@NotBlank(message = "Enter the student email") String studentemailid, @Future Date studentdate) {
		super();
		this.studentname = studentname;
		this.studentage = studentage;
		this.studentemailid = studentemailid;
		this.studentdate = studentdate;
	}

	public Integer getStudentid() {
		return studentid;
	}

	public void setStudentid(Integer studentid) {
		this.studentid = studentid;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public Integer getStudentage() {
		return studentage;
	}

	public void setStudentage(Integer studentage) {
		this.studentage = studentage;
	}

	public String getStudentemailid() {
		return studentemailid;
	}

	public void setStudentemailid(String studentemailid) {
		this.studentemailid = studentemailid;
	}

	public Date getStudentdate() {
		return studentdate;
	}

	public void setStudentdate(Date studentdate) {
		this.studentdate = studentdate;
	}
	
	

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + ", studentage=" + studentage
				+ ", studentemailid=" + studentemailid + ", studentdate=" + studentdate + "]";
	}
	
	
	
	
}
