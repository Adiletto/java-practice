package homeWork_Assignments;
import java.util.Scanner;
public class Assignment075_WithoutXandX {

		//public class Main {
		  public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		  
		    
		    word = word.replace("x", "").replace("X", "");
		    	System.out.println(word);
		    
		
		
		
	}

}
/*
 * Example: 
input: xHiX 
output: Hi

Example:
input: apple 
output: apple

input: xUxL
output: UxL

input: JavaX
output: Java
*/

