package day020_forLoop;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		// if statement
		//using for loop 1-100
		//1) print all even numbers in same line
		
		for (int i= 1; i <= 100; i++) {
			if (i % 2 == 0) {  // check if it is even
				System.out.print(i+">");
			} 
		} 
			System.out.println();
			
		//2) print all odd numbers in same line
			for (int n = 1; n <=100; n++) {
				 if (n % 2 != 0) {
					System.out.print(n+" ");
			}
			
		}
		//3) sumOfOdds, sumOfEvens, - calculate them
			int sumOfOdds= 0;
			int sumOfEvens = 0;
			
			System.out.println();
			
			
			for (int num = 1; num <= 100; num++) {
				if (num % 2 == 0) {
					sumOfEvens += num;
				}else {
					sumOfOdds += num;
				}
			} 
			
			System.out.println("Sum of evens: "+ sumOfEvens);
			System.out.println("Sum of odds: "+ sumOfOdds);
	}

}
