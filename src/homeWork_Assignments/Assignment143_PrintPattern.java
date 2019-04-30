package homeWork_Assignments;

public class Assignment143_PrintPattern {
	//class Main {
		  
		  
		  
	public static void printHollowRect(){
		   for (int i =0; i < 5; i++) {
			   
			   System.out.print("*");
		   }
		   System.out.println();
		   System.out.println("*   *");
		   System.out.println("*   *");
		   System.out.println("*   *");
		  }
		  
		  public static void main(String[] args) {
		   
		    printHollowRect();
		  
		  
		  for(int n =0; n < 5; n++) {
			  System.out.print("*");
		  }
		  
}
}		
//Create a method printHollowRect that 
//prints a 5 on 5 hollow rectangle:
//	*****
//	*   *
//	*   *
//	*   *
//	*****
//	
//hint:you will need to use two nested for loops for that, and an if that 
//checks if its the last or first iteration of the loop (so you will know whet to print "*" or " ")
