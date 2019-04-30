package day026Arrays04;

import java.util.Arrays;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String words = "java,kava,html,selenium";
		String [] wordsArray=words.split(",");
		
		System.out.println("Count: "+wordsArray.length);
		
		System.out.println(wordsArray[0]); //will print each line separately
		
		
		System.out.println(Arrays.toString(wordsArray)); //will print everything
		
		
		for (String word : wordsArray) {
			System.out.println(word);
		}
		
		
		String diceResult = "1 - 20 of 1,461 positions";
		//using split method, print 1,461
		String [] diceArray = diceResult.split(" ");
		
		System.out.println("Search result total: "+diceArray[4]);
		
		String [] diceResult2 = diceResult.split("of"); //it became 2 index. Before and after "of".
		System.out.println(diceResult2[0].trim());
		System.out.println(diceResult2[1].trim());
		
		
		String sentence = "I felt happy because I saw the others were happy and because"
				+ " I knew I should feel happy, but I wasn’t really happy."; 
		String [] allWords = sentence.split(" ");
		String [] happySplit = sentence.split("happy");
		String [] Isplit = sentence.split("I");
				
		System.out.println("***** AFTER SPLIT *******");
		for (String w: happySplit) {
			System.out.println(w);
		}
		             //0123
		String word = "java";
		char[]charsArray=word.toCharArray();
		
		for (char ch: charsArray ) {
			System.out.println(ch);
		}
		
		
		
	}

}
