package com.edu.looping;

import java.util.Scanner;

public class SumOfSeries {
	void func1(int n) {
		double sum=0;
		//1+1/2+1/3....1/n
		for(int i=1;i<=n;i++) {
			sum+=1d/i;
		}
		System.out.println(sum);
		
	}
	void func2(int n) {
		//1-1/2+1/3-1/4+1/5....1/n
		double sum1=0,num;
		for(int i=1;i<=n;i++) {
			num=i;
			if(num%2==0) {
				num=(-1*num);
				sum1+=(1d/num);
			}
			else {
				sum1+=(1d/num);
			}
		}
		System.out.println(sum1);
	}
	void func3(int n) {
		//1+1/1!+1/2!+1/3!....1/n!
		double sum2=0;int fact;
		for(int i=1;i<=n;i++) {
			fact=1;
			for(int j=1;j<=i;j++) {
				fact*=j;
			}
			sum2+=1d/fact;
		}
		System.out.println(sum2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		n=sc.nextInt();
		SumOfSeries s = new SumOfSeries();
		s.func1(n);
		s.func2(n);
		s.func3(n);
	}

}
