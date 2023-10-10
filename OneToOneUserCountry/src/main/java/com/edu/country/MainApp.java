package com.edu.country;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(UserCountry.class);
		config.addAnnotatedClass(Country.class);
		
		SessionFactory sf = config.buildSessionFactory();
		
		Session  ses = sf.openSession();
		
		Transaction tx = ses.beginTransaction();
		
		Country country = new Country("India");
		UserCountry user = new UserCountry("PadmaPriya",22);
		
		user.setCountry(country);
		ses.save(user);
		
		tx.commit();
		ses.close();

	}

}
