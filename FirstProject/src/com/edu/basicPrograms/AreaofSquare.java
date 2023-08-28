package com.edu.basicPrograms;

import java.util.Scanner;

public class AreaofSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,area;
		System.out.println("Enter the radius:");
		Scanner sc = new Scanner(System.in);
		r=sc.nextInt();
		area=r*r;
		System.out.println("The area of square is : "+area);
	}

}
