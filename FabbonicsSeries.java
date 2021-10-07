package com.basicNumber.org;

public class FabbonicsSeries {

	public static void main(String[] args) {
		int number1 = 0;
		int number2 = 1;
		int temp;
//		For Printing First Two Values i.e number1=0, and number2=1.................
		System.out.print(number1 + " " + number2 + " ");
// 		For Printing After Two Numbers........................
		for (int i = 3; i <= 10; i++) {
			temp = number1 + number2;
			number1 = number2;
			number2 = temp;

			System.out.print(temp + " ");
		}

	}

}
