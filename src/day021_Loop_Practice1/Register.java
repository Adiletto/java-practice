package day021_Loop_Practice1;

import java.util.Scanner;

public class Register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner (System.in);
		System.out.println("Welcome! How many items are you purchasing today?");
		int itemCount = scan.nextInt();
		double totalPrice = 0.0;
		
		String items = "";
		//String item2 = scan.next();
		
		
		for (int count = 1; count <= itemCount; count++) {
			System.out.println("What is item "+ count+"?");
			String itemName = scan.next();
			
			System.out.println("How much is "+itemName+"?");
			double itemPrice = scan.nextDouble();
			
			//add itemName to items and itemPrice to totalPrice
			items += itemName + ", ";
			totalPrice +=itemPrice;
		}
		if (!items.endsWith(",")) {
			System.out.println(items);
			
			//get rid of that
		}
		System.out.println("Your items: " + items);
		System.out.println("Your total Price: $"+totalPrice);
		
	}

}
