package day024_Arrays;

public class CheckFirstAndLastValue {

	public static void main(String[] args) {
		// write a program that will print true
		// if first and last number is the same
		// if first and last value in the same array is ints
		// is same, print true

		int[] numbers = { 12, 41, 213, 21, 42, 12 };
		// .length <- it's not a method, it's a instance variable (property)
		boolean equals = numbers[0] == numbers[numbers.length - 1];
		System.out.println(equals);

	}

}
