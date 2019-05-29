package day35_Methods07;

public class EncryptionFun {
public static void main(String[] args) {
	String alphabet = "abcdefghijklmnopqrstuvwxyz";
	String encrypted= "zyxwvutsrqponmlkjihgfedcba";
	
	String word = "kyrgyzstan";
	
//	"e" --> "v";
//	"a" --> "z";
//	"s" --> "h";
//	"t" --> "g";
//	"e" --> "v";
//	"r" --> "i";
	
	//get a char from word
	//find index of in alphabet
	//read the char from encrypted at the index
	//add to some string
	
	char first = word.charAt(0); // 'e'
	int position = alphabet.indexOf(first);
	System.out.println("Position: "+position);
	char enChar = encrypted.charAt(position);
	System.out.println(first + " --> " + enChar);

			//with a loop
	
		System.out.println("**** WITH LOOP ***");
	String encryptedWord = "";	
		for (int i=0; i < word.length(); i++) {
			char ch = word.charAt(i);
			//find alphabet
			int index = alphabet.indexOf(ch);
			encryptedWord+= encrypted.charAt(index);
		}
		System.out.println(word);
		System.out.println(encryptedWord);
}
}
