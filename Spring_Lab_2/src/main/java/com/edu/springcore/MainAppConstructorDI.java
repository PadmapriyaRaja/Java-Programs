package com.edu.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppConstructorDI {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springcore.xml");
		Employee e1 = (Employee) context.getBean("eobj");
		e1.displayEmployee();
		

	}

}
