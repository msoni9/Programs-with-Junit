package com.yash.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.tdd.PasswordVarifierJava8;

public class PasswordVarifierJava8Test {
	
	PasswordVarifierJava8 passwordVarifierjava8 = new PasswordVarifierJava8();
	
	@Test
	public void passwordShouldBeLargerThanEightCharacter() {
		boolean actual = passwordVarifierjava8.verify("LoginPwdd1");
		assertEquals(true, actual);
	}
	
	@Test
	public void passwordShouldNotBeNull(){
		boolean actual = passwordVarifierjava8.verify(null);
		assertEquals(false, actual);
		
	}
	
	@Test
	public void passwordShoudHaveOneUpperCaseLetter(){
		boolean actual = passwordVarifierjava8.verify("LoginPwdd1");
		assertEquals(true, actual);
	}
	
	@Test
	public void passwordShoudHaveOneLowerCaseLetter(){
		boolean actual = passwordVarifierjava8.verify("LoginPwdd1");
		assertEquals(true, actual);
	}
	
	@Test
	public void passwordShoudHaveOneDigit(){
		boolean actual = passwordVarifierjava8.verify("LoginPwdd1");
		assertEquals(true, actual);
	}

}
