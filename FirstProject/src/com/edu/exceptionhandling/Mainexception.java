package com.edu.exceptionhandling;

public class Mainexception {

	public static void main(String[] args) {
		int a = 10, b = 7, c = 0;
		int[] arr = new int[4];
		System.out.println("Before divison");
		/*
		 * 1) can have one try multiple catch block 2)can have one or more than one try
		 * and catch block 3)no statements shld be inbetween try and catch and finally
		 * 4)finally will executes t last
		 */
		try {
			c = a / b;
			arr[4] = 45;
		} catch (ArithmeticException e) {
			// will execute only when there is a exception
			System.out.println(e);
			e.printStackTrace();}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(e);
			System.out.println(e.getMessage());
		}
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println(e);
//		} 
			finally {
			System.out.println("finally");
		}

	}
//	try
//
//	{
//		c = 4 / 0;
//	}
//
//	catch(
//	ArithmeticException e)
//	{
//		e.printStackTrace();
//		// System.exit(0);
//		return;
//
//	}
//	catch(Exception e)
//	{
//		e.printStackTrace();
//	}finally
//	{
//
//		System.out.println("Finally");
//	}

}
