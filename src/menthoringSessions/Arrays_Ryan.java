package menthoringSessions;

import java.util.Scanner;

public class Arrays_Ryan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//replace all vowels the "vowel-"
		
		String str = new Scanner (System.in).nextLine();
		String [] vowels = {"a", "e", "i", "o", "u"};
		                   //0,   1,   2,   3,   4.
		
		
		// replacing vowels inside the loop
		for (int idx = 0; idx <= vowels.length; idx++) {
			
			if (idx < vowels.length ) {
				str = str.replace(vowels[idx], "#");
			}else {
				str = str.replace("#", "[vowel]");
			}
		
		
		}
		System.out.println(str);
		
		
	}

}
