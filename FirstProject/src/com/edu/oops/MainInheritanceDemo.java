package com.edu.oops;

class Parent{
	 int i;  //default scope is with in package
	public Parent(){
		System.out.println("Parent constructor ");
		i=10;
	}
}
class Child extends Parent{
	 public Child() {
		 super();
		 System.out.println("Child Constructor");
	 }
	void display() {
		System.out.println("Value of i="+i);
	}
}
public class MainInheritanceDemo {

	public static void main(String[] args) {
		Child ob=new Child(); //calls the constructor
        ob.display();

	}

}
