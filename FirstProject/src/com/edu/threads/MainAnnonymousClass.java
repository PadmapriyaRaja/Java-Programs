package com.edu.threads;

public class MainAnnonymousClass {

	public static void main(String[] args) {
		System.out.println("Main method"+Thread.currentThread());
		Thread t1= new Thread() {
			public void run() {
				System.out.println("Run method"+Thread.currentThread());
			}
		};
		t1.start();
		
		new Thread() {
			public void run() {
				System.out.println("Run method1"+Thread.currentThread());
			}
		}.start();

	}

}
