package com.yash.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.tdd.PasswordVarifier;

public class PasswordVarifierTest {

	PasswordVarifier passwordVarifier = new PasswordVarifier();

	@Test
	public void passwordShouldBeLargerThanEightCharacter() {
		boolean actual = passwordVarifier.verify("LoPwd1");
		assertEquals(true, actual);
	}
	
	@Test
	public void passwordShouldNotBeNull(){
		boolean actual = passwordVarifier.verify(null);
		assertEquals(false, actual);
		
	}
	
	@Test
	public void passwordShoudHaveOneUpperCaseLetter(){
		boolean actual = passwordVarifier.verify("LoginPwd1");
		assertEquals(true, actual);
	}
	
	@Test
	public void passwordShoudHaveOneLowerCaseLetter(){
		boolean actual = passwordVarifier.verify("LoginPwd1");
		assertEquals(true, actual);
	}
	
	@Test
	public void passwordShoudHaveOneNumber(){
		boolean actual = passwordVarifier.verify("LoginPwd1");
		assertEquals(true, actual);
	}

}
