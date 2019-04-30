package homeWork_Assignments;
import java.util.*;
public class Assignment155_MethodsFibonacciNumbers {

	//public class Main {
	  public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int num = scan.nextInt();
	    fib(num);
	  }
	  
	  public static void fib(int num){
	    //WRITE YOUR CODE HERE
	    
	     int fib= 0;
	     int fib1 = 0;
	     int fib2 = 1;
	  
		
	    	for (int i = 2; i < num; i++) {
	    		fib = fib1 + fib2;
	    		fib1 = fib2;
	    		fib2 = fib;
	    	}
	    	if (num == 2) {
	  	      System.out.println(1);
	  	    }else {
	  	    	System.out.println(fib);
	    }
	    
	  }
	}
//In fibonacci series, next number is the sum of previous two numbers 
//for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,  89,  144,……... 
//The first two numbers of fibonacci series are 0 and 1.
//Given a number num, print n-th Fibonacci Number.
//Input  : 2
//Output : 1
//
//Input  : 9
//Output : 21

