package com.yash.tdd;

public class NegativeNotAllowedException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NegativeNotAllowedException() {
		super("Negative Not Allowed");
	}

}
