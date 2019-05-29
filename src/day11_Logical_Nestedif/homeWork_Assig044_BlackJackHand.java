package day11_Logical_Nestedif;
	import java.util.*;
		public class homeWork_Assig044_BlackJackHand {
	
//class Main {
	  public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    int house = s.nextInt();
	    int player = s.nextInt();
	    //your code here
	  
	    if (player+house>21) {
	    	System.out.println("bust");
	    } else if (house>player) {
	    	System.out.println("player loses");
	    } else if (player > house) {
	    	System.out.println("player wins");
	    } else if(player == house){
	    	System.out.println("it's a tie");
	    }
	    
	    
	   
	  	}
	  }

