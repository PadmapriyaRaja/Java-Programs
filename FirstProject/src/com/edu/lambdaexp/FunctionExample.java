package com.edu.lambdaexp;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str = sc.nextLine();
		
		Function<String, Integer> fob = (s) -> s.length();
		
		Function<String, String> fu =(s)->s.toUpperCase();
		
		Function<String,String> fl = (s)->s.toLowerCase();
		
		int l = fob.apply(str);
		System.out.println("Length of the string:"+l);
		
		 System.out.println("The Uppercase string:"+fu.apply(str));
		 
		 System.out.println("The lowercase string:"+fl.apply(str));
		
	}

}
