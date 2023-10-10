package com.edu.studentcourse;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainAppManyToManySC {

	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		config.configure()
			  .addAnnotatedClass(Student.class)
			  .addAnnotatedClass(Course.class);
		SessionFactory sf = config.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		
		List<Student> studentlist = new ArrayList<Student>();
		Student s1 = new Student(1, "Padma");
		Student s2 = new Student(2,"Priya");
		studentlist.add(s1);
		studentlist.add(s2);
		
		List<Course> courselist = new ArrayList<Course>();
		Course c1 = new Course(111, "JFS");
		Course c2 = new Course(112, "AWS");
		courselist.add(c1);
		courselist.add(c2);
		
		s1.setCourse(courselist);
		s2.setCourse(courselist);
		ses.save(s1);
		ses.save(s2);
		ses.save(c1);
		ses.save(c2);
		tx.commit();
		ses.close();

	}

}
