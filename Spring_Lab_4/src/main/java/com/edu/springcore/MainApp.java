package com.edu.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springcontext.xml");
		Product pobj = (Product) context.getBean("product");
		pobj.productDisplay();
		

	}

}
