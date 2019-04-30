package day030_Methods02;
import java.util.*;

public class MyNumbers {

	public static void main(String[] args) {

		showMe5Numbers();
		showMe5Numbers();
		showMe5Numbers();
		showMe5Numbers();
		showMe5Numbers();
		
		do10PushUps();
		do10PushUps();
		
		rangePrint();
	}		
	/*method name: showMe5Numbers
   return type: void
   params: no
   prints 5 random numbers 0, 1000
   in same line separated by comma
   Ex:
   showMe5Numbers(); 345 234 566 2 23
		
		*/
		public static void showMe5Numbers() {
			Random r = new Random ();
			for ( int i =1; i<=5; i++) {
				System.out.print(r.nextInt(1001)+" ");//print random num 0-1000
			}
			System.out.println(); //take it to new line
		}
		
		
		/*
		 * 2) name: do10PushUps
return type: void
params: no


pushUp - 1;
pushUp - 2;
pushUp - 3;
...
pushUp - 10;
Time to rest;
		 */
		
		public static void do10PushUps() {
			
			for (int n =1; n <=10; n++) {
				System.out.println("PushUp bro "+n);
			}
			System.out.println("Good job, bro! Time to rest!");
		}
		
//		3) method name: rangePrint
//		return type: void;
//		params/args: no;
//		Using a scanner ask for 2 int;
//		You need to print all numbers between those two numbers.
//		ex: rangePrint();
//		5
//		8
//		5 6 7 8
//
//		rangePrint();
//		10
//		7
//		10 9 8 7;
		
//		rangePrint();
//		   40
//		   40
//		   40
		
		
		
		public static void rangePrint() {
			
			Scanner scan = new Scanner (System.in);
			System.out.println("Enter 2 numbers:");
			int num1 = scan.nextInt(); //2
			int num2 = scan.nextInt(); //5 -> 2 3 4 5
			
			if (num1 < num2) {
				for (int j = num1; j <= num2; j++) {
					System.out.print(j+" ");
				}
			}else if (num1 > num2) {
				for (int k =num1; k >= num2; k--) {
					System.out.println(k+" ");
				}
				
			}else {
				System.out.println(num1);
			}
			
			System.out.println();
			
		}
		
		
		
		
		
		
			
}	
	


