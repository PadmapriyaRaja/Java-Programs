package com.edu.collections;

import java.util.ArrayList;
import java.util.Collections;

public class DynamicArray {

	public static void main(String[] args) {

		ArrayList<Integer> lst = new ArrayList<Integer>();
		
		lst.add(45);
		lst.add(80);
		lst.add(90);
		lst.add(75);
		lst.add(78);
		System.out.println("Integer arraylist : "+lst);
		Collections.sort(lst);
		System.out.println("Integer arraylist : "+lst);
		Collections.reverse(lst);
		System.out.println("Integer arraylist : "+lst);
		Collections.shuffle(lst);
		System.out.println("Integer arraylist : "+lst);
		
		
		ArrayList<String> lst1 = new ArrayList<String>();
		
		lst1.add("Hi,");
		lst1.add("Hello,");
		lst1.add("How");
		lst1.add("are");
		lst1.add("you");
		System.out.println("String arraylist : "+lst1);
		
		ArrayList<Float> lst2 = new ArrayList<Float>();
		
		lst2.add(4.5f);
		lst2.add(5.6f);
		lst2.add(7.88f);
		lst2.add(3.34f);
		System.out.println("Float arraylist : "+lst2);
		
		ArrayList<Double> lst3 = new ArrayList<Double>();
		
		lst3.add(4.567);
		lst3.add(5.68976);
		lst3.add(7.88786);
		lst3.add(3.34564);
		System.out.println("Double arraylist : "+lst3);

	}

}
