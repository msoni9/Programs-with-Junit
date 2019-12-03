package com.yash;

/* Save this in a file called Main.java to compile and test it */

/* Do not add a package declaration */
import java.util.*;
import java.io.*;

/* DO NOT CHANGE ANYTHING ABOVE THIS LINE */
/* You may add any imports here, if you wish, but only from the 
   standard library */

/* Do not add a namespace declaration */
public class VU1 {
	public static Map<String, Integer> processData(ArrayList<String> array) {
		/*
		 * Modify this method to process `array` as indicated in the question.
		 * At the end, return a Map containing the appropriate values
		 *
		 * Please create appropriate classes, and use appropriate data
		 * structures as necessary.
		 *
		 * Do not print anything in this method.
		 *
		 * Submit this entire program (not just this method) as your answer
		 */

		Map<String, Integer> retVal = new HashMap<String, Integer>();
		Map<String, Integer> hashMap = new HashMap<String, Integer>();

		for (String str : array) {
			String replace = str.toString().replace(",", "");
			String[] split = replace.split(" ");
			for (int i = 0; i < split.length; i++) {
				if (hashMap.containsKey(split[3])) {
					if (hashMap.get(split[3]) < Integer.parseInt(split[4])) {
						hashMap.put(split[3], Integer.parseInt(split[4]));
						retVal.put(split[3], Integer.parseInt(split[0]));
					}
				} else {
					hashMap.put(split[3], Integer.parseInt(split[4]));
					retVal.put(split[3], Integer.parseInt(split[0]));
				}
				
			}

		}
		System.out.println(retVal);
		return retVal;
	}

	public static void main(String[] args) {
		ArrayList<String> inputData = new ArrayList<String>();
		String line;
		try {
			Scanner in = new Scanner(new BufferedReader(new FileReader("input.txt")));
			while (in.hasNextLine())
				inputData.add(in.nextLine());
			Map<String, Integer> retVal = processData(inputData);
			PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
			for (Map.Entry<String, Integer> e : retVal.entrySet())
				output.println(e.getKey() + ": " + e.getValue());
			output.close();
		} catch (IOException e) {
			System.out.println("IO error in input.txt or output.txt");
		}
	}
}
