package day30_Methods02;

import java.util.Scanner;

public class WarmUpMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		print5Stars(); // call the method
		
		for (int i =0; i <5; i++) {
			print5Stars();
			
		}
		introduce () ;
		introduce () ;
	}

	public static void print5Stars() {

		System.out.println("* * * * *");
		
	}
	
	//method name: introduce()
	//param/argument: nothing
	//return type void;
	//it will ask for a name and say Nice to meet you
	
	public static void introduce () {
		Scanner scan = new Scanner (System.in);
		System.out.println("What is your name? ");
		String name = scan.next();
		System.out.println("Nice to meet you, "+name+"!");
	
	}
	
	
	
	

}
