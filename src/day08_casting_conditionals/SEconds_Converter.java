package day08_casting_conditionals;

//public class HomeWork_Seconds_Converter {
	import java.util.*;

	public class SEconds_Converter {
	  public static void main(String[] args) {
	    //YOUR CODE HERE:
	        int inputSeconds, hours, minutes, seconds;
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter seconds: ");
	    inputSeconds = scan.nextInt();
		//scan.object = scan.nextInt();
	    
	    seconds = inputSeconds%60;
	    minutes = (inputSeconds/60)%60;
	    hours = (inputSeconds/60)/60;
	    
	    
	  System.out.println("hours "+hours+", "+"minutes "+minutes+", "+"seconds "+seconds);  
	  //hours, minutes, seconds variables
	}

}
