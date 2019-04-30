package day020_forLoop;
import java.util.*;
public class Neighbors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter word:");
		String word = scan.next();
		//aabcdd if character and next are same print
		// print: Be-eeep a
		//print : Be-eeep b
		
		for (int i = 0; i < word.length()-1; i++)  {
			if (word.charAt(i) == word.charAt(i+1))  {
				System.out.println("Be-eep - " + word.charAt(i));
			}
		}
		
	}

}
