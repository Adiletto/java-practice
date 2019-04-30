package day010_LogicalsOperators_conditionals;

	import java.util.*;
public class HomeWork_Assig_034_VideoGameCoupons {

	//public class Main {
	  public static void main(String[] args) {
	    //Write your code here
		 
		  int coupons, candies, gumballs;
		  Scanner scan = new Scanner (System.in);
	    System.out.println("Enter number of coupons:");
	     coupons = scan.nextInt();
	     
	     candies = coupons / 10;
	     
	     coupons = coupons % 10;
	     
	     gumballs = coupons / 3;
	     
	     if (coupons <3) {
	    	 System.out.println("Not enough coupons!");
	    	 System.exit(0);
	     }
	    System.out.println("Number of Candies: "+candies);
	    System.out.println("Number of Gumballs: "+gumballs);
	  }
	}
	
	/*
	 * The video game machines at your local arcade output coupons according to
	how well you play the game. You can redeem 10 coupons for a candy bar or 3
	coupons for a gumball. You prefer candy bars to gumballs. Write a program that
	defines a variable initially assigned to the number of coupons you win. Next, 
	the program should output how many candy bars and gumballs you can get if
	you spend all of your coupons on candy bars first, and any remaining coupons
	on gumballs.

	if you the coupons are not enough for any redeem, display message:
	"Not enough coupons"
	 */

