package arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {

	private int[] marks;
	private String name;

	public Student(String name, int[] marks) {
		this.name = name;
		this.marks = marks;
	}

	public int getNoOfMarks() {

		return marks.length;
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		return sum;
	}

	public int getMaximumMarks() {
		int maximum = Integer.MIN_VALUE;
		for (int mark : marks) {
			if (mark > maximum) {
				maximum = mark;
			}
		}

		return maximum;
	}

	public int getMinimumMarks() {
		int minimum = Integer.MAX_VALUE;
		for (int mark : marks) {
			if (mark < minimum) {
				minimum = mark;
			}
		}

		return minimum;
	}

	public BigDecimal getAverageMarks() {
		int sum = getTotalSumOfMarks();
		int total = getNoOfMarks();
		BigDecimal average = new BigDecimal(sum).divide(new BigDecimal(total), 3, RoundingMode.UP);
		return (average);
	}

}
