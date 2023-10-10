package com.edu.practice;

import java.util.ArrayList;
import java.util.List;

public class Q3 {

	public static void main(String[] args) {

		Insecticides i = new Insecticides();

		List<Insect> list = new ArrayList<Insect>();

		list.add(new Insect("Ant", 45));
		list.add(new Insect("Cockroach", 65));
		list.add(new Insect("bee", 99));
		list.add(new Insect("paper wasp", 11));

		System.out.println(i.mapInsectsName(list));
		System.out.println(i.getWeight(list));
		
		

	}

}
