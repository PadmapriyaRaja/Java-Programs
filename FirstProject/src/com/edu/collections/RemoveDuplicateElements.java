package com.edu.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		
		ArrayList<Integer> lst = new ArrayList<Integer>();
		lst.add(56);
		lst.add(75);
		lst.add(75);
		lst.add(67);
		lst.add(67);
		
		System.out.println(lst);
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>(lst);
		
//		for(int i : lst) {
//			lhs.add(i);
//		}
		
		System.out.println(lhs);
		
		//swap
		ArrayList<Integer> arr = new ArrayList<>(lhs);
		
		Collections.swap(arr, 0, 2);
		System.out.println(arr);
	}

}
