package com.edu.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;


public class EmployeeMain {

	public static void main(String[] args) {

		ArrayList<Employee> elist = new ArrayList<Employee>();

		Employee e1 = new Employee(11, "Padma", 78653, 20);
		Employee e2 = new Employee(13, "Priya", 89753, 22);
		Employee e3 = new Employee(14, "Parkavi", 87542, 19);
		Employee e4 = new Employee(15, "Ramya", 77652, 18);
		Employee e5 = new Employee(18, "Kumar", 798624, 15);

		elist.add(e1);
		elist.add(e2);
		elist.add(e3);
		elist.add(e4);
		elist.add(e5);

		Iterator<Employee> eit = elist.iterator();
		System.out.println("EID\tName\tAge\tSalary");

		while (eit.hasNext()) {

			Employee eob = eit.next();
			System.out.println(eob.getEid() + "\t" + eob.getEname() +"\t" + eob.getEage()+ "\t" + eob.getEsalary());
		}
		
		//Sorting by Employee Age
		
		System.out.println("");
		System.out.println("Sorting by Employee Age");
		SortEmployeeAge ea =new SortEmployeeAge();
		Collections.sort(elist,ea);
		
		Iterator<Employee> eit1 = elist.iterator();
		System.out.println("EID\tName\tAge\tSalary");

		while (eit1.hasNext()) {

			Employee eob = eit1.next();
			System.out.println(eob.getEid() + "\t" + eob.getEname() +"\t" + eob.getEage()+ "\t" + eob.getEsalary());
		}
		
		//Sorting by Employee Name

		System.out.println("");
		System.out.println("Sorting by Employee Name");
		SortEmployeeAge en =new SortEmployeeAge();
		Collections.sort(elist,en);
		
		Iterator<Employee> eit2 = elist.iterator();
		System.out.println("EID\tName\tAge\tSalary");

		while (eit2.hasNext()) {

			Employee eob = eit2.next();
			System.out.println(eob.getEid() + "\t" + eob.getEname() +"\t" + eob.getEage()+ "\t" + eob.getEsalary());
		}

	}

}
