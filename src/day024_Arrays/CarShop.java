package day024_Arrays;

import java.util.Arrays;

public class CarShop {

	public static void main(String[] args) {
		// BMW, Audi, Ford, Honda, Mercedes, Mercury, Rolls-Royce, Tesla;
		// Step #1; Create an array of strings, on store these cars inside that array

		String[] cars = { "BMW", "Audi", "Ford", "Honda", "Mercedes", "Mercury", "Rolls-Royce", "Tesla" };

		// Step#2; Print car names that starts with M

		for (String c : cars) {
			if (!c.startsWith("M")) {
				continue;
			}
			System.out.println(c);
		}

		System.out.println("******* cars names which containd letter 'r'  ******");
		// Step#3; Print all cars that have letter "r" somewhere in the name
		// make search Case Insensitive

		for (String model : cars) {
			if (model.toLowerCase().contains("r")) {
				System.out.println(model);
			}
		}
		System.out.println("****** cars names ends with letter 'a'  *****");

		// Step#4; Print car names that ends with "a";

		for (String model : cars) {
			if (model.toLowerCase().endsWith("a")) {
				System.out.println(model);
			}
		}

		System.out.println("***** cars with min 6 letters ****");

		// Step#5; Print all cars that have at 6 letters

		for (String model : cars) {
			if (model.length() > 5) {
				System.out.println(model);
			}
		}

		// Step#6; Swap first and last value in the array
		// ORIGINAL--> BMW, Audi, Ford, Honda, Mercedes, Mercury, Rolls-Royce, Tesla;
		// create a temp variable, that will get a value of first element
		String temp = cars[0];
		// we swap values of first and last element
		cars[0] = cars[cars.length - 1];
		// since temp variable has value of first element of array
		// we assign this value to the last element i the array
		cars[cars.length - 1] = temp;
		System.out.println("Before sorting");
		System.out.println(Arrays.toString(cars));
        Arrays.sort(cars);
        System.out.println("After sorting");
        System.out.println(Arrays.toString(cars));
		// find position of "Ford" with #binarySearch
		System.out.println("Position: "+Arrays.binarySearch(cars, "Ford"));
		
		System.out.println("Position: "+Arrays.binarySearch(cars, "Ford"));
	}

}
