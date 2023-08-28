package com.edu.basicPrograms;

import java.util.Scanner;

public class FactorsAndPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		num = sc.nextInt();
//FINDING FACTORS:
//		for(int i=1;i<=Math.sqrt(num);i++) {
//			if(num%i==0) {
//				System.out.print(i+" ");
//				if(num/i!=i) {
//				System.out.print(num/i+" ");}
//			}
//		}
		
//FINDING PRIME NUMBERS
		boolean flag = true;
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				flag = false;
			}
		}
		if(flag) {
			System.out.println(num+" is a prime number");
		}
		else {
			System.out.println(num+" is not a prime number");
		}
	    
		
	}
}
