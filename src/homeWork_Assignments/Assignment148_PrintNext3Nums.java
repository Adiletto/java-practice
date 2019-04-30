package homeWork_Assignments;
import java.util.Scanner;
//public class Assignment148_PrintNext3Nums {

	class Main {
	  
	  public static void main(String[] args) {
		  //System.out.print("enter number");
	     Scanner inp = new Scanner(System.in);
	    
	     int num = inp.nextInt();
	     
	  next3(num);
	  }
	  
	public static void next3(int num) {

	for (int i = num+1; i < num+4; i++) {
	  System.out.print(i+" ");
	}
	
	}
	}
	
	
	
	
	
	
	
	
	
	

