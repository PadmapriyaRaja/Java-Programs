package com.edu.practice;

import java.util.Scanner;

public class Q2 {
	public static int distance(int t) {
		int u=(36*5)/18;//as intial velocity is 36km/hr converting to m/s.
		int a=5,d;
		d=(u*t)+((a*t*t)/2);
		return d;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t1,t2;
		//System.out.println("Enter the first time interval travelled in seconds =");
		t1=sc.nextInt();
		//System.out.println("Enter the second time interval travelled in seconds =");
		t2=sc.nextInt();
		
		System.out.println(distance(t1));
		System.out.println(distance(t2));
		
	}
	
	

}
