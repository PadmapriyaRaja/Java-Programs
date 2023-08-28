package com.edu.basicPrograms;

import java.util.Scanner;

public class Fibanocciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 1 2 3 5 8 13 21 34.... nterms
		
			
			int terms, f1=1,f2=1,f3;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter number of terms");
			terms = sc.nextInt();
			
			System.out.println("Fibonacci Series ");
			System.out.print(f1+" "+f2+" ");
			
			for(int i=1;i<=terms-2;i++) {  
				f3 = f1+f2;
				System.out.print(f3+" ");  // 1  1  2
				 f1=f2 ;                        // f1 f2 f3
				 f2=f3;
			}
			
		
		
	}

}
