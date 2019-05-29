package day28_MultiD_Arrays;

import java.util.Arrays;

public class Loop2DArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] pizzas = { { "pineapple", "pepperoni" }, // 0
				{ "anchovies", "mushroom", "olives" }, // 1
				{ "4 cheeses" }, // 2
				{ "chicken", "tomatoes", "jalapeneos", "onion" }, // 4
				{ "green peppers", "zucchini", "broccoli", "spinach", "shrimp" } // 5
		};

		// System.out.println(Arrays.toString(pizzas[0]));

		for (String[] pizza : pizzas) {
			System.out.print(pizza.length + " - ");
			System.out.println(Arrays.toString(pizza));
		}

		System.out.println();
		System.out.println("##### FOR LOOP #####");

		for (int i = 0; i < pizzas.length; i++) {
			System.out.print(pizzas[i].length + "-");
			System.out.println(Arrays.toString(pizzas[i]));
		}
		
		for (String topping : pizzas [4]) {
			System.out.println(topping);
		}
		
		int [][] students = {{4, 5, 6}, 
							{12, 43, 23}, 
							{34, 45, 22, 65, 84}
							};
		
		// 2 parts: outer loop, inner loop
		//outer loop will take each group
		//inner loop will take each value/student id
		
		for (int [] group : students) {
			for ( int studentID : group) {
				System.out.print(studentID+", ");
			}
			System.out.println();
		}
		
		
		int [] [] nums = {
				{10, 20},
				{20, 30, 40, 50},
				{100, 200, 400},
				{555, 333, 111, 444, 666, 78},
				};
		
		
		for (int i =0; i < nums.length; i++) {
			for (int j =0; j< nums[i].length; j++) {
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}	
	}
}
