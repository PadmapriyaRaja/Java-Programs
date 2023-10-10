package com.edu.onetomany;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainAppOneToMany {

	public static void main(String[] args) {
		
		/*Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Employee.class);
		config.addAnnotatedClass(Department.class);*/
		
		Configuration config = new Configuration()
				                   .configure()
				                   .addAnnotatedClass(Employee.class)
				                   .addAnnotatedClass(Department.class);
		
		SessionFactory sf = config.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		
//OneToOne bi-directional		
//		Department dept = new Department("CSE","Bangalore");
//		Employee emp = new Employee("Padma",22,20000);	
//		emp.setDept(dept);
//		dept.setEmployee(emp);		
//		ses.save(emp);
//		ses.save(dept);
		
//Onetomany-manytoone
		
//		Department dept = new Department("Production","Chennai");
//		Employee e1 = new Employee("Saravana",45638,20);
//		Employee e2 = new Employee("Swetha",23245,22);
//		Employee e3 = new Employee("Ramesh",23267,18);
//		
//		List<Employee> emplist  = new ArrayList<Employee>();
//		emplist.add(e1);
//		emplist.add(e2);
//		emplist.add(e3);
		
		
//		dept.setEmployee(emplist);
//		
//		ses.save(dept);
		
		Employee e1 = ses.load(Employee.class,1);
		System.out.println(e1);
		/*<property name="cache.use_second_level_cache">true</property>   
         <property name="cache.region.factory_class">org.hibernate.cache.ehcache.EhCacheRegionFactory</property>*/
		Employee e2 = ses.load(Employee.class, 1);
		System.out.println(e2);
		tx.commit();
		ses.close();

	}

}
