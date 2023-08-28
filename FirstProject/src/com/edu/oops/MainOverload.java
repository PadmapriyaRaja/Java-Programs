package com.edu.oops;

class Addition1 {

	void add(int i, int j) {
		int s = i + j;
		System.out.println("Integer addition  s=" + s);
	}

	void add(short i, short j) {
		short s = (short) (i + j);
		System.out.println("short addition  s=" + s);
	}

	void add(long i, long j) {
		long s = i + j;
		System.out.println("long addition  s=" + s);
	}

	void add(byte i, byte j) {
		byte s = (byte) (i + j);
		System.out.println("byte addition  s=" + s);
	}

	void add(float i, float j) {
		float s = i + j;
		System.out.println("float addition  s=" + s);
	}

	void add(double i, double j) {
		double s = i + j;
		System.out.println("double addition  s=" + s);
	}

}

public class MainOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Addition1 ob = new Addition1();
		ob.add(76, 89);
		ob.add((short) 4, (short) 8);
		ob.add((byte) 76, (byte) 89);
		ob.add(76l, 89l);
		ob.add(76.3f, 89.2f); //
		ob.add(76.3, 89.2); // double

	}

}
