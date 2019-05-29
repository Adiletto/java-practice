package day24_Arrays;

public class LettersWithForLoop_Nested {

	public static void main(String[] args) {

		
		for (char i = 'a'; i <= 'e'; i++) {
			for (char letter = 'a'; letter <= 'e'; letter++) {
				System.out.print(i);
				System.out.println(letter);
			}

		}

	}

}
