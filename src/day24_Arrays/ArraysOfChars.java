package day24_Arrays;

public class ArraysOfChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] values = { 'a', 'b', 'c' };

		for (char value : values) {
			System.out.println(value);
		}

		String str = "Wooden spoon";
		// this, method toCharArray() converts string into
		// array of characters
		char[] chars = str.toCharArray();
		for (char c : chars) {
			System.out.print(c+"_");
		}
		
		System.out.println();
		//print reverse
		
		str = "";
		for (int i = chars.length-1; i >= 0; i-- ) {
			//System.out.print(chars[i]);
			str+=chars[i];
		}
		System.out.println(str);
		
		//TASK
		//print char with help of array of characters, one by one
		//if character is equals 'o', 
		//replace with '*';
		
	
		for (char c: chars) {
			if (c == 'o') {
				System.out.print("*");
			}else {
				System.out.print(c);
			}
		}
	System.out.println();
		char [] newChars = new char [3];		
		System.out.println("Value of char: "+ newChars[0]);
		System.out.println(newChars[0]+0);
	}
}