package com.edu.lambdaexp;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateExamp {

	public static void main(String[] args) {
		
		Predicate<Integer>  pt = (i)-> i>10;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num =sc.nextInt();
		boolean result = pt.test(num);
		System.out.println("RESULT="+result);

	}

}
