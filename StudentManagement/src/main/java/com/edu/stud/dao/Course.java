package com.edu.stud.dao;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer courseid;
	@Column(name="Course_Name", length = 50, nullable = false)
	@NotBlank(message = "enter the course name")
	private String coursename;
	@Min(value=2000, message = "Minimum price is 2000")
	@Max(value=300000, message = "Maximum price is 300000")
	private float courseprice;
	
	@JsonIgnore
	@OneToMany(mappedBy = "course",cascade = CascadeType.ALL)
	Set<Student> student ;
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(@NotBlank(message = "enter the course name") String coursename,
			@Min(value = 2000, message = "Minimum price is 2000") @Max(value = 300000, message = "Maximum price is 300000") float courseprice) {
		super();
		this.coursename = coursename;
		this.courseprice = courseprice;
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

	public float getCourseprice() {
		return courseprice;
	}

	public void setCourseprice(float courseprice) {
		this.courseprice = courseprice;
	}

	@Override
	public String toString() {
		return "Course [courseid=" + courseid + ", coursename=" + coursename + ", courseprice=" + courseprice + "]";
	}
	
	

}
