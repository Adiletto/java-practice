package day019_Loops;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter word to test:");
		
		String word = scan.next();
		String reversed = "";
		// loop through word in reverse order and
				// concat each char to reversed string
					
		int idx = word.length()-1;
		
		
		while (idx >= 0) {
			reversed = reversed + word.charAt(idx);
			idx--;
		}
		System.out.println(reversed);
		
		//compare if word and reversed are equal
		
		if (reversed.equalsIgnoreCase(word)) {
			System.out.println("It is palindrome word");
		}else {
			System.out.println("It is NOT palindrome");
		}
		
	}

}
