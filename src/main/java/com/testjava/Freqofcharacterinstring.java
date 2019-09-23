package com.testjava;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Freqofcharacterinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "ssuummiitt";

		HashMap<Character, Integer> hs = new HashMap<Character, Integer>();
		char[] ch = s.toCharArray();

		for (char c : ch) {
			if (hs.containsKey(c)) {
				hs.put(c, hs.get(c) + 1);
			}

			else {
				hs.put(c, 1);
			}
		}


		System.out.println("Input String" + hs);

	}
	}

