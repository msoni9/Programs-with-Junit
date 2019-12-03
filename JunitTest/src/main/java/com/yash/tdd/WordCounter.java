package com.yash.tdd;

import java.util.HashMap;

public class WordCounter {

	public HashMap<String, Integer> numberOfWords(String string) {

		String[] arrayOfWords = string.split("[\\s@&.,'?$+-]+");

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < arrayOfWords.length; i++) {
			if (map.containsKey(arrayOfWords[i])) {
				map.put(arrayOfWords[i], map.get(arrayOfWords[i]) + 1);
			} else {
				map.put(arrayOfWords[i], 1);
			}
		}
		return map;
	}
}
