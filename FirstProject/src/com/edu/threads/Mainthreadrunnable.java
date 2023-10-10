package com.edu.threads;

class MyThread implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
		System.out.println("Thread = "+Thread.currentThread());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}
	
}


public class Mainthreadrunnable  {

	public static void main(String[] args)throws InterruptedException {
		 System.out.println("Thread="+Thread.currentThread());
		 MyThread mob = new MyThread();
		 Thread tob1 = new Thread(mob);
		 Thread tob2 = new Thread(mob);
		 tob1.setName("First");
		 tob2.setName("Second");
		 //tob1.setPriority(5); for setting priority even though setting priority the execution is decided by jvm
		 
		// System.out.println("Name = "+tob1.getName());
		 System.out.println("First isAlive "+tob1.isAlive());
		 System.out.println("second isAlive "+tob2.isAlive());
		 tob1.start();
		 System.out.println("First isAlive"+tob1.isAlive());
		 tob1.join();
		 System.out.println("First isAlive "+tob1.isAlive());
		 System.out.println("second isAlive "+tob2.isAlive());
		 tob2.start();
		 System.out.println("second isAlive "+tob2.isAlive());
		 
		
	}

}

