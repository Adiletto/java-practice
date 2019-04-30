package day08_casting_conditionals;

import java.util.Scanner;

public class Is_Else_With_Scanner {

	public static void main(String[] args) {
		// passingPercentage = 65;
		// yourScorePercentage = take from scanner;
		// check if you passed or failed
		
		Scanner input = new Scanner (System.in);
		
		int passingPercentage = 65;
		System.out.println("What is you score?");
		
		int yourScorePercentage = input.nextInt();
		
		if (yourScorePercentage >= passingPercentage) {
			System.out.println("YOU PASSED! CONGRATULATIONS MAN!");
		}else {
			System.out.println("YOU FAILED! DA-AAMN MAN...");
			
			
		
		}
		
		System.out.println("Life is GOOD, bro!");
	}

}
