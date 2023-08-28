package com.edu.oops;

import java.util.Scanner;

public class Stud {

	int age;
	String name;

	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student name");
		name = sc.nextLine();

		System.out.println("Enter age");
		age = sc.nextInt();
	}

	void display() {
		System.out.println("Name =" + name);
		System.out.println("Age=" + age);
	}

	public static void main(String args[]) {
		
		Stud sob = new Stud();
		sob.input();
		sob.display();
		Stud sob1 = new Stud();
		sob1.input();
		sob1.display();

	}

}
