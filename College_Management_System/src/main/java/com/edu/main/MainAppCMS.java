package com.edu.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainAppCMS {

	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		config.configure()
		      .addAnnotatedClass(Subject.class)
		      .addAnnotatedClass(Teacher.class)
		      .addAnnotatedClass(Student.class);
		
		SessionFactory sf = config.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		tx.commit();
		ses.close();

	}

}
