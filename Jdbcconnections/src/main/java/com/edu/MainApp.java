package com.edu;

import java.sql.SQLException;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("********MENU********");
		System.out.println("1)DISPLAY RECORDS");
		System.out.println("2)ADD RECORDS");
		System.out.println("3)DELETE RECORDS");
		System.out.println("4)UPDATE RECORDS");
		
		System.out.println("Enter your choice:");
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1:
			DataBaseOperation.displayRecords();
			break;
		case 2:
			DataBaseOperation.addRecords();
			break;
		case 3:
			DataBaseOperation.deleteRecords();
			break;
		case 4:
			DataBaseOperation.updateRecords();
			break;
		default:
			System.out.println("Invalid input selection..");
		}
		System.out.println("Do you want to continue? y-Yes and any character for No.");
		char ch = sc.next().toLowerCase().charAt(0);
		if(ch!='y') {
			break;
		}
	  }
	}

}
