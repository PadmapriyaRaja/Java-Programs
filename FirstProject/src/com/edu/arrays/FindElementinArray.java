package com.edu.arrays;

import java.util.Scanner;

public class FindElementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		n=sc.nextInt();
		
		int x;
		System.out.println("Enter the element to be found:");
		x=sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		boolean flag = true;int pos=-1;
		for(int i=0;i<n;i++) {
			if(arr[i]==x) {
				flag = false;
				pos=i;
				break;
			}
		}
		if(flag==false) {
			System.out.println("The element "+x+" is found in the array in the position "+(pos+1));
		}
		else {
			System.out.println("The element "+x+" is not found in the array.");
		}
		

	}

}
