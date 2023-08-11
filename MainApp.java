package com.edu;
import java.util.Scanner;

class Student{
	  int studentid;
	  String studentname;
	  int studentage;
	  void inputStudentDetails() {
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println("Enter the Studentname=");
		  studentname = sc.nextLine();
		  
		  System.out.println("Enter the Studentid=");
		  studentid=sc.nextInt();
		  
		  System.out.println("Enter the Studentage=");
		  studentage=sc.nextInt();
		  
	  }
	  
	  void displayStudentDetails(){
	     System.out.println("Student id ="+studentid);
	     System.out.println("Student name="+studentname);
	     System.out.println("Student age ="+studentage);
	   }

	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + ", studentage=" + studentage + "]";
	}
	  
}

public class MainApp{
     public static void main(String args[]){
              System.out.println("Main");
             
              Student sob = new Student();
              sob.inputStudentDetails();
              sob.displayStudentDetails();
              System.out.println(sob);
                   
              Student sob1 = new Student();
              sob1.inputStudentDetails();
              sob1.displayStudentDetails();
              System.out.println(sob1);
          }
}