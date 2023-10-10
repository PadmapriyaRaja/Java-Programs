package com.edu.exceptionhandling;

import java.util.Scanner;

class BankException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BankException(String s) {
		super(s);
	}
}

class Bank {
	float amt;

	public Bank() {
		amt = 1000;
	}

	public void depositAmount(float damt) {
		try {
			if (damt <= 0) {
				throw new BankException("Deposit amout should greater than zero");
			}
			else {
				amt = amt + damt;
				System.out.println("Amout after deposit " + amt);
			}
		} 
		catch (BankException e) {
			e.printStackTrace();
		}
		
	}

	// withdraw
	public void withdrawAmt(float wamt) {
		try {
			if (wamt <= 0) {
				throw new BankException("Withdraw amout should greater than zero");
			}

			else if (wamt > amt) {
				throw new BankException("Insufficient Balance");
			}
			else {
				amt = amt - wamt;
				System.out.println("Please collect Rs." + wamt);
				System.out.println("After withdraw your bank balance is " + amt);

			}
		} catch (BankException e) {
			e.printStackTrace();
		}
		
		
	}
}

public class BankApp {
	public static void main(String args[]) {
		Bank bob = new Bank();
		float uamt = 0;
		int ch=0;
		Scanner sc = new Scanner(System.in); 
		while(ch!=3) {
			System.out.println("Enter your choice");
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Exit");
			ch = sc.nextInt();
		switch (ch) {
		case 1: System.out.println("Enter amount to deposit");
			uamt = sc.nextFloat();
			bob.depositAmount(uamt);
			break;
		case 2: System.out.println("Enter amount to withdraw");
			uamt = sc.nextFloat();
			bob.withdrawAmt(uamt);
			break;
		case 3:
			System.out.println("Terminated");
			System.exit(0);
		default:
			System.out.println("Invalid option");

		 }
		}

	}

}
