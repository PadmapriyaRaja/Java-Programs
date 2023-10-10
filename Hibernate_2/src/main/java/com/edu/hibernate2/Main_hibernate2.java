package com.edu.hibernate2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main_hibernate2 {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		
		config.configure();
		
		config.addAnnotatedClass(Course.class);
		
		SessionFactory sf = config.buildSessionFactory();
		
		Session ses = sf.openSession();
		
		Transaction tx = ses.beginTransaction();
		
		Course course = new Course(1,"Java full stack",2000f);
		ses.save(course);
		tx.commit();
		ses.close();
		
	}
}
