package com.edu.streamop;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiExample {

	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<Integer>();
		
		lst.add(89);
		lst.add(9);
		lst.add(78);
		lst.add(96);
		lst.add(53);
		lst.add(44);
		
		//counting odd numbers using stream api
		long count = lst.stream().filter(i->i%2!=0).count();
		System.out.println("The odd number count is = "+count);
		
		//adding 5 to each element
		 List<Integer> l1 = lst.stream().sorted().map(i->i+5).collect(Collectors.toList());
		 System.out.println(l1);
	}

}
