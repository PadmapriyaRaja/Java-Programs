package com.edu.conditionalStatements;

import java.util.Scanner;

public class GradeMarking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks obtained :");
		marks = sc.nextInt();

		
			if(marks>=90 && marks<=100) {
				System.out.println("Grade A");
			}
			else if(marks>=70 && marks<=89) {
				System.out.println("Grade B");
			}
			else if(marks>=50 && marks<=69) {
				System.out.println("Grade C");
			}
			else if(marks>=0 && marks<=49) {
				System.out.println("Grade D");
			}
	        else {
	        	System.out.println("Invalid marks");
	        }
//		
//		
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter your grade: ");
//		char grade =sc.next().charAt(0);
//		
//		if(grade=='A' || grade=='a') {
//			System.out.println("Your marks are between 90 and 100");
//		}
//		else if(grade=='B' || grade=='b') {
//			System.out.println("Your marks are between 70 and 89");
//		}
//		else if(grade=='C' || grade == 'c') {
//			System.out.println("Your marks are between 50 and 69");
//		}
//		else if(grade=='D' || grade =='d') {
//			System.out.println("Your marks are between 0 and 49");
//		}
//		else {
//			System.out.println("Invalid marks");
//		}
//		
	}

}
