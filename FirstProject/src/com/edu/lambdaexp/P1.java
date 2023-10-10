package com.edu.lambdaexp;
import java.util.Stack;
import java.util.PriorityQueue;
import java.util.Queue;
public class P1 {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(7);
		s.push(9);
		s.push(17);
		System.out.println(s.empty());
		System.out.println(s.search(17));
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.pop());
		
		Queue<Integer> q = new PriorityQueue<Integer>();
	}

}
