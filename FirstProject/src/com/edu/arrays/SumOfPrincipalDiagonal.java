package com.edu.arrays;

import java.util.Scanner;

public class SumOfPrincipalDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row,col;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of row:");
		row=sc.nextInt();
		System.out.println("Enter the size of column:");
		col=sc.nextInt();
		
		int[][] arr = new int[row][col];
		System.out.println("Enter the elements:");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=sc.nextInt();
			}	
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}	
			System.out.println();
		}
		System.out.println("--------------------");
		
		int sum=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==j) {
					sum+=arr[i][j];
				}
			}
		}
		
		System.out.println("The sum of the principal diagonal of square matrix is:"+sum);

	}

}
