package com.lnct;



public class Non_Repeated_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "AAACDEEF";
		repeat(string);

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
