package com.yash;

import java.util.Date;

/**
* Example class to test the mocking of private method.
*/

public class MockPrivateMethodExample {

	public String getDetails() {
		return "Mock private method example: " + iAmPrivate();
	}
	
	private String iAmPrivate() {
		return new Date().toString();
	}	

}
