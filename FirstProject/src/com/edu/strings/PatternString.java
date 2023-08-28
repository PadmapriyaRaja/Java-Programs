package com.edu.strings;

import java.util.Scanner;

public class PatternString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		
		if(str==null) {
			System.out.println("The string is empty");
		}
		
		for(int i=0;i<str.length();i++) {
			System.out.println(str.substring(0,i+1));
		}
		
		for(int i=str.length();i>0;i--) {
			System.out.println(str.substring(0,i));
		}
		
	}

}
