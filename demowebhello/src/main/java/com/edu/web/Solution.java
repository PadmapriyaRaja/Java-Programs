package com.edu.web;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
   static public String shortestBeautifulSubstring(String s, int k) {
        List<Integer> se = new ArrayList<Integer>();
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '1')
            {
                se.add(i);
            }
        }
        
        if(se.size()<k)
        {
            return "";
        }
        
        
        
        int small = Integer.MAX_VALUE;
        List<String> res = new ArrayList<String>();
        for(int i=0;i<se.size()-k;i++)
        {
        	int start = se.get(i);
        	int end = se.get(i+k-1);
        	if(end -start+1 <small)
        	{
        		res = new ArrayList<>();
        		res.add(s.substring(start,end+1));
        	}
        	else if (end -start+1 == small)
        	{
        		res.add(s.substring(start,end+1));
        	}
        }
         Collections.sort(res);
         return res.get(0);
    }
    public static void main(String[] args) {
		
    	System.out.println(shortestBeautifulSubstring("100011001",3));
	}
}