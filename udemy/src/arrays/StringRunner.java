package arrays;

public class StringRunner {

	public static void main(String[] args) {
		String[] daysOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thrusday", "Friday", "Saturday" };
		String dayWithMostCharacter = "";
		for (String day : daysOfWeek) {
			if (day.length() > dayWithMostCharacter.length()) {
				dayWithMostCharacter = day;
			}
		}
		System.out.println(dayWithMostCharacter);
		for (int i = daysOfWeek.length - 1; i >= 0; i--) {
			System.out.println(daysOfWeek[i]);
		}
	}

}
