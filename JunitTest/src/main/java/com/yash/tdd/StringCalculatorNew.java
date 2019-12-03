package com.yash.tdd;

import java.util.Optional;
import java.util.logging.Logger;

public class StringCalculatorNew {

	Logger logger = Logger.getLogger(StringCalculatorNew.class.getName());

	public int add(String inputNumber) {

		int addition = 0;
		int number;

		Optional<String> element = Optional.empty();
		if (inputNumber.isEmpty()) {
			logger.info("Return zero when string is empty.");
			return 0;
		} else {

			String[] numberOfinArrays = inputNumber.split("[/\\n;,]+");
			if (numberOfinArrays.length == 1) {
				logger.info("Should return same number when inputs is one number");
				return Integer.parseInt(numberOfinArrays[0]);

			} else {
				for (int num = 0; num < numberOfinArrays.length; num++) {

					if (numberOfinArrays[num].isEmpty()) {
						number = 0;
					} else {
						if (Integer.parseInt(numberOfinArrays[num]) < 0) {
							logger.info("Return sum of all numbers and accept line delimiter.");
							throw new NegativeNotAllowedException();
						} else if (Integer.parseInt(numberOfinArrays[num]) > 1000) {
							logger.info("Ignore zero if number is greater than thousand");
							number = 0;
						} else {
							number = Integer.parseInt(numberOfinArrays[num]);
						}
					}
					addition = addition + number;
					logger.info("Return sum of given numbers");
				}
				return addition;
			}
		}

	}

}
