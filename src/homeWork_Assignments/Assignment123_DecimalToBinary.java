package homeWork_Assignments;
import java.util.*;
public class Assignment123_DecimalToBinary {
	
	//class Main {
	  public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
	    int decimal = input.nextInt();
	    int[] binary = new int[8];
	    
	    //TODO: Write your code below.
	    
	   for (int i = binary.length-1; i>=0; i--) {
		   binary[i] = decimal%2;
		   decimal = decimal/2;
		   
	   }
	   
	  
	    System.out.println(Arrays.toString(binary));
	    
	  }
	}

//Given an int variable decimal,  write java program to calculate 
//binary value of the decimal variable and assign it binary array. 
//print out value of binary array matching below format. 
//Feel free to use additional arrays or formulas.
//decimal -> 35
//binary -> [0, 0, 1, 0, 0, 0, 1, 1]



