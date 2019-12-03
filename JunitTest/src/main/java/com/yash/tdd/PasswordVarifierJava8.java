package com.yash.tdd;

public class PasswordVarifierJava8 {

	public boolean verify(String password) {

		/*
		 * if (password != null && password.length() >= 8 &&
		 * password.chars().anyMatch(ch -> Character.isUpperCase(ch)) &&
		 * password.chars().anyMatch(ch -> Character.isLowerCase(ch)) &&
		 * password.chars().anyMatch(ch -> Character.isDigit(ch))) { return
		 * true; } return false; }
		 */

		/****************************************************************************************************************/
		// NOTE trick -> boolean check = password !=null ? true : false

		// now replace true with bracket () and write another condition in it
		// e.g

		// password !=null ? () : false

		// password !=null ? (password.length() >= 8 ? true : false) : false

		// Repeat the same process

		boolean check = password != null
				? (password.length() >= 8 ? (password.chars().anyMatch(ch -> Character.isUpperCase(ch))
						? (password.chars().anyMatch(ch -> Character.isLowerCase(ch))
								? (password.chars().anyMatch(ch -> Character.isDigit(ch)) ? true : false) : false)
						: false) : false)
				: false;
		return check;

	}

}
