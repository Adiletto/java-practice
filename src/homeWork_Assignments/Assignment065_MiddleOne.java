package homeWork_Assignments;
import java.util.*;
public class Assignment065_MiddleOne {
		//public class Main {
		  public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    System.out.println("Enter a word:");
		    String word = scan.next();
		    //YOUR CODE HERE
		
		if (word.length()%2 ==1 && word.length()>=5) {
			System.out.println(word.substring(2,5));
		}else {
			System.out.println("invalid");
		}
	
	}

}


