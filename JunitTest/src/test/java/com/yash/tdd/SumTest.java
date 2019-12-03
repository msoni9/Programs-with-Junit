package com.yash.tdd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class SumTest {
	
	SumClass sumClass = new SumClass();
	
	@Test
	public void sumOfTwoIntegers (){
		
		int addTwoNumber = sumClass.addTwoNumber(2,3);
		assertEquals(5, addTwoNumber);
	}
	
	@Test
	public void incorrectResultOfSumOfTwoIntegers (){
		
		int addTwoNumber = sumClass.addTwoNumber(2,3);
		assertNotEquals(6, addTwoNumber);
	}

}
