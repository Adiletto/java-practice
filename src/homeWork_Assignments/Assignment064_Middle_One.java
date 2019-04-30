package homeWork_Assignments;

import java.util.*;

public class Assignment064_Middle_One {

	// public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		String print = scan.next();
		// YOUR CODE HERE

		if (word.length() % 2 == 1 && word.length() >= 3) {
			System.out.println(word.charAt(word.length() / 2));
		} else if (word.length() == 1) {
			System.out.println(word);
			System.out.println(word);
			System.out.println(word);
		} else if (word.length() % 2 == 0 && word.length() >= 4) {
			System.out.println(word.charAt((word.length() / 2) - 1) + "" + word.charAt(word.length() / 2));
		} else if (word.length() == 2) {
			System.out.println(word);
			System.out.println(word);
		}

	}
}
