package com.basicNumber.org;

import java.util.Scanner;

public class ArmstrongNumber {
	static int rem;
	static int sum = 0;
	
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int number = s.nextInt();
		s.close();
		int divisor=number;
		while (number != 0) {
			rem = number % 10;
			sum = sum + (rem * rem * rem);
			number = number / 10;
		}
		if (sum == divisor) {
			System.out.println(" is Armstrong Number");
		} else {
			System.out.println("is Not Armstrongs Number");
		}
		System.out.println(divisor);
		System.out.println(sum);
	}

}
