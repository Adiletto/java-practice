package day023_Agenda_Loop_Review;

import java.util.Scanner;

public class CalculateSum {

	public static void main(String[] args) {
		
		//let's write a program
		//that will calculate sum of 6 numbers
		//if number is less or equals to 0, ignore this
		// we need to ask user to provide a number
		
		int sum = 0;
		int num = 0;
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 6; i++) {
			System.out.println("Enter a number:");
			num = scan.nextInt();
			if (num <= 0) {
				continue;
				//if we will put #break, it will quit when we enter negative number
			}
			sum+=num;
		}
		
		System.out.println("Total summary: "+sum);
		
		
		
	}

}
