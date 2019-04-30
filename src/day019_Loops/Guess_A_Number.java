package day019_Loops;

import java.util.Random;
import java.util.Scanner;

public class Guess_A_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		Random random = new Random(); // ==> is used to generate random numbers
		
		
		System.out.println("## WELCOME TO GUESS A NUMBER GAME ###");
		// this will give us a number between 0-100;
		
		int secretNum = random.nextInt(101);
		int guessNum = 0;
		
		do {
				System.out.println("Guess a number:");
			guessNum = scan.nextInt();
			if (guessNum < secretNum) {
				System.out.println("Your number is too small");
			} else if (guessNum > secretNum) {
				System.out.println("Your number is too large");
			}
			
		} while (guessNum != secretNum);
		
		
		System.out.println("Bingo! Congrats! You won!");
		
		
		
		
		
	}

}
