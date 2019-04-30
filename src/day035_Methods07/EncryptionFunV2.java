package day035_Methods07;

public class EncryptionFunV2 {
	public static void main(String[] args) {
		System.out.println(encryptChar('z'));
		System.out.println(encryptChar('m'));
		
		String normal = "sunday";
		String encrypted = encryptWord(normal);
		System.out.println("normal: "+normal + "\n" + "encrypted: "+encrypted);
		
		 System.out.println(encryptSentence("java is fun"));
		 System.out.println(encryptSentence("i love java"));
	}
	/*
	 * encrypChar
	 * return type: char
	 * param: char
	 * takes a char and returns encrypted version
	 * encryptChar('a') == 'z'
	 */
	public static char encryptChar(char ch) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted= "zyxwvutsrqponmlkjihgfedcba";
		
//VERSION 1		
		//return encrypted.charAt(alphabet.indexOf(ch));
		
//VERSSION 2		
		int i = alphabet.indexOf(ch);
		char ret = encrypted.charAt(i);
		return ret;
	}
	
	/*
	 * encryptedWord
	 * return type: String
	 * param: String
	 * take a string and returns encrypted version for the whole word
	 */
		
	public static String encryptWord (String word) {
		String cyphered = " ";
		
		for (int i=0; i< word.length(); i++) {
			cyphered+= encryptChar(word.charAt(i));
		}
		return cyphered;
	} 
		/*
		 * encryptSentence
		 * return type: String
		 * param: String sentence
		 * Split the sentence by space and call encryptedWord and 
		 *return encrypted sentence
		 *java is fun
		 */
	
	public static String encryptSentence(String sentence ) {
		String [] wordsArr = sentence.split(" ");
		String retValue = "";
		
		for (String word: wordsArr ) {
			retValue += encryptWord(word)+" ";
		}
		return retValue.trim();
	}
}
