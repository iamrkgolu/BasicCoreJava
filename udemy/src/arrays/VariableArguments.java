package arrays;

public class VariableArguments {

	public static void main(String[] args) {

		System.out.println(som(10, 12));

	}

	public static int som(int... values) {
		int sum = 0;
		for (int value : values) {
			sum += value;
		}
		return sum;

	}

}
