package homeWork_Assignments;

	import java.util.*;
public class Assignment152_PrintUniqueNUm {


	//public class Main {
	  public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int size = scan.nextInt();
	    int[] nums = new int[size];
	    for(int i=0; i < size; i++){
	      nums[i] = scan.nextInt();
	    }
	    printUniqueNumbers(nums);
	  }
	  
	  public static void printUniqueNumbers(int[] nums){
	    //WRITE YOUR CODE HERE
		  int unique =0;
		  for (int k =0; k < nums.length; k++) {
			  int thisInt = nums[k];
			  boolean urMat = false;
		      for (int m = 0; m < k; m++ ) {
		        if (thisInt == nums[m]) {
		        urMat = true;
		        }
		        
	    
	  }
		      if(!urMat) {
		    	  unique++;
		      }
		      System.out.println(unique);
	}
		  
	  }
}
/*Complete a void method printUniqueNumbers() that will print 
all unique numbers from an array of ints. 
Every single unique int should be printed from the new line.
Example:
input:[2, 5, 5, 6, 3, 6, 9, 34, 3]
output:
2
9
34 
*/	
	
	
	
	
	
	

