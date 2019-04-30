package homeWork_Assignments;
import java.util.*;
public class Assignment118_Arrays_ReverseArray {

	  public static void main(String[] args) {
	    //Scanner input = new Scanner(System.in);
	   // int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    
		  int[] nums = { 4, 3, 2, 44, 1, 100, 55};
	    //TODO: write your code below

		  
		  
		  int temp=0;
		  
		  
		  for(int i=0;i<=nums.length/2;i++) {
	
	temp=nums[i];
	nums[i]=nums[nums.length-(1+i)];
	nums[nums.length-(1+i)]=temp;
//	temp=nums[i];
	
	
	
	
	
	
}
	    System.out.println(Arrays.toString(nums));
	    
	  }
	
}
	
