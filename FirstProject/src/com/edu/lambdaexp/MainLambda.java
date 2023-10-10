package com.edu.lambdaexp;

@FunctionalInterface
interface MyInt{
	void display();
}

@FunctionalInterface
interface Addition{
	void add(int a,int b);
}

@FunctionalInterface
interface Subtraction{
	int sub(int a,int b);
}
//public class MainLambda implements MyInt {
//
//	@Override
//	public void display() {
//		System.out.println("display method");
//		
//	}
//	public static void main(String[] args) {
//		
//		MainLambda hob = new MainLambda();
//		hob.display();
//	}
//
//	
//
//}



public class MainLambda {

	public static void main(String[] args) {
		// no argument no return type
		MyInt mob = () -> {
			System.out.println("display method using lambda expression");
		};
		mob.display();
		
		MyInt mob1 = () ->  System.out.println("display method using -> in single line");
		mob1.display();
		
		
		//with argument no return type
		Addition aob = (int i,int j)->{
			int s= i+j;
			System.out.println("Sum="+s);
		};
		aob.add(9, 3);
		
		Addition aob1 = (int i,int j)->System.out.println("Sum="+(i+j));
		aob1.add(10, 3);
		
		Addition aob2 =(i,j)->System.out.println("Sum="+(i+j));
		aob2.add(4, 16);
		
		//with argument with return type
		Subtraction s = (i,j)->{
			int ans;
			ans=i-j;
			System.out.println("Difference="+ans);
			return ans;	
		};
		s.sub(9, 3);
		
		
	}
}
