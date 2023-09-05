package com.edu.elevator;

public class InappropriateFloorException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// when the floor selection is inappropriate this exception is thrown
	public InappropriateFloorException(String s) {
		super(s);
	}

}
