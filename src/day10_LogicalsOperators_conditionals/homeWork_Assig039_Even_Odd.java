package day10_LogicalsOperators_conditionals;
	import java.util.*;
		public class homeWork_Assig039_Even_Odd {
	//public class Main {
				public static void main(String[] args) {
					
				
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter a number:");
	    int number = input.nextInt();
	   
	    //CODE HERE 
	    if (number%2 == 0 ) {
	    	System.out.println(number + " is even");
	    		
	    }else if (number%2 == 1) {
	    		System.out.println(number + " is odd");
	    		
	    	}else if (number == 0) {
	    		System.out.println(number + " is even");
	    	}
	    	
	    }
		}    

		/*
		U have an Integer number already declared and assigned value.

		Using conditional statements, check if number is odd or even. 
		Please follow the below examples and print message accordingly:
		Enter a number:
		10
		10 is even

		Enter a number:
		33
		33 is odd

		Enter a number:
		0
		0 is even
		 */