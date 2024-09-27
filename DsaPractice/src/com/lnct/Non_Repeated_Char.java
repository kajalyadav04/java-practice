package com.lnct;

import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;

public class Non_Repeated_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "AAACcDEEF";
		string=string.toUpperCase();
		repeat(string);
		non_Repeated_Char(string);

	}

	private static void non_Repeated_Char(String str) {
		// TODO Auto-generated method stub

		Map<Character, Integer> map = new HashMap();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}

		}
		for (Entry<Character, Integer> e : map.entrySet()) {
			if (e.getValue() == 1) {
				System.out.println(e.getKey());
				break;
			}
		}

	}

	private static void repeat(String string) {
		// TODO Auto-generated method stub

		for (int i = 0; i < string.length(); i++) {
			boolean unique = true;
			for (int j = 0; j < string.length(); j++) {
				if (i != j && string.charAt(i) == string.charAt(j)) {
					unique = false;
					break;
				}

			}
			if (unique) {
				System.out.println(string.charAt(i));
				break;
			}

		}

	}

}
