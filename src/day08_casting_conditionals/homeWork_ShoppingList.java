package day08_casting_conditionals;

import java.util.Scanner;

public class homeWork_ShoppingList {

	public static void main(String[] args) {
		
		String item1, item2, item3, report = null;
		double price1, price2, price3, totalPrice, totalPrice1 = 0,totalPrice2 = 0, totalPrice3 = 0 ;
		int count1, count2, count3;
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter Item1, count and its price:");
		item1 = scan.next();
		count1 = scan.nextInt();
	    price1 = scan.nextDouble();
	    	System.out.println("Enter Item2, count and its price:");
	    	item2 = scan.next();
	    	count2 = scan.nextInt();
	    	price2 = scan.nextDouble();
	    		System.out.println("Enter Item3, count and uts price:");
	    		item3 = scan.next();
	    		count3 = scan.nextInt();
	    		price3 = scan.nextDouble();
	    		
	    		
	    		
	    		totalPrice = 0;
				
				if(count1 > 0){
					totalPrice1 = price1 * count1;
				}
				
				if(count2 > 0){
					totalPrice2 = price2 * count2;
				}
				
				if(count3 > 0){
					totalPrice3 = price3 * count3;
				}
				
				totalPrice = totalPrice1+totalPrice2+totalPrice3;
	    
		
				System.out.println("Item1: " + item1+" Price: "+totalPrice1+", "+ "Item3: " + " "+item3+" Price: "+totalPrice3);
				
				
				//System.out.println(report);
				
				System.out.println("Total price: "+totalPrice);
				
				
	}

}
