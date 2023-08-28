package com.edu.arrays;

import java.util.Scanner;

public class SecondLargestEleArray {

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
		
		int l1=0,l2=0;
		for(int i=0;i<n;i++) {
			if(arr[i]>l1) {
				l2=l1;
				l1=arr[i];
			}
			else {
				l2=arr[i];
			}
		}
		System.out.println("The second largest element in the array is: "+l2);
	}

}
