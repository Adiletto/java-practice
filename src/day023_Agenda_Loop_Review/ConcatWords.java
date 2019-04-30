package day023_Agenda_Loop_Review;

import java.util.Scanner;

public class ConcatWords {

	public static void main(String[] args) {
		
		String word = "";
		String allWords = "";
		Scanner keyboard = new Scanner(System.in);
		
		
		
		for (int i = 1; i < 6; i++) {
			System.out.println("Type the word:");
			word = keyboard.next();
			
			if (word.contentEquals("java")) {
				
				continue;
			}
			allWords+=word+", ";
		}
		System.out.println("All words: " + (allWords.length() > 1 ? allWords.substring(0, allWords.length() - 2) : ""));
	}
}