package homeWork_Assignments;
import java.util.*;
public class Assignment120Arrays_PrintShortestWord {

	  public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String[] str = {scan.next(), scan.next(), scan.next(), 
	                    scan.next(), scan.next(), scan.next()};
	
	String minWord = str[0];
	for (int i = 0; i < str.length; i++) {
		
		if (str[i].length() < minWord.length()) {
			minWord = str[i];
			
		}
		
	}
	
	System.out.println(minWord);
	
	
}
}