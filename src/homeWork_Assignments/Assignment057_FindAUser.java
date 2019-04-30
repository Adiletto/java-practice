package homeWork_Assignments;

import java.util.Scanner;

public class Assignment057_FindAUser {

	// public class Main {
	String userName;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// WRITE YOUR CODE HERE

		System.out.println("Enter full name:");
		String name = scan.nextLine();

		if ((name.equalsIgnoreCase("Alan Wake") || name.equalsIgnoreCase("Max Payne"))) {
			System.out.println("User found!");
		} else {
			System.out.println("User not found!");
		}

	}
}

