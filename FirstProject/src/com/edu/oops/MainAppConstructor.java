package com.edu.oops;

class Product {
	int pid;
	String pname;

	public Product() {
		super(); // pid=0, pname=null
		pid = 12;
		pname = "tv";
	}

	public Product(int pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + "]";
	}

	void display() {
		System.out.println("Display method");
		System.out.println("Pid=" + pid);
		System.out.println("Pname=" + pname);
	}

}

public class MainAppConstructor {
	public static void main(String[] args) {
		Product pob = new Product(); // constructor is called
		System.out.println(pob);
		Product pob1 = new Product(23, "Mobile");
		System.out.println(pob1);
		pob.display(); // 12 tv
		pob1.display(); // 23 mobile
	}
}
