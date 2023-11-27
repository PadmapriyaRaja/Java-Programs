package com.edu;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")//connect to angular
@RestController
public class HelloWorldController {
   //create a method returns HelloWord
//	@GetMapping("/helloworld") //http://localhost:8990/helloworld
//	public String HelloWorld() {
//		 return "Hello World";
//	 }
//	
	/*
	 //create a method returns HelloWord with parameter
	@GetMapping("/helloworld/{name}") 
	public String HelloWorld() {
		 return "Hello "+name;
	 }
	 */
	
	@GetMapping("/helloworld") //http://localhost:8990/helloworld
	public HelloWorldBean HelloWorld() {
		//return new HelloWorldBean("Hello Padma");
		
		throw new RuntimeException("Some Error occurred ");
	 }
	
//	@GetMapping("/helloworld/{name}") 
//	public HelloWorldBean HelloWorld1(@PathVariable("name") String name) {
//		 return new HelloWorldBean("Hello "+name);
//	 }
	
}
