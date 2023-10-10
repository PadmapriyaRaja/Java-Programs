package com.edu.exceptionhandling;

import java.util.Scanner;

class Age extends Exception{
	public Age(String s) {
		super(s);
	}
}

public class Ageexception {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.println("Enter your age:");
		age = sc.nextInt();
		try {
			if(age<18) {
				throw new Age("Not eligible because your age is below 18");
			}
		}
		catch(Age e) {
			e.printStackTrace();
		}

	}

}
