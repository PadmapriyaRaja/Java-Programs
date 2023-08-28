package com.edu.basicPrograms;

import java.util.Scanner;

public class Factorial {
   
//		int num;
//		long fact=1;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number");
//		num = sc.nextInt();
//		
//		for(int i=num;i>=1;i--) {
//			fact = fact*i;
//		}
//		
//		System.out.println("Factorial of a number "+fact);
    	int num;
    	long fact;
    	
    	void input() {
    		Scanner sc = new Scanner(System.in);
    		System.out.println("Enter number");
    		num = sc.nextInt();
    	}
    	
    	void findFactorial() {
    		fact = 1;
    		for(int i=num;i>=1;i--) {
    			fact = fact*i;
    		}
    		
    		System.out.println("Factorial of a number "+fact);
    	}
        public static void main(String[] args) {
        	Factorial fobj = new Factorial();
        	fobj.input();
        	fobj.findFactorial();
    		
	}
}


