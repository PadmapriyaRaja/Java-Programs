package com.edu.oops;

interface MyInt{
	int val=10;//public static and final by default
	void m1();//public abstract by default
	void m2();
	void m3();
}

class EduClass implements MyInt{
	public void m1(){
		System.out.println("m1 method");
	}
	public void m2(){
		System.out.println("m2 method");
    }
	public void m3() {
		System.out.println("m3 method");
	}
}

public class MainInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EduClass edu = new EduClass();
		edu.m1();
		edu.m2();
		edu.m3();

	}

}
