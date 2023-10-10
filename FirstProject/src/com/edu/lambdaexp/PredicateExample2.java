package com.edu.lambdaexp;

import java.util.function.Predicate;

public class PredicateExample2 {

	public static void main(String[] args) {
		
		int[] arr = {10,11,12,8,14,1,6,17,18,19,20};
		
		Predicate<Integer> pob = (i)->i>10;
		
		filterNumGreaterThanTen(pob,arr);
		
		Predicate<Integer> pe = (i)->i%2==0;
		
		filterEvenNum(pe,arr);
		
		Predicate<Integer> po = (i)->i%2!=0;
		
		filterOddNum(po,arr);
		
		Predicate<Integer> pal = (i)-> true;
		
		printNum(pal,arr);
		
	}

	private static void printNum(Predicate<Integer> pal, int[] arr) {
		System.out.println("All numbers:");
		for(int i:arr) {
			System.out.println(i);
		}
	}

	private static void filterOddNum(Predicate<Integer> po, int[] arr) {
		System.out.println("Odd numbers:");
		for(int i:arr) {
			if(po.test(i)) {
				System.out.println(i);
			}
		}
		
	}

	private static void filterEvenNum(Predicate<Integer> pe, int[] arr) {
		System.out.println("Even numbers:");
		for(int i:arr) {
			if(pe.test(i)) {
				System.out.println(i);
			}
		}
		
	}

	private static void filterNumGreaterThanTen(Predicate<Integer> pob, int[] arr) {
		System.out.println("Numvers greater than 10:");
		for(int i : arr) {
			if(pob.test(i)) {
				System.out.println(i);
			}
		}
		
	}
	

}
