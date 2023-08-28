package com.edu.strings;

import java.util.Scanner;

public class ReverseVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.nextLine();
		
		int start=0, end = s.length()-1;
	       char c=' ';
	       char ch=' ';
	       while(start<=end){
	           if(c!=' ' && ch!= ' '){
	             s.replace(c,ch);
	             start++;
	             end--;
	            }
	            else if(c!=' '){
	            ch = isVowel(s.charAt(end));
	           }
	           else if(ch!=' '){
	            c = isVowel(s.charAt(start));
	           }
	           else{
	              c = isVowel(s.charAt(start));
	              ch = isVowel(s.charAt(end));
	           }
	       }
	        
	       System.out.println(s);
	       
	    }

	    public static char isVowel(char ch){
	      if(ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u' || ch =='A' || ch =='E' || ch =='I' ||ch =='O'||ch =='U'){
	          return ch;
	      }
	      return ' ';
	    }
	    
	    

}
