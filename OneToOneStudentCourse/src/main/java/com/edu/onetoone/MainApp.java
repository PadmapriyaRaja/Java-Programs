package com.edu.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(Course.class);
		config.addAnnotatedClass(StudentCourse.class);
		
		SessionFactory sf = config.buildSessionFactory();
		
		Session ses = sf.openSession();
		
		Transaction tx = ses.beginTransaction();
		
		Course cobj = new Course("JFS");
		StudentCourse sobj = new StudentCourse("Padma");
		
		//ses.save(cobj); //parent
		sobj.setCourse(cobj);
		ses.save(sobj); //child
		
		tx.commit();
		ses.close();

	}

}
