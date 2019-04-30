package homeWork_Assignments;
import java.util.Scanner;
public class Assignment085_ShoppingList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    Scanner scan = new Scanner(System.in);
				String shoppingListReport = "";
				String item = "";
				String countinue = "";
				double price = 0;
				int count = 1;
				double totalPrice = 0;
				String answer = "";
		
		do {	
			
		System.out.println("Enter Item"+count+ " and its price: ");
		item = scan.next();
		price = scan.nextDouble();
		System.out.println("Add one more item?");
		answer = scan.next();
		
		
		count++;
		totalPrice += price;
		shoppingListReport +="Item"+count+ ": "+item +" Price " +price+",";
		
		
		}	while (answer.equals("yes")) ;
		
		System.out.println(shoppingListReport.substring(0,shoppingListReport.length()-2 ));
		System.out.println("Total price: "+ totalPrice);
		
		
		
		
		
		
		
		
	}

}
