package day021_Loop_Practice1;

import java.util.Scanner;

public class GetUniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter a word");
		
		String word = scan.next();
		String unique = "";
	/*	
		for (int i = 0; i < word.length(); i++) {
			System.out.print(i);
			System.out.println(word.charAt(i));
		}
	*/	
		
		for (int i = 0; i < word.length(); i++) {
			//read the letter and assign
			char letter = word.charAt(i);
			//System.out.println(letter);
		
		
		
		if (!unique.contains(""+letter)) {
			unique += letter; //add to unique
		}
		
		}
		System.out.println(unique);
		
		
		
		
		
		
		
		
	}

}
