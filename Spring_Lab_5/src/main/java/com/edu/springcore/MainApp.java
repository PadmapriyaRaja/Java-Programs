package com.edu.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext con = new AnnotationConfigApplicationContext(BeanConfig.class);
		EmployeeDetails emp = (EmployeeDetails)con.getBean("employeeDetails");
		emp.helloEmployee();

	}

}
