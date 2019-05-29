package day19_Loops;

public class PrintLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "Amazon";
		//print each character one by one in separate lines
		int idx = 0;
		
		while (idx < word.length()) {
			System.out.println(word.charAt(idx++));
		}
		
		
		
		System.out.println(); //empty line
		
		// print the word back to front Amazon --> nozamA
		int idx2 = word.length()-1; //5
		
		while (idx2 >= 0) {
			System.out.println(word.charAt(idx2--));
			
		}
		
		
		
		/*int idx = 0;
		System.out.println(word.charAt(idx));
		idx++;
		System.out.println(word.charAt(idx));
		
		idx++;
		System.out.println(word.charAt(idx));
		
		idx++;
		System.out.println(word.charAt(idx));
		
		idx++;
		System.out.println(word.charAt(idx));
		
		idx++;
		System.out.println(word.charAt(idx));
		*/
	}

}
