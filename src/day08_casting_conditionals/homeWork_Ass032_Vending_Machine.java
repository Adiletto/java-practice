package day08_casting_conditionals;
	import java.util.*;
		public class homeWork_Ass032_Vending_Machine {

	public static void main(String[] args) {
		
		int itemPrice, quarters, dimes, nickels;
		
		Scanner object = new Scanner (System.in);
		System.out.println("Enter price in cents:");
		itemPrice = object.nextInt();
		
		if (itemPrice>100) {
			System.out.println("Invalid price!");
		}else if(itemPrice<=25) {
			System.out.println("Invalid price!");
		}else if (itemPrice%5!=0){
			System.out.println("Invalid price!");
		} else  {	
			
	
		
		int change = 100 - itemPrice;
		quarters = change / 25;
		
		int quarterRemainder = change%25;
		dimes = quarterRemainder/10;
		
		int dimesRemainder = quarterRemainder%10;
		nickels = dimesRemainder/5;
		
		System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels +" nickels.");
		}
		
		
		
	}

}
