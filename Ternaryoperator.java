package com.edu;

import java.util.Scanner;

public class Ternaryoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,c,d,l1,l2,l3;

		System.out.println("Enter the  first number=");
		a=sc.nextInt();
		System.out.println("Enter the second number=");
		b=sc.nextInt();
		System.out.println("Enter the third number=");
		c=sc.nextInt();
		System.out.println("Enter the fourth number=");
		d=sc.nextInt();
		
		l1=largeoftwo(a,b);
		l2=largeofthree(a,b,c);
		l3=largeoffour(a,b,c,d);
		
		System.out.println("The largest of " +a+ "," +b+ " is: "+ l1);
		System.out.println("The largest of " +a+ "," +b+ "," +c+ " is: " +l2);
		System.out.println("The largest of " +a+ "," +b+ "," +c+ ","+d+" is: "+ l3);
	}
	
	public static int largeoftwo(int a,int b){
		int ans = (a>b)?a:b;
		return ans;
	}
	
	public static int largeofthree(int a,int b,int c) {
		int ans = (a>b && a>c)?a:(b>c && b>a)?b:c;
		return ans;
	}
	
	public static int largeoffour(int a,int b,int c,int d) {
		int ans =(a>b && a>c && a>d)?a:(b>a && b>c && b>d)?b:(c>a && c>b && c>d)?c:d;
		return ans;
	}

}
