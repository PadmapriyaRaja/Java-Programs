package com.edu.arrays;

import java.util.Scanner;

public class LargeAndSmallofArray {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array:");
		n=sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		//largest element
		int large=0;
		for(int i=0;i<n;i++) {
			if(arr[i]>large) {
				large=arr[i];
			}
		}
		System.out.println("The largest element in the array is "+large);
		
		//smallest element
		int small=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			if(arr[i]<small) {
				small=arr[i];
			}
		}
		System.out.println("The smallest element in the array is "+small);
	}

}
