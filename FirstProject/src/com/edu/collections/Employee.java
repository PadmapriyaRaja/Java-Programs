package com.edu.collections;

public class Employee {

	private int eid;
	private String ename;
	private float esalary;
	private int eage;

	public Employee(int eid, String ename, float esalary, int eage) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
		this.eage = eage;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public float getEsalary() {
		return esalary;
	}

	public void setEsalary(float esalary) {
		this.esalary = esalary;
	}

	public int getEage() {
		return eage;
	}

	public void setEage(int eage) {
		this.eage = eage;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", eage=" + eage + "]";
	}

}
