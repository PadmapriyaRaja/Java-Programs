package com.edu.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Source1{
	
	
	boolean validate(String username,String password) {
		String dusername = "ABC";
		String dpwd = "DEF";
		List<String> pre1 = new ArrayList<String>();
		pre1.add(dusername);
		List<String> pre2 = new ArrayList<String>();
		pre2.add(dpwd);
		List<String> in1 = new ArrayList<String>();
		in1.add(username);
		List<String> in2 = new ArrayList<String>();
		in2.add(password);
//	List<Character> du = Arrays.asList('A','B','C');
//	
//		username.chars().mapToObj(c->(char)c).filter(su->su.).toString();
//		// password.chars().mapToObj(c->(char)c).filter(sp-> sp.equals(dpwd)).close();
		
		boolean res1 = in1.stream().anyMatch(pre1::contains);
		boolean res2 = in2.stream().anyMatch(pre2::contains);
		//in.stream().
		return res1&&res2;
	}
}

public class Q5 {

	public static void main(String[] args) {
		Source1 s = new Source1();
		Scanner sc = new Scanner(System.in);
		String uname = sc.nextLine();
		String pwd  = sc.nextLine();
		System.out.println(s.validate(uname, pwd));
	}

}
