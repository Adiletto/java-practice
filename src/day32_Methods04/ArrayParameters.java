package day32_Methods04;

import java.util.Arrays;

public class ArrayParameters {

	public static void main(String[] args) {
		int[]myArray = {44, 22, 66, 11};
		printArray(myArray);
		printArray(new int [] {33, 45, 5, 7});
		printArray(new int [] {12, 3, 34, 9, 89, 5, 32, 54, 65, 45});
		
		int [] one = {10, 2, 3};
		int [] two = {3, 1, 23, 87, 1};
		print2Arrays(one, two);
		     
		print2ArraysV2(one, two);
		
	}
	public static void printArray(int [] nums) {
		for ( int n : nums ) {
			System.out.print(n+" ");
		}
		System.out.println();
	}
	
	public static void print2Arrays(int [] num1, int [] num2) {
		
		if (num1.length > num2.length) {
			System.out.println(Arrays.toString(num1));
			System.out.println(Arrays.toString(num2));
		}else {
			System.out.println(Arrays.toString(num2));
			System.out.println(Arrays.toString(num1));
		}
	}
	
	
public static void print2ArraysV2(int [] num1, int [] num2) {
		
		if (num1.length > num2.length) {
			printArray(num1);
			printArray(num2);
		}else {
			printArray(num2);
			printArray(num1);
		}
	}
	
	
}
