package day035_Methods07;

public class DecryptionFun {

	public static void main(String[] args) {
		System.out.println(decryptSentence("r  olev  qzez"));
		System.out.println(decryptSentence("glwzb xozhh rh ufm"));
		System.out.println(decryptSentence("dv ziv hgfwvmgh lu xbyvigvp hxsllo"));
		System.out.println(decryptSentence("zp nlmtfof zhpz alloli gzzozozi"));
		System.out.println(decryptSentence("gszmp blf"));
		//gszmp blf
		
	}

	public static char decryptChar(char ch) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";
		int i = encrypted.indexOf(ch);
		char ret =  alphabet.charAt(i);
		return ret;
	}

	public static String decryptWord(String word) {
		String converted = "";
		for (int i = 0; i < word.length(); i++) {
			converted += decryptChar(word.charAt(i));
		}
		return converted;		
	}

	public static String decryptSentence(String sentence) {
		String[] wordsArr = sentence.toLowerCase().split(" ");
		String retValue = "";
		for(String word : wordsArr) {
			retValue += decryptWord(word)+" ";
		}
		return retValue.trim();
	}
}
		