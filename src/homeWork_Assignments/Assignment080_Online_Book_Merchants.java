package homeWork_Assignments;
import java.util.Scanner;
public class Assignment080_Online_Book_Merchants {
		//public class Main {
		  public static void main(String[] args) {
		    int freeBooks = 0;
		    Scanner scan = new Scanner(System.in);
		    boolean isPremiumCustomer = scan.nextBoolean();
		    int nbooksPurchased = scan.nextInt();
		    
		    if ((isPremiumCustomer) && (nbooksPurchased >= 5) && (nbooksPurchased < 7)) {
		    	//System.out.println("");
		    	System.out.println(freeBooks = 1);
		    } else if ((isPremiumCustomer) && (nbooksPurchased >= 8) && (nbooksPurchased < 12)) {
		    	System.out.println(freeBooks = 2);
		    } else if (!(isPremiumCustomer) && (nbooksPurchased >= 7)) {
		    	System.out.println(freeBooks = 1);
		    } else if (!(isPremiumCustomer) && (nbooksPurchased >= 12)) {
		    	System.out.println(freeBooks = 2);
		    } else {
		    	System.out.println(freeBooks = 0);
		    }
		
		
		
	}

}
