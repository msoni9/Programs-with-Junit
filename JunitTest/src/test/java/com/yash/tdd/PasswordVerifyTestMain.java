package com.yash.tdd;

import org.junit.Assert;
import org.junit.Test;

public class PasswordVerifyTestMain {

	PasswordVerifyMain passwordVerifyMain = new PasswordVerifyMain();

	Boolean passwordExpected;
	Boolean passwordActual;

	@Test
	public void passwordShouldBeLargerThanEightCharacters() {
		passwordExpected = true;
		passwordActual = passwordVerifyMain.checkPassword("ab7Ani");
		Assert.assertEquals(passwordExpected, passwordActual);
	}

	@Test
	public void passwordShouldNull() {
		passwordExpected = false;
		passwordActual = passwordVerifyMain.checkPassword(null);
		Assert.assertEquals(passwordExpected, passwordActual);
	}
	@Test
	public void passwordShouldNotBeNull() {
		passwordExpected = true;
		passwordActual = passwordVerifyMain.checkPassword("ab7aiAyrt");
		Assert.assertEquals(passwordExpected, passwordActual);
	}

	@Test
	public void passwordShouldContainAtLeastOneUpperCaseCharacter() {
		passwordExpected = true;
		passwordActual = passwordVerifyMain.checkPassword("ab7aiAyrt");
		Assert.assertEquals(passwordExpected, passwordActual);
	}

	@Test
	public void passwordShouldContainAtLeastOneLowerCaseCharacter() {
		passwordExpected = true;
		passwordActual = passwordVerifyMain.checkPassword("ab7aiAyrt");
		Assert.assertEquals(passwordExpected, passwordActual);
	}

	@Test
	public void passwordShouldContainAtLeastOneDigit() {
		passwordExpected = true;
		passwordActual = passwordVerifyMain.checkPassword("ab7aiAyrt");
		Assert.assertEquals(passwordExpected, passwordActual);
	}
	@Test
	public void passwordLessThanEightCharacters() {
		passwordExpected = false;
		passwordActual = passwordVerifyMain.checkPassword("abyrt");
		Assert.assertEquals(passwordExpected, passwordActual);
	}

	

	@Test
	public void passwordShouldNotContainAnyUpperCaseCharacter() {
		passwordExpected = false;
		passwordActual = passwordVerifyMain.checkPassword("77777777");
		Assert.assertEquals(passwordExpected, passwordActual);
	}

	@Test
	public void passwordShouldNotContainAnyLowerCaseCharacter() {
		passwordExpected = false;
		passwordActual = passwordVerifyMain.checkPassword("7777777");
		Assert.assertEquals(passwordExpected, passwordActual);
	}

	@Test
	public void passwordShouldNotContainAnyDigit() {
		passwordExpected = false;
		passwordActual = passwordVerifyMain.checkPassword("abdaiyBti");
		Assert.assertEquals(passwordExpected, passwordActual);
	}

	
	/*@Test
	public void shouldOkWithAtLeastThreeCondition(){
		String checkStatusOk = passwordVerify.atLeastThreeConditionCheck("ab7aiyBti");
	}*/
	
	/*@Test
	public void shouldNotBeOkIfFourthConditionIsNotTrue(){
		String actualStatus = passwordVerify.atFourthConditionCheck("ab7aiyBti");
		Assert.assertEquals("Ok", actualStatus);
	}*/

}
