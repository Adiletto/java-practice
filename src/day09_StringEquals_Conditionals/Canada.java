package day09_StringEquals_Conditionals;

import java.util.Scanner;

public class Canada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String capital;
		Scanner scan = new Scanner (System.in);
		System.out.println("What is the capital of Canada?");
		
		/* capital = scan.next();
		 if (capital.equals("Ottawa")) {
			 System.out.println("Your answer is correct!");
		*/
		capital = scan.next();
		if(capital.equalsIgnoreCase("Ottawa")) {
			System.out.println("Your answer is correct!");
		
		 } else {
			 System.out.println("Sorry!"+capital+ " is not capital of Canada");
		 }
		 
	
		
		 
	}

}
