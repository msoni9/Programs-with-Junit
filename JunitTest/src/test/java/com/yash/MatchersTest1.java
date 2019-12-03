package com.yash;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.isA;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

/*
  	// JUnit 4 for equals check
					assertEquals(expected, actual);
	// Hamcrest for equals check
					assertThat(actual, is(equalTo(expected)));
 */
public class MatchersTest1 {

	boolean a;
	boolean b;

	@Test
	public void testWithMatchers() {
		assertThat(123, not( is(345) ) );
		assertThat(a, equalTo(b));
		assertThat(a, is(equalTo(b)));
		assertThat(a, is(b));
		/*
		 * Chain matchers
		 */
		assertThat("test", anyOf(is("testing"), containsString("est")));

	}

	int totalNumberOfApplicants = 0;

	@Before
	public void setData(){
		this.totalNumberOfApplicants = 9;
	}

	@Test
	public void testAssertThatEqual() {
		assertThat("123",is("123"));
	}

	@Test
	public void testAssertThatNotEqual() {
		assertThat(totalNumberOfApplicants,is(9));
	}

	@Test
	public void testAssertThatObject() {
		assertThat("123",isA(String.class));
	}

	@Test
	public void testAssertThatWMessage(){
		assertThat("They are not equal!","123",is("1234"));
	}

}
