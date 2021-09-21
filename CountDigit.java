package com.basicNumber.org;

public class CountDigit {
	public static void main(String[] args) {
		int count=0;
		int number=876543;
		while(number !=0) {
			number = number/10;
			count++;
			
		}System.out.println(count);
	}

}
