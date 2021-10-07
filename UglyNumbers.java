package com.basicNumber.org;

public class UglyNumbers {
	/*
	 * In number system, ugly numbers are positive numbers whose only prime factors
	 * are 2, 3 or 5. Test Date:Input an integer number: 235 Expected Output : It is
	 * not an ugly number.
	 */

	public static void main(String[] args) {
		int number = 10;
		if (number<=0) {
			System.out.println("Invalid"+" "+number);
		}else {
		if (number % 2 == 0) {
			System.out.println("Number is Ugly " + " " + number);
		}
		else if (number % 3 == 0) {
			System.out.println("Number is Ugly " + " " + number);
		}
		else if (number % 5 == 0) {
			System.out.println("Number is Ugly " + " " + number);
				}else {
			System.out.println("not");
		}

	}}}
