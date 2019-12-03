package com.yash.tdd;

import java.util.Optional;

public class PasswordVerifyMain {

	public Boolean checkPassword(String password) {
		
		int flag = 0;
		Optional<String> passwordNull = Optional.ofNullable(password);

		if (passwordNull.isPresent()) {
			flag = flag + 1;
		} else {
			return false;
		}
		Integer passwordLength = password.length();

		Boolean PasswordIsUpperCase = password.chars().anyMatch(x -> Character.isUpperCase(x));
		Boolean PasswordIsLowerCase = password.chars().anyMatch(x -> Character.isLowerCase(x));
		Boolean passwordIsContainNumber = password.chars().anyMatch(x -> Character.isDigit(x));

		if (PasswordIsUpperCase == true) {
			flag = flag + 1;
		}
		if (PasswordIsLowerCase == true) {
			flag = flag + 1;
		}
		if (passwordIsContainNumber == true) {
			flag = flag + 1;
		}
		if (passwordLength >= 8) {
			flag = flag + 1;
		}
		if (flag == 5) {
			return true;
		} else {
			return false;
		}

	}
}
