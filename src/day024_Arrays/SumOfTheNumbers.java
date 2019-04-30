package day024_Arrays;

import java.util.Arrays;

public class SumOfTheNumbers {

	public static void main(String[] args) {
		// create an array of integers with length 3

		int [] numbers = new int [3];
		//first value in array
		numbers [0] = 15;
		//second value in array
		numbers [1] = 25;
		//third value in array
		numbers [2] = 35;
		
		System.out.println(numbers); //==> it will give hash code ([I@4d591d15)
		//toString () from arrays class can help us to print an arrays as string
 		System.out.println(Arrays.toString(numbers));
		
 		int sum = 0;
 		//use for loop, in order to loop through the array 
 		//and calculate sum of all elements
 		// numbers.length --> returns number of elements in the array
 		//The final field (array.length) can not be assigned
 		for (int i = 0; i < numbers.length; i++) {
 			sum = sum + numbers [i];
 		}
 		System.out.println("Sum : "+sum);
 		//find largest value in the array
 		
 		int max = Integer.MIN_VALUE;
 		//System.out.println(Integer.MIN_VALUE);
 		
 		for (int i =0; i < numbers.length; i++) {
 			if (numbers[i] > max) {
 				max = numbers [i];
 			}
 		}
 		System.out.println("Max value: " + max);
 		
 		System.out.println("**************************************");
 		
 		int min = Integer.MAX_VALUE;
 		for (int k = 0; k < numbers.length; k++) {
 			if (numbers [k] < min) {
 				min = numbers [k];
 			}
 		}
 		System.out.println("Min value: "+min);
	}

}
