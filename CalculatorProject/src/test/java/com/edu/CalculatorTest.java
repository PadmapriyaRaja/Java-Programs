package com.edu;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
Calculator cob = new Calculator();
	@Test
	public void test() {
		int s = cob.add(4, 8);
		assertEquals(12,s);
	}
	
	@Test
	public void test1() {
		int s = cob.sub(10, 8);
		assertEquals(2,s);
	}
	
	@Test
	public void test2() {
		int s = cob.multi(10, 8);
		assertEquals(80,s);
	}
	
	@Test(expected = ArithmeticException.class)
	public void test3() {
		int s = cob.divi(15, 0);
		assertEquals(5,s);
	}
	
	@Test
	public void test4() {
		int s = cob.mod(13, 5);
		assertEquals(3,s);
	}
	
	

}
