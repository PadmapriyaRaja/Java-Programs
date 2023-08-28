package com.edu.basicPrograms;

import java.util.Scanner;

class Solution {

    void printTriangle(int n) {
    	
    	for(int i=1;i<=n;i++)
        {
            //printing the spaces
            for(int k=(n-i);k>0;k--)
            {
                System.out.print(" ");
            }
            //printing numbers
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println("");
       }
  }
}

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int r1,r2,r3;
		r1 = sc.nextInt();
		r2=sc.nextInt();
		r3=sc.nextInt();
		Solution s = new Solution();
		s.printTriangle(r1);
		s.printTriangle(r2);
		s.printTriangle(r3);

	}

}
