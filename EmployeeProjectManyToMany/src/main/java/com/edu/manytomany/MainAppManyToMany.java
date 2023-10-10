package com.edu.manytomany;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainAppManyToMany {

	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		config.configure()
		      .addAnnotatedClass(Employee.class)
		      .addAnnotatedClass(Project.class);
		SessionFactory sf = config.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		
		List<Employee> emplist = new ArrayList<Employee>();
		Employee e1 = new Employee(111,"Priya");
		Employee e2 = new Employee(112,"Barath");
		emplist.add(e1);
		emplist.add(e2);
		
		List<Project> plist = new ArrayList<Project>();
		Project p1 = new Project(1,"Hotel Management Angular");
		Project p2 = new Project(2,"ATM Project .Net");
		plist.add(p1);
		plist.add(p2);
		
		
		e1.setProject(plist);
		//p1.setEmployee(emplist);
		e2.setProject(plist);
		
		
		ses.save(e1);
		ses.save(e2);
		ses.save(p1);
		ses.save(p2);
		tx.commit();
		ses.close();
		      
	}

}
