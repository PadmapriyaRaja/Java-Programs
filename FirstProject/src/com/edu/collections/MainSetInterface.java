package com.edu.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class MainSetInterface {

	public static void main(String[] args) {
		
		//HashSet
		HashSet<Integer> obj = new HashSet<>();
		
		//order is not guaranteed
		obj.add(45);
		obj.add(null);
		obj.add(98);
		obj.add(76);
		obj.add(96);
		obj.add(96);
		obj.add(8);
		obj.add(null);
		
		System.out.println(obj);
		
		//LinkedSet
		
		LinkedHashSet<Integer> lobj = new LinkedHashSet<>();
		
		//in same order as given input
		lobj.add(78);
		lobj.add(89);
		lobj.add(873);
		lobj.add(null);
		lobj.add(5);
		lobj.add(null);
		
		System.out.println(lobj);
		
		//TreeSet
		
		TreeSet<Integer> tobj = new TreeSet<>();
		
		//throws exception for null,order is not guaranteed,sorted by default ascending
		tobj.add(90);
		tobj.add(87);
		tobj.add(55);
		tobj.add(5);
		tobj.add(5);
		//tobj.add(null);
		
		System.out.println(tobj);
	}

}
