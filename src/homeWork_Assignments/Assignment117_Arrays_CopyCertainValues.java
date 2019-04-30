package homeWork_Assignments;
import java.util.*;
public class Assignment117_Arrays_CopyCertainValues {

  public static void main(String[] args) {
    System.out.println("-----EXAMPLE RUN ---------");
    String[] numbers = {"zero", "one", "two","three","four"};
    System.out.println(Arrays.toString(getWithE(numbers)));
    
  }
  
  public static String[] getWithE(String[] arr) {
    
    //TODO : YOUR CODE GOES HERE ----------------------
	  
	 
	 
    int count = 0;
    for(int i = 0; i < arr.length; i++) {
      if (arr[i].contains("e")) {
        count++;
      }
    }
    
    String [] fewValues = new String[count];
    int c=0;
    for(int j=0;j<arr.length;j++) {
    	if(arr[j].contains("e")) {
    		fewValues[c++]=arr[j];
    	}
    }
    
    
    
    
    
    
    
    //YOUR CODE ENDS HERE -----------------------
    
    return fewValues;
  }
  
  
  
}
	
	
	
	
	
	
	
	

