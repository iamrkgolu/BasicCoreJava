package conditionals;

public class SwitchExampleRunner {

	public static void main(String[] args) {
		System.out.println(nameOfDay(1));

	}

	public static String nameOfDay(int dayNumber) {
		String Result = "";
		switch (dayNumber) {
		case 0:
			Result = "Sunday";
			break;
		case 1:
			Result = "Monday";
			break;
		case 2:
			Result = "Tuesday";
			break;
		case 3:
			Result = "Wednesday";
			break;
		case 4:
			Result = "Thrusday";
			break;
		case 5:
			Result = "Friday";
			break;
		case 6:
			Result = "Saturday";
		}
		return Result;
	}

}
