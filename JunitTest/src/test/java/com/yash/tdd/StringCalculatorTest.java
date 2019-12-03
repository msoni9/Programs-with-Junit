package com.yash.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class StringCalculatorTest {

	StringCalculator stringCalculator = new StringCalculator();

	@Rule
	public ExpectedException exception = ExpectedException.none();

	@Test
	public void shouldReturnSumZeroIfNumberIsZero() {

		int actual = stringCalculator.add("");

		assertEquals(actual, 0);
	}

	@Test
	public void shouldReturnSumOfOneNumber() {

		int actual = stringCalculator.add("5");

		assertEquals(actual, 5);

	}

	@Test
	public void shouldReturnSumOfAnyNumbers() {

		int actual = stringCalculator.add("1,2,3,4,5");

		assertEquals(actual, 15);

	}

	@Test
	public void shouldReturnSumOfTwoNumbersIfInputContainsMoreThanOneN() {
		int actual = stringCalculator.add("1,2");

		assertEquals(actual, 3);

	}

	@Test
	public void shouldReturnSumOfAllNumbersAndAcceptotherDelimeters() {

		int actual = stringCalculator.add("//;\n1,2");

		assertEquals(actual, 3);

	}

	@Test
	public void shouldReturnSumOfNumbersWithDelimeter() {

		int actual = stringCalculator.add("1\n2,3");

		assertEquals(actual, 6);

	}

	public void shouldReturnAnExceptionForNegativeNumbers() {

		exception.expect(NegativeNotAllowedException.class);
		exception.expectMessage("Negative Not Allowed");
		stringCalculator.add("-1,-7");

	}

	@Test
	public void shouldIgnoreNumberIfNumberIsGreaterThanThousand() {
		int actual = stringCalculator.add("2,1001");
		assertEquals(2, actual);
	}

}
