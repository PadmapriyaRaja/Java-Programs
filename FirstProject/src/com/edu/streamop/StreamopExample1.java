package com.edu.streamop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}

}

public class StreamopExample1 {

	public static void main(String[] args) {
		// List<Integer> lst = Arrays.asList(2,4,5,6,7);
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(2);
		lst.add(4);
		lst.add(6);
		lst.add(7);
		 int sum = lst.stream().reduce(0,(ans,i)->ans+i);
		int even = lst.stream().filter(i -> i % 2 == 0).map(i -> i * 2).reduce(0, (ans, i) -> ans + i);
		System.out.println(even);

		List<Employee> elist = new ArrayList<Employee>();
		elist.add(new Employee("Padma", 20));
		elist.add(new Employee("Priya", 18));
		elist.add(new Employee("Saran", 15));

		List<String> ename = elist.stream().filter(e -> e.getAge() > 15).map(e -> e.getName())
				.collect(Collectors.toList());
		System.out.println(ename);

		List<Employee> en = elist.stream().filter(e -> e.getName().endsWith("n")).collect(Collectors.toList());
		System.out.println(en);
	}

}
