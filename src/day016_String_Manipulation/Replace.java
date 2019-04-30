package day016_String_Manipulation;

import java.util.Scanner;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		System.out.println("Type word()s: ");
		
		String words = scan.nextLine();
		
		System.out.println(words.replace("a","y"));
		//happy people bring happy energy
		System.out.println(words.replace("sad", "happy"));
		
		
		System.out.println(words.replace(" ", "|"));
		
		
		
	}

}
