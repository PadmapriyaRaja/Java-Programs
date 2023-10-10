package com.edu;

public class Calculator {

	//Addition
	public int add(int i,int j) {
		int sum;
		sum=i+j;
		return sum;
	}
	
	//Subtraction
	public int sub(int i,int j) {
		int sub;
		sub = i-j;
		return sub;
	}
	
	//Multiplication
	public int multi(int i,int j) {
		int mul;
		mul = i*j;
		return mul;
	}
	
	//Division
	public int divi(int i,int j) {
		int quotient;
		quotient = i/j;
		return quotient;
	}
	
	//Modulo
	public int mod(int i,int j) {
		int mod;
		mod=i%j;
		return mod;
	}
}
