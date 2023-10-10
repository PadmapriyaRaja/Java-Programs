package com.edu.lambdaexp;

import java.util.Scanner;

@FunctionalInterface
interface ValidateName{
	
	boolean checkUser(String username,String password);
}
public class FunctionExample2 {

	public static void main(String[] args) {
		
		String username = "Edubridge";
		String password = "admin123";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the username:");
		String uname = sc.nextLine();
		System.out.println("Enter the password:");
		String pwd = sc.nextLine();
		
		ValidateName va = (su,sp)->(su.equalsIgnoreCase(username) && sp.equals(password));
		
		if(va.checkUser(uname, pwd)) {
			System.out.println("Username and Password are correct.");
		}else {
			System.out.println("Username and password are mismatch.");
		}
		
		

	}

}
