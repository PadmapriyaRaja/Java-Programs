package com.edu.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExampleMain {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hmap = new HashMap<Integer,String>();
		
		hmap.put(11, "Padma");
		hmap.put(2, "Priya");
		hmap.put(34, "Padma");
		hmap.put(23,"Ramesh");
		hmap.put(11, "Padma");
		
		System.out.println("HashMap");
		for(Map.Entry<Integer, String> entry : hmap.entrySet()) {
			System.out.println("Key = "+entry.getKey()+" Value = "+entry.getValue());
		}
		
		LinkedHashMap<Integer,String> lhmap = new LinkedHashMap<Integer,String>();
		
		
		lhmap.put(11, "Padma");
		lhmap.put(2, "Priya");
		lhmap.put(34, "Padma");
		lhmap.put(23,"Ramesh");
		lhmap.put(11, "Padma");
		
		System.out.println("LinkedHashMap");
		for(Map.Entry<Integer, String> entry : lhmap.entrySet()) {
			System.out.println("Key = "+entry.getKey()+" Value = "+entry.getValue());
		}
		
		TreeMap<Integer,String> tmap = new  TreeMap<Integer,String>();
		

		tmap.put(11, "Padma");
		tmap.put(2, "Priya");
		tmap.put(34, "Padma");
		tmap.put(23,"Ramesh");
		tmap.put(11, "Padma");
		
		System.out.println("TreeMap");
		for(Map.Entry<Integer, String> entry : tmap.entrySet()) {
			System.out.println("Key = "+entry.getKey()+" Value = "+entry.getValue());
		}

	}

}
