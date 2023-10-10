package com.edu.practice;

@FunctionalInterface
interface StringSpace{
	String insertSpace (String s);
}



public class Q4 {

	public static void main(String[] args) {
		String str ="CAPGEMINI";
		
		
//	
//		String[] s = str.split("");
//		
//		String res = Arrays.stream(s).map(x->x+" ").reduce("", (ans,i)->ans+i);
//		res = res.trim();
//		System.out.println(res);
//		System.out.println(res.length());
		
		StringSpace sp = (s)->{
			StringBuilder sb = new StringBuilder();
			s.chars()
			.mapToObj(c->(char)c+" ")
			.forEach(sb::append);
			return sb.toString().trim();
		};
		
		System.out.println(sp.insertSpace(str));
		
	}

}
