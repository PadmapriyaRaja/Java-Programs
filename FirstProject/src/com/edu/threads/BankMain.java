package com.edu.threads;
class MyBank{
	float amt;
	
	public MyBank() {
		amt =1000;
	}
	synchronized void deposit(float damt) {
		System.out.println("Inside deposit");
		amt = amt +damt;
		System.out.println("Amount after deposit : "+amt);
		notify();
	}
	
	synchronized void withdraw(float wamt) throws InterruptedException {
		if(wamt>amt) {
			System.out.println("Insufficient balance for withdrawing");
			wait();
			amt = amt-wamt;
			System.out.println("Ampount after withdrawl : "+amt);
		}
		else {
			amt = amt-wamt;
			System.out.println("Ampount after withdrawl : "+amt);
		
		}
	}
}

public class BankMain {

	public static void main(String[] args) {
		MyBank bob = new MyBank();
		Thread t1 = new Thread() {
			public void run() {
				try {
					bob.withdraw(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		};
		t1.start();
		
		Thread t2 = new Thread() {
			public void run() {
				bob.deposit(3000);
			}
		};
		t2.start();
	}

}
