package com.edu.strings;

import java.util.Scanner;

public class Intial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		
		String s="";
		s=str.charAt(0)+".";
		System.out.print(s);
		
		int pos = str.indexOf(' ');
		s=str.charAt(pos +1)+".";
	
	   int lpos=str.lastIndexOf(' ');
	   String ls=str.substring(lpos+1);
	   s=s+ls;
	   
	   System.out.print(s);
	}

}
