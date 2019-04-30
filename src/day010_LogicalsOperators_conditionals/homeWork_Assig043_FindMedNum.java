package day010_LogicalsOperators_conditionals;
	import java.util.*;
		public class homeWork_Assig043_FindMedNum {

	//class Main {
	  public static void main(String[] args) {
	    //WRITE YOUR CODE HERE
	    int num1, num2, num3;
	    Scanner object = new Scanner (System.in);
	    System.out.println("Enter first number:");
	    num1 = object.nextInt();
	    
	     System.out.println("Enter second number:");
	     num2 = object.nextInt();
	     
	     System.out.println("Enter third number:");
	     num3 = object.nextInt();
	     
	     
	     if(num1>num2 && num1<num3 || num1>num3 && num1<num2) {
	    	 System.out.println("Meduim value is:" + num1);
	     } else if (num2>num1 && num2<num3 || num2>num3 && num2<num1) {
	    	 System.out.println("Medium value is:"+num2);
	     } else if(num3>num1 && num3<num2 || num3>num2 && num3<num1) {
	            System.out.println("Medium value is: "+ num3);
	        }
	     
	     
	  }
	}
	
	
	
	

