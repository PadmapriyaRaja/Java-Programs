package com.edu.practice;

import java.util.Scanner;
class Source{
	int getSecondSmallest(int[] nums) {
		//selection sort for sorting
		for(int i=0;i<nums.length-1;i++) {
			int mini=i;
			for(int j=i+1;j<nums.length;j++) {
				if(nums[j]<nums[mini]) {
					mini = j;
				}
			}
			int temp = nums[mini];
			nums[mini]=nums[i];
			nums[i]=temp;
		}
		return nums[1];
	}
	 int getSecondLargest (int[] nums) {
//		 
//		 for(int i=0;i<nums.length-1;i++) {
//			 System.out.println("i="+nums[i]);
//			 for(int j=i+1;j<nums.length;j++) {
//				 System.out.println("j="+nums[j]);
//				 if(nums[i]>nums[j]) {
//					 int temp = nums[j];
//					 nums[j]=nums[i];
//					 nums[i] = temp;
//				 }
//			 }
//		 }
//		 for(int i=0;i<nums.length;i++) {
//			 System.out.print(nums[i]+" ");
//		 }
		 
		//Bubble sort
		 for(int i=0;i<nums.length;i++) {  
				for(int j=0; j<nums.length-i-1;j++) {
					if(nums[j]<nums[j+1]) {
						int temp=nums[j];
						nums[j]=nums[j+1];
						nums[j+1]=temp;
					}
				}
			}
				
			
       return nums[nums.length-2];
 }
}

public class Q1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.println("Enter the size of an array:");
		n=sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements of the array:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Source s = new Source();
		//System.out.println("The second smallest number is = "+s.getSecondSmallest(arr));
		System.out.println("The second largest number is = "+s.getSecondLargest(arr));
	}

}
