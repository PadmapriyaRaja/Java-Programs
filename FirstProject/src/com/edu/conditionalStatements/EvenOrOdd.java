package com.edu.conditionalStatements;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println("It is a even number");
		}
		else
		{
			System.out.println("It is a odd number");
		}

	}

}
