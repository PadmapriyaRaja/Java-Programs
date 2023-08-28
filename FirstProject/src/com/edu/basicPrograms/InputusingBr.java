package com.edu.basicPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputusingBr {

	public static void main(String[] args) throws IOException,NumberFormatException{
		// TODO Auto-generated method stub
		String sname;
		int s_id;
		double s_fees;
		char gender;
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		System.out.println("Enter the student id : ");
		s_id= Integer.parseInt(br.readLine());
		
		System.out.println("Enter the student name : ");
		sname = br.readLine();
		
		System.out.println("Enter the student fees : ");
		s_fees=Double.parseDouble(br.readLine());
		
		System.out.println("Enter the student gender : ");
		gender=(char)br.read();
		
		System.out.println("Student ID : "+s_id);
		System.out.println("Student Name : "+sname);
		System.out.println("Student Fees : "+s_fees);
		System.out.println("Student Gender : "+gender);
		

	}

}
