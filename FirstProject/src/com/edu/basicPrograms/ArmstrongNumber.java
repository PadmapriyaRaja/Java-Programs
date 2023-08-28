package com.edu.basicPrograms;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the number :");
		
		
		int  digit,sum=0,num;
		
		for(int i=1;i<=1000;i++) {
			
			num=i;
			
			sum=0;
			int count =(int)Math.floor(Math.log10(num))+1;
			
			while(num>0) {
			digit=num%10;
			sum+=Math.pow(digit,count);
			num=num/10;
			}
			
			if(sum==i) {
			   System.out.println("The given number "+i+" is a Armstrong number");
			}
			
		}

	}

}
