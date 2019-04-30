package homeWork_Assignments;
import java.util.*;

public class Assignment154_Methods_Palindrome {

	
	//class Main {
	  public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int num = scan.nextInt();
	    isPalindrome(num);
	  }
	  
	  public static void isPalindrome(int num){
	    //WRITE YOUR CODE HERE
	    int palindrome = num;
	    int reversed = 0; 
	    int remainder = 0;
	    
	    while (palindrome != 0) {
	      remainder = palindrome % 10;
	      reversed = reversed * 10 + remainder;
	      palindrome = palindrome / 10;
	    }
	    if (num == reversed) {
	      System.out.println(true);
	    }else {
	      System.out.println(false);
	    }

	  }
	}
	

