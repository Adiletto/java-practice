package day06_Operators;

import java.util.Scanner;

public class EnterNumber {
	public static void main (String [] args) {
		
		Scanner scan = new Scanner(System.in); // create Scanner object
		
		              //Scanner is a class.
		               //scan is a variable that is holding an object of Scanner class
		
		System.out.println("Enter a number: ");
		int number = scan.nextInt();
		
		System.out.println("You entered " + number);

		
		
	}

}
