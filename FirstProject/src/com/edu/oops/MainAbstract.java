package com.edu.oops;

abstract class Bank{
	abstract float rateOfIntrest();
	void compoundIntrest() {
		
	}
}

class Hdfc extends Bank{
	float rateOfIntrest() {
		return 6.3f;
	}
}

class Sbi extends Bank{
	float rateOfIntrest() {
		return 7.5f;
	}
}

class Citi extends Bank{
	float rateOfIntrest() {
		return 8f;
	}
}
public class MainAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Hdfc hob = new Hdfc();
//	     System.out.println("Rate of intrest of Hdfc bank is :"+hob.rateOfIntrest());
//	    Sbi sob = new Sbi();
//	      System.out.println("Rate of intrest of SBI bank is :"+sob.rateOfIntrest());
//	    Citi cob = new Citi();
//	      System.out.println("Rate of intrest of CITI bank is :"+cob.rateOfIntrest());
		//DYNAMIC METHOD DISPATCH having common reference of parent class and creating a object based on child class
		Bank bob;
		bob = new Hdfc();
		System.out.println("Rate of intrest of Hdfc bank is :"+bob.rateOfIntrest());
		bob = new Sbi();
		System.out.println("Rate of intrest of SBI bank is :"+bob.rateOfIntrest());
		bob = new Citi();
		System.out.println("Rate of intrest of CITI bank is :"+bob.rateOfIntrest());
	
	}

}
