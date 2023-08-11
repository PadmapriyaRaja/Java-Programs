package com.edu;

import java.util.Scanner;

public class PosOrNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		num=sc.nextInt();
		if(num==0) {System.out.println("It is neither positive nor negative");}
		else {
			if(num>0) {
				System.out.println("Positive number");
			}
			else {
				System.out.println("Negative number");
			}
		}
	}

}
