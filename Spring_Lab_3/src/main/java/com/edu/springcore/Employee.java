package com.edu.springcore;

public class Employee {
	private String ename;
	private int eage;

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public int getEage() {
		return eage;
	}
	
	public void setEage(int eage) {
		this.eage = eage;
	}
	public void display() {
		System.out.println("Employee name:"+ename);
		System.out.println("Employee age:"+eage);
	}

}
