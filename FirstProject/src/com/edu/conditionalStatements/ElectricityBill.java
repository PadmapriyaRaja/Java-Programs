package com.edu.conditionalStatements;

import java.util.Scanner;
class Ebill{
	String consumer_name;
	int units,remaining_units;
	double total_price;
	
	void inputDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the consumer name:");
		consumer_name = sc.nextLine();
		
		System.out.println("Enter the number of units consumed:");
		units=sc.nextInt();
	}
	
	void calculation() {
		if(units>0 && units<=200) {
			total_price = units*3.80;
		}
		else if(units>200 && units<=300) {
			
			total_price = (200*3.80)+((units-200)*4.40);
		}
		else if(units>300 && units<=400) {
			
			total_price = (200*3.80)+(100*4.40)+(units-300)*5.10;
		}
		else {
			total_price = (200*3.80)+(100*4.40)+(100*5.10)+(units-400)*5.80;
		}
	}
}

public class ElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ebill e = new Ebill();
		e.inputDetails();
		e.calculation();
		System.out.println("The total amount to be paid by "+e.consumer_name+" is "+e.total_price);
		
	}

}
