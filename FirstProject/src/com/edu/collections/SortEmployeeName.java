package com.edu.collections;

import java.util.Comparator;

public class SortEmployeeName implements Comparator<Employee> {
	
	@Override
	public int compare(Employee e1, Employee e2) {
		
		return e2.getEname().compareTo(e1.getEname());
	}

}
