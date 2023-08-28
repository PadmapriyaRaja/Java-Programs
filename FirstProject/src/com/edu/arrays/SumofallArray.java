package com.edu.arrays;

import java.util.Scanner;

public class SumofallArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		//sum of all elements in array
		System.out.println("Enter the size of array:");
		n=sc.nextInt();
		
		int[] arr = new int[n];
		int sum=0;
		double avg=0;
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		System.out.println("The sum of the elements in an array: "+sum);
		avg=sum/n;
		System.out.println("The average of all the elements in an array: "+avg);
	}

}
