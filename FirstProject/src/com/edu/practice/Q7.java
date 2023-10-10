package com.edu.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        ArrayList<ArrayList<Integer>> aList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        //inserting element
        int row = sc.nextInt(),number;
        for(int i=0;i<row;i++){
            int col = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            for(int j=0;j<col;j++){
                number = sc.nextInt();
                a.add(j,number);
            }
            aList.add(i, a);
        }
        //checking contains
        int n,r,c,num;
        n = sc.nextInt();
        for(int i = 0;i<n;i++){
            r = sc.nextInt();
            c = sc.nextInt();
            num = aList.get(r-1).get(c-1);
            if(aList.contains(num)){
                System.out.print(num);
            }else{
                System.out.println("ERROR!");
            }
        }
        
        
    }

	

}
