package loop;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int number = -1;
		do {
			if(number!=-1) {
			System.out.println("Cube :" + (number * number * number));
			}
			System.out.print("Enter Number :");

			number = s.nextInt();

		} while (number >= 0);
	}

}
