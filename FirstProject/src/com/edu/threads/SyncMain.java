package com.edu.threads;

class MultiTable{
	synchronized void table(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n+"x"+i+"="+(n*i));
		}
	}
}

class MyThread1 extends Thread{

	MultiTable t1;
	public MyThread1(MultiTable table) {
		this.t1 = table;
	}
	public void run() {
	   t1.table(2);
	}
}

class MyThread2 extends Thread{
	MultiTable t2;
	public MyThread2(MultiTable table) {
		this.t2 = table;
	}
	public void run() {
		t2.table(8);
	}
	
}
public class SyncMain {

	public static void main(String[] args) {
		MultiTable table = new MultiTable();
		MyThread1 ob = new MyThread1(table);
		
		MyThread2 ob1 = new MyThread2(table);
		ob1.start();
		ob.start();
		
	}

}
