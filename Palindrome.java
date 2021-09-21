package com.basicString.org;

public class Palindrome {

	public static void main(String[] args) {
		String str = "Nitin";
		String strUpper=str.toUpperCase();
		String reserve = "";
		int length = strUpper.length();
		for (int i = length - 1; i >= 0; i--) {
			reserve = reserve + strUpper.charAt(i);
		}
		if (strUpper.equals(reserve)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}

}
