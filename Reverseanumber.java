package com.edu;

import java.util.Scanner;

public class Reverseanumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(num);
		int rem,reverse = 0;
		rem=num%10;
		reverse=(reverse*10)+rem;
		num=num/10;
		rem = num%10;
		reverse=(reverse*10)+rem;
		num=num/10;
		reverse=(reverse*10)+num;
		System.out.println(reverse);

	}

}
