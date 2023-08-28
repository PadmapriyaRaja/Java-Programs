package com.edu.oops;

abstract class Shape{
    abstract void area();
   void display(){
           System.out.println("Display parent shape");
   }
}

class Triangle extends Shape{

	@Override
	void area() {
		System.out.println("Area of triangle");
		
	}
      
	void display(){
        System.out.println("Display child");
	}
}
public class MainAbstract1 {

	public static void main(String[] args) {
		//Shape sob=new Shape();//no object for abstract
		Triangle tob=new Triangle();
		tob.area();
		tob.display();

	}

}
