package com.edu;

import java.util.Scanner;

public class Votingeligiblity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		age=sc.nextInt();
		if(age==0) {System.out.println("Invalid age");}
		else {
		if(age>=18) {
			System.out.println("You are eligible for voting...");
		}
		else {
			System.out.println("You are not eligible..");
		}
		}
	}
}
