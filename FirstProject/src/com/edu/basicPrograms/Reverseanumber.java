package com.edu.basicPrograms;

import java.util.Scanner;

public class Reverseanumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		int num1=num;
		int rem,reverse = 0;
		//without loop reversing a 3 digit number
		
//		rem=num%10;
//		reverse=(reverse*10)+rem;
//		num=num/10;
//		rem = num%10;
//		reverse=(reverse*10)+rem;
//		num=num/10;
//		reverse=(reverse*10)+num;
//		System.out.println(reverse);
		
		
		//with loop palindrome
		while(num>0) {
			rem=num%10;
			reverse = (reverse*10)+rem;
			num=num/10;
		}
		System.out.println(reverse);
		if(reverse==num1) {
			System.out.println("The given number is a palindrome");
		}
		else {
			System.out.println("The number is not a palindrome");
		}
	}

}
