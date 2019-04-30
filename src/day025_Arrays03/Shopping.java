package day025_Arrays03;

public class Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] products = {"Krutoi Shoes", "H & M shirts", "Rolex Watch", "Gucci Bag", "Adidas Sneakers"};
		double [] prices = {120.5, 20.89, 150.90, 3000.00, 6.99};
		int [] itemsID = {12345, 23456, 34567, 45678, 56789};
		
		
		//Print count of products
		System.out.println("Products count: "+products.length);
		
		//check if products, prices and itemsID have same count
		
		if (products.length == prices.length && products.length == itemsID.length) {
			System.out.println("Shopping list looks good");
		} else {
			System.out.println("Something is wrong in this list");
			return;
		}
		
		//loop through products and print each one in separate line
		//{"Krutoi Shoes", "H & M shirts", "Rolex Watch", "Gucci Bag", "Adidas Sneakers"};
		for (String temp : products ) {
			System.out.println(temp);
		}
		
		
		//prices --> for loop
		
		for (int i = 0; i < prices.length; i++) {
			System.out.println(prices [i]);
		}
		
		System.out.println("***** REVERSE ******");
		//itemsId --> print this in reverse order using a loop
		
		System.out.println(itemsID[itemsID.length-1]);
		
		for (int idx = itemsID.length -1; idx >= 0; idx--) {
			System.out.println(itemsID[idx]);
		}
		
		
		//print a report. with a total price
		//Item 1: 12345 --> 
		
		System.out.println("###### YOUR SHOPPING RECEIPT #####");
		
		double totalPrice = 0.0;
		for (int idx = 0; idx < products.length; idx++) {
			System.out.println("Item "+(idx+1)+": "+itemsID[idx]+ " - "+products[idx]+" - $ "+prices[idx]);
			totalPrice += prices [idx];
		}
		
	System.out.println("Total Price is: $"+ totalPrice);
		
		
		//find the most expensive item in your list, and print it is a report
		//loop and find
	
	int maxIndex = 0;
	double maxPrice = 0;
	
	for (int j = 0; j < prices.length; j++) {
		 if (prices[j] > maxPrice) {
			 maxPrice = prices[j];
			 maxIndex = j;
		 } 
	}
	
	
		System.out.println("Most expensive item is: "+itemsID[maxIndex]+" - "+ products[maxIndex]+ " - $"+maxPrice);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
