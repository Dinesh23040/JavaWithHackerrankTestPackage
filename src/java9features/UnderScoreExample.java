package java9features;

import java.util.*;

public class UnderScoreExample {
	public static void main(String[] args) {
		
		double d=1_23.1_1;
		System.out.println(d);
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		// Using forEach loop with lambda expression
		numbers.forEach(__ -> System.out.println("Hello"));

		// Using Stream API with lambda expression
		int sum = numbers.stream().filter(num -> num % 2 == 0).mapToInt(_unused -> 1) // Using underscore as an unused
																						// parameter
				.sum();
		System.out.println("Sum of even numbers: " + sum);
	}
}
