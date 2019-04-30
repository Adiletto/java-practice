package day011_Logical_Nestedif;

import java.util.Scanner;

public class TollCalculator {

	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Enter vehicle type: 1|2 "); //1,2;
		int carType = keyboard.nextInt();
		
		System.out.println("Is is a rush hour: yes | no ");
		String answer = keyboard.next(); // yes|no
		
		// check if rushHour string is "yes" => assign true to isRushHour
		// if it is "no", assign false to isRushHour
		
		boolean isRushHour;
		if (answer.equalsIgnoreCase("yes")) {
			isRushHour  = true;
		} else {
			isRushHour = false;
		}
		//System.out.println(isRushHour);
		
		double price = 0.0;
		if (carType == 1) {
			if (isRushHour) {
				price = 30.0;  //A
			}else {
				price  = 5.0; //B
			}
		}else if (carType ==2) {
			if (isRushHour) {
				price = 55.30; //C
			} else  {
				price = 15.99; //D
			}
		}
		System.out.println("Toll cost " + price);
		
	}

}
