package com.edu.threads;

class Hello extends Thread{
	
	public void run() {
		for(int i=1;i<5;i++) {
			System.out.println("Child Thread"+Thread.currentThread());
		}
	}
	
}
public class Mainthread {

	public static void main(String[] args) {
		System.out.println("Main"+Thread.currentThread());
		Hello ob = new Hello();
		Hello ob1 = new Hello();
		ob.setName("First");
		ob.setPriority(6);
		ob.start();
		
		ob.run();
		ob1.start();
	}

}
