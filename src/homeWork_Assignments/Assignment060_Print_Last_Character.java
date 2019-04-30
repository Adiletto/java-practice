package homeWork_Assignments;
import java.util.Scanner;
public class Assignment060_Print_Last_Character {

	

	//public class Main {
	  public static void main(String[] args) {
	    //DO NOT CHANGE
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter a word:"); // test just for myself
	    String word = scan.next();
	    //WRITE YOUR CODE HERE
	    char lastChar = word.charAt(word.length()-1);
	    System.out.println(lastChar);
	  }
	}
	
	

