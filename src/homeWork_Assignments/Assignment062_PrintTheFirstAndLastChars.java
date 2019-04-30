package homeWork_Assignments;
import java.util.Scanner;
public class Assignment062_PrintTheFirstAndLastChars {
	
	//public class Main {
	  public static void main(String[] args) {
	    //DO NOT CHANGE
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter a word:");
	    String word = scan.next();
	    //WRITE YOUR CODE HERE
	   
	    System.out.print(word.charAt(0));
	    System.out.println(word.charAt(word.length()-1));
	  }
	}


