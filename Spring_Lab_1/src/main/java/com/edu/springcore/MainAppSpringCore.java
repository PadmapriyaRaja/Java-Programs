package com.edu.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppSpringCore {

	public static void main(String[] args) {
		/*For spring object should not be created
		 * Student stobj = new Student();
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("springcontext.xml");
//		Student sobj =(Student) context.getBean("stobj");
//		sobj.Display();

	}

}
