package day31_Methods03;

import java.util.Arrays;

public class MethodsWithStrings {

	public static void main(String[] args) {
		
	
	 countWords("java is fun");
	countWords("this is method with strings");
	
	googleSearchResults("About 121,000,000 results (0.75 seconds)");
	String resultsStr = "About 16,600,000 results (0.73 seconds)";
	googleSearchResults(resultsStr);
	
	}
	public static void countWords(String sentence) {
		String []words = sentence.split(" ");
		System.out.println("Words in this sentence "+Arrays.toString(words));
		System.out.println("Number of words: "+ words.length);
	}
	

	/*2) Method name: googleSearchResults
	   Return type: void
	   params: 1 String

	   googleSearchResults("About 121,000,000 results (0.75 seconds)");

	   "Results count: 121000000"
	   "Time in seconds: 0.75"

	   googleSearchResults("About 16,600,000 results (0.73 seconds)");

	   "Results count: 16600000"
	   "Time in seconds: 0.73"
*/

//googleSearchResults("About 121,000,000 results (0.75 seconds)");
	public static void googleSearchResults (String result) {
		//split by space into array
		String [] words = result.split(" ");
		String   count = words[1].replace(",", "");
		String seconds = words[3].replace("(", "");
		
		System.out.println("Results count: "+count);
		System.out.println("Time in seconds: "+seconds);
	}

}





