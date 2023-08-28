package com.edu.basicPrograms;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		// using flag
//		for(int i=1;i<=100;i++) {
//			num=i;
//			boolean flag=true;
//			for(int j=2;j<=Math.sqrt(num);j++) {
//				if(num%j==0) {
//					 flag=false;
//				}
//				
//		   }
//			if(flag && num!=1) {
//				System.out.println(num);
//			}
//		}
		
		//using count
		int count=0;
		for(int i=1;i<=1000;i++) {
			count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(i+" ");
			}
		}
		
		
	}

}
