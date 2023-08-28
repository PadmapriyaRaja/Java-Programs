package com.edu.conditionalStatements;

import java.util.Scanner;

public class DiscountCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String p_name;
		float p_price;
		float amount,dis;
		Scanner sc = new Scanner(System.in);
		System.out.println("Product name:");
		p_name = sc.nextLine();
		System.out.println("Product price:");
		p_price = sc.nextFloat();
		
//		if(p_price>0 && p_price<=10000) {
//			dis = p_price* 0.05f;
//			
//		}
//		else if(p_price>10000 && p_price<=20000 ) {
//			dis = p_price *0.10f;
//			
//		}
//		else if(p_price>20000 && p_price<=35000) {
//			dis = p_price*0.15f;
//			
//		}
//		else {
//			dis = p_price*0.20f;
//			
//		}
//		amount = p_price-dis;
//		System.out.println("The total amount should be paid for the product "+p_name+ " is :"+amount);
		
		if(p_price>0 && p_price<=1000) {
			dis = p_price*0.02f;
		}
		else if(p_price>1000 && p_price<=3000) {
			dis = p_price*0.10f;
		}
		else {
			dis=p_price*0.15f;
		}
		amount = p_price-dis;
		
		System.out.println("The total amount should be paid for the product "+p_name+ " is :"+amount);
		
	}

}
