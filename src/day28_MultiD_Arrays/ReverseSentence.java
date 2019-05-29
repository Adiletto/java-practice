package day28_MultiD_Arrays;

import java.util.Arrays;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence = "Jawoo Kanday Gana Keremet!";
		//split by space
		String reversed [] = sentence.split(" ");  
		System.out.println("Length of the sentence is: "+reversed.length);
		
		System.out.println(Arrays.toString(reversed));
		
		String str = "";
		
		for (int i = reversed.length-1; i >= 0 ; i--) {
			//System.out.println(reversed[i]);
			str+=reversed[i]+" ";
			
		}
		
		System.out.println(str);
		
		System.out.println();
		System.out.println("****** JON ELE PRAKTIKA ******");
		String suilom = "Bul suylom tetiri chygywy kerek";
		
		String tetiriSuilom []= suilom.split(" ");
		System.out.println(tetiriSuilom.length);
		System.out.println(Arrays.deepToString(tetiriSuilom));
		
		String str1 = "";
		
		for (int n = tetiriSuilom.length-1; n >= 0; n--) {
			str1+=tetiriSuilom[n]+" ";
		}
		System.out.println(str1);
	}

}
