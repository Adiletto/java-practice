package day23_Loops_And_Arrays;
import java.util.*;
public class WarmUpTask_PrimeNUmber {

	public static void main(String[] args) {

		//Scanner scan = new Scanner (System.in);
		//System.out.println("enter a number");
		int num = new Scanner(System.in).nextInt();
		//int num = scan.nextInt();
		//int count = 0;
		
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
			

				System.out.println("This is NOT a prime number!");
				return;
			} 
		}
		System.out.println(num+" - it is a prime number!");
		
	
		
}
}