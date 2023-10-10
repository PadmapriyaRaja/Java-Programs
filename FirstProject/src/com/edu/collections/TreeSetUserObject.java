package com.edu.collections;

import java.util.Comparator;
import java.util.TreeSet;

class Product {

	private int pid;
	private String pname;
	private float pprice;

	public Product(int pid, String pname, float pprice) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pprice = pprice;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public float getPprice() {
		return pprice;
	}

	public void setPprice(float pprice) {
		this.pprice = pprice;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + "]";
	}

}

class SortProductId implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		if(p1.getPid()> p2.getPid()) {
			
			return 1;
		}
		else if(p1.getPid() < p2.getPid()) {
			
			return -1;
		}

		return 0;
	}
	
}

class SortProductName implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		
		return p1.getPname().compareTo(p2.getPname());
	}
	
}

public class TreeSetUserObject {

	public static void main(String[] args) {

		Product p1 = new Product(33, "TV", 40000);
		Product p2 = new Product(14, "Mobile", 25000);
		Product p3 = new Product(22, "Laptop", 60000);

		TreeSet<Product> tobj = new TreeSet<>(new SortProductId());
		tobj.add(p1);
		tobj.add(p2);
		tobj.add(p3);
		
		TreeSet<Product> tobj1 = new TreeSet<>(new SortProductName());
		tobj1.add(p1);
		tobj1.add(p2);
		tobj1.add(p3);

		//Sorting by pid
		System.out.println(tobj);

		//Sorting by pname
		System.out.println(tobj1);
	}

}
