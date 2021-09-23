package conditionals;

import java.util.Scanner;

public class OperatorSelector {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number1 : ");
		int number1 = scanner.nextInt();

		System.out.print("Enter Number2 : ");
		int number2 = scanner.nextInt();

		System.out.println("Choices Available are: ");
		System.out.println("1-Add");
		System.out.println("2-Sub");
		System.out.println("3-Mult");
		System.out.println("4-Div");

		System.out.print("Enter Choice : ");
		int number3 = scanner.nextInt();

		performOperationUsinfNestedIfElse(number1, number2, number3);

	}

	private static void performOperationUsinfNestedIfElse(int number1, int number2, int number3) {
		switch (number3) {
		case 1:
			System.out.println("Result: " + (number1 + number2));
			break;
		case 2:
			System.out.println("Result: " + (number1 - number2));
			break;
		case 3:
			System.out.println("Result: " + (number1 * number2));
			break;
		case 4:
			System.out.println("Result: " + (number1 / number2));
			break;
		default:
			System.out.println("Invalid Operation");
		}

	}

}
