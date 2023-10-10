package com.edu.exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainCheckedException {

	public static void main(String[] args) throws IOException{   //checked exception 

		int age;
		String name;

		// InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter name");

		name = br.readLine();
		System.out.println("Name=" + name);

	}
}
