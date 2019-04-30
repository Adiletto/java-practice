package day020_forLoop;
import java.util.*;
	public class Multiplication_Table {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner (System.in);
		System.out.println("Enter number:");
		int num = scan.nextInt();
		
		//check if it is valid
		// if not valid, return;
		
		if (num < 1 || num > 10) {
			System.out.println("ERRROR: Invalid input!");
			return; //stop execution here
			//System.exit(0); ===============> stop execution here
		} 
			
		//for loop to print multiplication table
		for (int i = 1; i <= 10; i++) {
			
			System.out.println(num + " x " + i + " = " + (num * i));
			
			}
		
		
		
		
		
	}

}
