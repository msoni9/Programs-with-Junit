package com.yash.tdd;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Test;

public class WordCounterTest {

	WordCounter wordCounter = new WordCounter();

	@Test
	public void wordCounter() {

		HashMap<String, Integer> actual = wordCounter.numberOfWords("Boom, Bang, Boom");

		HashMap<String, Integer> expected = new HashMap<String, Integer>();
		expected.put("Boom", 2);
		expected.put("Bang", 1);

		assertEquals(expected, actual);

	}

}
