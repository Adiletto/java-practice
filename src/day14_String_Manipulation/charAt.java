package day14_String_Manipulation;

public class charAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "Computer";
		System.out.println(word.length());
		//print all characters one by one
		
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(5));
		System.out.println(word.charAt(6));
		System.out.println(word.charAt(7));
		//System.out.println(word.charAt(8));
	
		//String word2 and check if first char is 'J'
		
		String word2 = "Java";
		if (word2.charAt(0)=='J') {
			System.out.println("J is first char");
		}else {
			System.out.println("J is not first char");
		}
	
		String word3 = "asaba";
		
		char first = word3.charAt(0);
		char last = word3.charAt(4);
		
		if (first == last) {
			System.out.println("First and last match");
		} else {
			System.out.println("First and last not match");
		}
		
		//String word4 => always print the last character
		// no matter the length
		
		String word4 = "Automation";
		char lastChar = word4.charAt(word4.length()-1); // we have to add (-1), cause index starts from (0)
		
		System.out.println("Last character of "+ word4+ " is " + lastChar);
		
		
	}

}
