package com.edu.interfaces;

interface intf1{
	void m1();
	default void m2() {
		System.out.println("Default method");
	}
}

interface intf2{
	void m3();
	default void m2() {
		System.out.println("Default method");
	}
}

class Impls implements intf1,intf2{

	@Override
	public void m3() {
		System.out.println("m3 method");
		
	}

	@Override
	public void m1() {
		System.out.println("m1 method");
		
	}

	@Override
	public void m2() {
		
		intf1.super.m2();
		intf2.super.m2();
	}
	
}

public class MainMultiInterface {

	public static void main(String[] args) {
		
		Impls iobj = new Impls();
		iobj.m1();
		iobj.m3();
		iobj.m2();
		
	}

}
