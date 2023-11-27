package com.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoLombokApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoLombokApplication.class, args);
		Employee eob = new Employee("Padma");
		System.out.println(eob);
		eob.setEmployeename("Priya");
		System.out.println(eob);
	}

}
