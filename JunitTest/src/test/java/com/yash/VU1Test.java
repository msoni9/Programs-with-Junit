package com.yash;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class VU1Test {

	VU1 vu1 = new VU1();

	@Test
	public void shouldReturnId() {

		HashMap<String, Integer> expected = new HashMap<>();
		expected.put("Baner", 23);
		expected.put("Aundh", 22);

		ArrayList<String> arr = new ArrayList<>();
		String str = "22, Ravi Pawar, Aundh, 1603";
		String str1 = "23, Suvarna Kale, Baner, 803";
		String str2 = "27, Vinod Chavan, Aundh, 809";
		String str3 = "29, Vasant Mahajan, Aundh, 617";
		String str4 = "32, Aarti Patil, Baner, 351";
		arr.add(str);
		arr.add(str1);
		arr.add(str2);
		arr.add(str3);
		arr.add(str4);
		Map<String, Integer> actual = vu1.processData(arr);

		assertEquals(expected, actual);
	}

}
