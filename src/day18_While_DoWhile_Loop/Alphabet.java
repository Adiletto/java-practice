package day18_While_DoWhile_Loop;

public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char letter = 'a';
		
		
		while (letter <= 'z') {
			System.out.print(letter+"->"); 
			letter++;
		}
		System.out.println();// new line
		
		char capitals = 'A';
		
		while (capitals <= 'Z') {
			System.out.print(capitals+" ");
			capitals++;
		}
		System.out.println(); //new line
		
		
		char revLetter = 'z';
		
		while (revLetter >= 'a') {
			System.out.print(revLetter+" <-");
			revLetter--;
		}
		System.out.println();
		
		//char triangle = 'A';
		
		String letters = "";
		letters = letters + 'A';
																/*	System.out.println(letters); //A
		
																letters = letters + 'B';
																System.out.println(letters); //AB
																
																letters = letters + 'C';
																System.out.println(letters);//ABC
																
																letters = letters + 'D';
																System.out.println(letters);//ABCD
																
																letters = letters + 'E';
																System.out.println(letters);//ABCDE
																				 		*/	
		char myLetter = 'A';
		
		while (myLetter <= 'Z') {
			letters = letters + myLetter;
			System.out.println(letters);
			myLetter++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
