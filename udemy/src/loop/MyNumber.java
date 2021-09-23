package loop;

public class MyNumber {

	private int number;

	public MyNumber(int number) {
		this.number = number;
	}

	public static void main(String[] args) {
		MyNumber number = new MyNumber(5);
		boolean isPrime = number.isPrime();
		System.out.println(isPrime);
		int sum = number.sumUpToN();
		System.out.println(sum);
		int sumOfDivisor = number.sumOfDivisor();
		System.out.println(sumOfDivisor);
		number.printNumberTriangle();

	}

	private void printNumberTriangle() {
		for (int i = 1; i <= number; i++) {
			for(int j=1; j<=i; j++) {
			System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	private int sumOfDivisor() {
		int sum = 0;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

	private int sumUpToN() {
		int sum = 0;
		for (int i = 0; i <= number; i++) {
			sum = sum + i;
		}
		return sum;
	}

	private boolean isPrime() {
		if (number < 2) {
			return false;
		}
		for (int i = 2; i <= number - 1; i++) {
			if (number % i == 0) {
				return false;
			}

		}

		return true;
	}

}
