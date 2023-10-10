package com.edu.exceptionhandling;

public class Mainthrowex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 0, c = 0;

		System.out.println("Before division");
		try {

			if (b == 0) {
				throw new ArithmeticException("Denominator is zero");
			} else {
				c = a / b;
			}

		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}

}
