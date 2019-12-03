package com.yash.tdd;

public class PasswordVarifier {

	public boolean verify(String password) {
		int upperCase = 0;
		int lowerCase = 0;
		if (password != null) {
			char[] charArray = password.toCharArray();
			for (int i = 0; i < charArray.length; i++) {
				if (Character.isUpperCase(charArray[i])) {
					upperCase++;
				} else if (Character.isLowerCase(charArray[i])) {
					lowerCase++;
				} else if (Character.isDigit(charArray[i])) {
					return true;
				}
			}
			if (charArray.length > 8)
				return true;
			else if (upperCase > 1)
				return true;
			else if (lowerCase > 1)
				return true;
			else if (true)
				return true;
			else
				return false;
		} else {
			return false;
		}
	}
}
