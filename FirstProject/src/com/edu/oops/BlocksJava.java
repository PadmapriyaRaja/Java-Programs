package com.edu.oops;

public class BlocksJava {
	static int staticvalue;
	int nonstaticvalue;
	static {
		System.out.println("static block will executes before the main");
	}
	{
	
		System.out.println("annonymous block , executes after main , on object creation before constructor");
	}
	public BlocksJava(){
		System.out.println("constuctor");
		staticvalue=10;
		nonstaticvalue=20;
	}
	void add() {
		staticvalue=staticvalue+1;
		nonstaticvalue=nonstaticvalue+1;
	}
	
	 void display() {
		System.out.println("display method");
		System.out.println("staticvalue="+staticvalue);
		System.out.println("nonstaticvalue="+nonstaticvalue);
		
	}

	public static void main(String[] args) {
		
		 System.out.println("main");
		 BlocksJava ob = new BlocksJava();
		 BlocksJava ob1 = new BlocksJava();
		// ob.display();
		 ob.add();
		 ob.display();
		 ob1.add();
		 ob1.display();

	}

}
