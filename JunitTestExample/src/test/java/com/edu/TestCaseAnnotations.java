package com.edu;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCaseAnnotations {
	
	@BeforeClass
	public static void beforeAllTest() {
		System.out.println("will execute only once before all test");
	}
	
	@Before
	public void beforeEachTest() {
		System.out.println("Before Each test case");
	}

	@Test
	public void test1() {
		System.out.println("test1");
	}
	
	@Test
	public void test2() {
		System.out.println("test2");	
	}
	
	@After
	public void AfterEachTest() {
		System.out.println("After Each test case");
	}
	
	@AfterClass
	public static void AfterAllTest() {
		System.out.println("will execute only once after all test");
	}
	
	

}
