package homeWork_Assignments;
import java.util.Scanner;
public class Assignment090_CountJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    Scanner scan= new Scanner(System.in);
		    System.out.println("Enter a word");
		    String word = scan.next();
		int count =0;
		for (int i = 0; i <=word.length()-4; i++) {
			//System.out.println(word);
			if (word.substring(i, i+4).equals("java")) {
				count++;
			}
		}
		System.out.println(count);
		
		
		
		
//Return the number of times that the string "java" 
//appears anywhere in the given string word.
	//Example:
		    //input: javaxjava
		    //output: 2	
		
		
	}	
		
		
	}

	
	
	
	
	
	
	

	
	
	
	
	
	
	

	

