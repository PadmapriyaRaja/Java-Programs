package com.edu.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student {

	 int sid;
	String sname;
	float sfees;

	public Student(int sid, String sname, float sfees) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sfees = sfees;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public float getSfees() {
		return sfees;
	}

	public void setSfees(float sfees) {
		this.sfees = sfees;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sfees=" + sfees + "]";
	}

}

class SortStudentFees implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if (s1.sfees > s2.sfees) {
			return 1;
		} else if (s1.sfees < s2.sfees) {
			return -1;
		}

		return 0;
	}

}

class SortStudentId implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		if(o1.sid > o2.sid) {
			return 1;
		}
		else if(o1.sid < o2.sid) {
			return -1;
		}
		return 0;
	}
	
}

class SortStudentName implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		
		return s1.sname.compareTo(s2.sname);
	}
	
}

public class ArrayListclasstype {

	public static void main(String[] args) {

		ArrayList<Student> slist = new ArrayList<Student>();

		Student s1 = new Student(12, "Padma", 7894);
		Student s2 = new Student(92, "Priya", 7863);
		Student s3 = new Student(33, "kamal", 8935);
		Student s4 = new Student(45, "Priyanka", 77654);
		Student s5 = new Student(25, "Pavi", 88394);

		slist.add(s1);
		slist.add(s2);
		slist.add(s3);
		slist.add(s4);
		slist.add(s5);

		// Collections.sort(slist);

		System.out.println(slist);
		
		System.out.println("");
		Iterator<Student> sit = slist.iterator();
		System.out.println("SID\tFees\t\tName");

		while (sit.hasNext()) {

			Student sob = sit.next();
			// System.out.println(sit.next());
			System.out.println(sob.sid + "\t" + sob.sfees + "\t\t" + sob.sname);
		}
		
		System.out.println("");

		//sorting by sfees
		SortStudentFees sf = new SortStudentFees();

		//Collections.sort(slist,new SortStudentFees());
		Collections.sort(slist, sf);
		Iterator<Student> sit1 = slist.iterator();
		System.out.println("SID\tFees\t\tName");

		while (sit1.hasNext()) {

			Student sob = sit1.next();
			// System.out.println(sit.next());
			System.out.println(sob.sid + "\t" + sob.sfees + "\t\t" + sob.sname);
		}
		
		System.out.println("");
		//sorting by sid
		SortStudentId si = new SortStudentId();
		Collections.sort(slist,si);
		Iterator<Student> sit2 = slist.iterator();
		System.out.println("SID\tFees\t\tName");

		while (sit2.hasNext()) {

			Student sob = sit2.next();
			// System.out.println(sit.next());
			System.out.println(sob.sid + "\t" + sob.sfees + "\t\t" + sob.sname);
		}
		
		System.out.println("");
		//sorting by sname
		SortStudentName sn = new SortStudentName();
		Collections.sort(slist,sn);
		Iterator<Student> sit3 = slist.iterator();
		System.out.println("SID\tFees\t\tName");

		while (sit3.hasNext()) {

			Student sob = sit3.next();
			// System.out.println(sit.next());
			System.out.println(sob.sid + "\t" + sob.sfees + "\t\t" + sob.sname);
		}
	}

}
