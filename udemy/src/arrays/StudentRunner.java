package arrays;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		int[] marks = { 97, 95, 100, 97 };
		Student student = new Student("Rahul", marks);

		int number = student.getNoOfMarks();
		System.out.println("Number Of Marks :" + number);

		int sum = student.getTotalSumOfMarks();
		System.out.println("Sum Of Total Marks : " + sum);

		int maximumMarks = student.getMaximumMarks();
		System.out.println("Maximum Marks in One Subject : " + maximumMarks);

		int minimumMarks = student.getMinimumMarks();
		System.out.println("Minimum marks in one subject : " + minimumMarks);

		BigDecimal average = student.getAverageMarks();
		System.out.println("Average Of All Marks : " + average);

	}

}
