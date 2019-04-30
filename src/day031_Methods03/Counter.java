package day031_Methods03;

import java.util.Scanner;

public class Counter {
	public static void main(String[] args) {
		countUp (5);
		countUp (10);
		countUp (0);
		countUp(-5);
		
		countDown(3);
		int n =5;
		countDown (n);
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a number to countUp:");
		//get nuber from keyboard
		int inputNum = scan.nextInt();
		//call countUp method and set it as input
		countUp(inputNum);
	}
	
	/*
	1) name: countUp
	   return type: void
	   param: int
	   it prints from 1 to the value of the param
	   countUp(5);
	   1 2 3 4 5

	*/
	public static void countUp (int num) {
		
		if (num<1) {
			System.out.println("Invalid input - "+num);
		}else {
		for (int i = 1; i <= num; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	}
	
	/*
	 * name countDown
	   return type: void
	   param: int
	   it prints from param value till 1
	   countDown(5);
	   5 4 3 2 1

	*/
	public static void countDown(int number) {
		if (number<1) {
			System.out.println("Invalid input");
		}else {
		for (int n =number; n >=1; n--) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
		
	}	
}	


