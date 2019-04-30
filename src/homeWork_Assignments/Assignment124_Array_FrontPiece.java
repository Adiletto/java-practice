package homeWork_Assignments;
import java.util.*;
public class Assignment124_Array_FrontPiece {

	//public class Main {
	  public static void main(String[] args) {
	   Scanner scan = new Scanner(System.in);
			int size = scan.nextInt();
			int[] num = new int[size];
			for(int i =0; i < size; i++) {
				num[i] = scan.nextInt();
			}
			//WRITE YOUR CODE HERE
	    
	   int adik [] = Arrays.copyOfRange(num, 0, 2);
//	   for (int temp : adik) {
//		   System.out.println(temp);
//	   }
	   if (adik.length < 2) {
		   System.out.println(adik[0]);
	   }
	     
	     
	   
	  }
	}
//Given an int array of any length, print a new array of its first 2 elements. 
//If the array is smaller than length 2, use whatever elements are present.
//Example:
//input 1, 2, 3 
//output: [1, 2]
//
//Example:
//input 1,
//output: [1]
