package com.edu.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springcontext.xml");
		Employee eob = (Employee) context.getBean("eobj");
		eob.display();
	}

}
