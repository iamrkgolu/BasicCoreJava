package conditionals;

public class SwitchStatementRunner {

	public static void main(String[] args) {
		puzzel();
		puzzel1();

	}

	private static void puzzel1() {
		int number = 2;
		switch (number) {
		case 1:
			System.out.println("1");
			break;
		case 2:
		case 3:
			System.out.println("Number is 2 or 3");
			break;
		default:
			System.out.println("Default");
		}

	}

	private static void puzzel() {
		int number = 2;
		switch (number) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		default:
			System.out.println("Default");
		}
	}

}
