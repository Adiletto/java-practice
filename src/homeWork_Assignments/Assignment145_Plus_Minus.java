package homeWork_Assignments;
import java.util.Scanner;
public class Assignment145_Plus_Minus {
	
	//class Main {
	  
	  public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    int size = inp.nextInt();
	    int[] arr = new int[size];
	    for(int i=0 ;i<=size-1;i++) {

	        arr[i]=inp.nextInt();
	    }
	    
	    plus_minus(arr);
	  }//end main
	  
	  public static void plus_minus (int [] array) {
	  int pos = 0; 
	  int neg = 0; 
	  int zero = 0;
	  
	  for (int n = 0; n < array.length; n++ ) {
		  if (array [n] > 0) {
			  pos++;
		  }else if (array [n] < 0) {
			  neg++;
		  }else {
			  zero++;
		  }
	  }
	  System.out.println("positives: "+pos+", "+"negatives: "+neg+", zeros: "+zero);
	}
}
//Create a method called plus_minus that gets an array of ints (int[]), 
//it outputs how many negative , positive and zero numbers are in the array.
//for example:
//	plus_minus (new int[]{1,2,55,-9,-2,0});
//printout:
//positives:3, negatives:2, zeros:1