package homeWork_Assignments;

import java.util.*;

public class Assignment102_Reverse_Sentence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();

		String reverse = "";
		// TODO: Type your code below
		String[] adik = sentence.split(" ");
		for (int i = adik.length - 1; i >= 0; i--) {

			reverse = reverse + adik[i] + "\n";

		}
		System.out.println(reverse.trim());
	}
}
