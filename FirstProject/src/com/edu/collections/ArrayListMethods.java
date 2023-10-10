package com.edu.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListMethods {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 5 elements : ");

		for (int i = 1; i <= 5; i++) {
			list.add(sc.nextInt());
		}

		//Searching an element
		System.out.println("Enter the element need to be found :");
		int n = sc.nextInt();
		if (list.contains(n)) {
			System.out.println(n + " is present at the index " + (list.indexOf(n) + 1));
		} else {
			System.out.println(n + " is not present.");
		}
		
		//Removing an element
		System.out.println("Enter the element to be removed :");
		int r = sc.nextInt();
		list.remove(list.indexOf(r));
		
		//iterating 
		System.out.println("Iterating using an iterator");
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//iterating using for-each
		System.out.println("Iterating using foreach");
		for(int l : list) {
			System.out.println(l);
		}
		
		//iterating using for-each lambda expression
		System.out.println("Iterating using for-each using lambda expression");
		list.forEach(integer -> System.out.println(integer));
		
	}

}
