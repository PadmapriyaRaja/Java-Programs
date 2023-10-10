package com.edu.interfaces;

interface EduInt {
	void method();

	default void methdef() { //java 8 feature having default method
		System.out.println("Default method");
	}

	public static void staticmethod() { //java 9 feature having static method
		System.out.println("static method");
	}
}



class Product implements EduInt {

	@Override
	public void method() {
		System.out.println("abstract method of interface");
		
	}

	

}

public class MainDefaultInterface {

	public static void main(String[] args) {
		Product ob = new Product();
		ob.method();
		ob.methdef();
		EduInt.staticmethod();

	}

}
