package day37ArrayList;

import java.util.*;

public class ArraysAsList {

	public static void main(String[] args) {

		List<String> cars = new ArrayList<>();
		cars.add("Lexus"); // etc add more values

		// declare and add values in single statement
		// Arrays class

		List<Integer> nums = Arrays.asList(4, 2, 1, 6, 9);
		System.out.println(nums.size());
		System.out.println(nums.toString());

		// create arraylist prices
		// assign 10 values using Arrays.asList method

		List<Double> prices = Arrays.asList(12.4, 5.3, 500.0, 1230.89, 5.99, 12.0, 12.0, 9875.50, 50.99);

		System.out.println(prices);

		// calculate sum of all prices
		double sum = 0;
		for (double price : prices) {
			sum += price;
		}

		System.out.println("Sum: $" + sum);

		double sum2 = 0;
		for (int i = 0; i < prices.size(); i++) {
			sum2 += prices.get(i);
		}
		System.out.println("Sum2: $" + sum2);

		// create new List expensive
		// add prices that are more than 100 from prices list

		List<Double> expensive = new ArrayList();

		for (double price : prices) {
			if (price > 100.0) {
				expensive.add(price);
			}
		}

		System.out.println("Expensive: " + expensive.toString());

	}
}
