package com.edu;


import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class MainApp {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Student.class);
		SessionFactory sf = config.buildSessionFactory();
		
		Session ses = sf.openSession();
		
		Transaction tx = ses.beginTransaction();
		
//		Student student = new Student(2,"Priya",25,667.5f);
//		ses.save(student); //insert command in mysql
		
//		Query<Student> q = ses.createQuery("from Student");
//		List<Student> slist = q.list();
//		Iterator<Student> iterator = slist.iterator();
//		while(iterator.hasNext()) {
//			Student sob = iterator.next();
//			System.out.println(sob.getStudentid()+" "+sob.getStudentname()+" "+sob.getStudentage()+" "+sob.getStudentfees());
//		}
		
//		Query<Student> q = ses.createQuery("update Student set studentname=:n where studentid=:id");
//		q.setParameter("n", "Kavitha");
//		q.setParameter("id",1);
//		int s = q.executeUpdate();
//		if(s>0) {
//			System.out.println("updated successfully");
//		}else {
//			System.out.println("error occured");
//		}
		
		Query<Student> q = ses.createQuery("delete from Student where studentid=:id");
		q.setParameter("id", 1);
		int s = q.executeUpdate();
		if(s>0) {
			System.out.println("deleted successfully");
		}
		else{
			System.out.println("error occurred not deleted.");
		}
		
		
		tx.commit();
		ses.close();
		

	}

}
