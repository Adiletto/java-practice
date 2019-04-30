package day034_Methods06;

import java.util.Arrays;

public class VarArgs {

	public static void main(String[] args) {
		printWords("red", "blue", "yellow"); // 3 values
		printWords("grey"); // 1 value
		printWords(); // empty. so array will be empty array
		
		String [] myPets = {"cat", "horse", "dog", "sheep", "goat"};
		printWords(myPets);
		
		
		System.out.println(sum(3, 5, 10));
		System.out.println(sum(123, 978687, 5456, 9877));
		
		cook ("Burrito Bowl", "Rice", "Beans", "Meat", "Sour Cream", "Cheese");
		cook("Avocado Toast", "Avocado", "Sunny Side Eggs", "Wheat Bread");
		shoppingList(1000, "Avocado Toast", "Shoes", "Jacket");

		int budget = 200;
		if (sum(10, 45, 110, 30) <= budget) {
			System.out.println("Within budget");
		} else {
			System.out.println("Broke");
		}
		
		int total = sum(234, 43, 567, 12, 34, 5);
		System.out.println("total: "+total);
	}

	public static void printWords(String... words) {
		// handle it like an ARRAY
		for (String w : words) {
			System.out.println(w);
		}

	}

	/*
	 * sum(10, 30, 40); ==> 80 sum(30,40); ==> 70
	 */
	public static int sum(int... nums) {
		int sum = 0;
		for (int n : nums) {
			sum += n; // sum = sum+n;
		}
		return sum;
	}

	public static void cook (String name, String... ingrs) {
		System.out.println("Food: "+name);
		
		
	}
	
	//shoppingList(1000, "Avocado Toast", "Shoes", "Jacket");
	public static void shoppingList (int totalPrice, String... items ) {
		System.out.print("Total cost: " + totalPrice);
		System.out.println(Arrays.toString(items));
	}
}
