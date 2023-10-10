package com.edu.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ocuurence {
	
	private static void countCharOccurence(String str) {
		
		str = str.toLowerCase();
		char[] ch_arr = str.toCharArray();
		
		HashMap<Character,Integer> cmap = new HashMap<Character,Integer>();
		
		for(char c : ch_arr) {
		if(c!=' ') {
			if(cmap.containsKey(c)) {
				cmap.put(c, cmap.get(c)+1);
			}
			else {
				cmap.put(c, 1);
			}
		}
			
		}
		
		for(Map.Entry<Character, Integer> entry : cmap.entrySet()) {
			
			System.out.println(entry.getKey()+"--->"+entry.getValue());
		}
		
	}
	
	private static void countWordOccurence(String my_str) {
		
		String str[] = my_str.split(" ");
		
		HashMap<String,Integer> smap = new HashMap<String,Integer>();
		
		for(String s : str) {
			
			if(smap.containsKey(s)) {
				smap.put(s, smap.get(s)+1);
			}
			else {
				smap.put(s, 1);
			}
		}
		
		for(Map.Entry<String, Integer> entry : smap.entrySet()) {
			
			System.out.println(entry.getKey()+"--->"+entry.getValue());
			
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String my_str = sc.nextLine();
		countCharOccurence(my_str);
		countWordOccurence(my_str);

	}

	

	

}
