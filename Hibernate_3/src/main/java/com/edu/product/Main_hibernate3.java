package com.edu.product;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main_hibernate3 {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		
		config.configure();
		
		config.addAnnotatedClass(Product.class);
		
		SessionFactory sf = config.buildSessionFactory();
		
		Session ses = sf.openSession();
		
		Transaction tx = ses.beginTransaction();
		//Transient state
		//Product product = new Product(2,"TV",160000f);
		//persistent state
		//ses.save(product);
		
		Product  product1 = ses.get(Product.class, 2);
		//Removed state
		ses.delete(product1);
		tx.commit();
		//detached state
		ses.close();
		
		

	}

}
