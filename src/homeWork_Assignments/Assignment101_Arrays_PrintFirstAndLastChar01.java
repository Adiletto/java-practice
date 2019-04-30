package homeWork_Assignments;
import java.util.*;
public class Assignment101_Arrays_PrintFirstAndLastChar01 {

  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
    //String[] words = {"hello", "why", "by", "apple" , "note"};
    //TODO: Write your code below
    
    

  for (int i=0; i < words.length;i++) {
	  System.out.println(words[i].charAt(0)+""+words[i].charAt(words[i].length()-1));
  }

//		
//		for (int i = 1; i > words.length; i++ ) {
//			System.out.println(words[i].substring(0, words.length-1));
//			//System.out.println(words[i].charAt(0)); //charAt(words.length-1));
//		}
		
		
	}

}


