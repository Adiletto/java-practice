package homeWork_Assignments;
import java.util.*;
public class Assignment052_TernaryOperator1 {
	

	//class Main {
	  public static void main(String[] args) {
	    //DO NOT CHANGE
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter number:");
			int x = scan.nextInt();
			//WRITE YOUT CODE HERE
			
			int y=(x>=5 && -x<5)? x : -x;
			System.out.println(y);
			
	  }
	}


