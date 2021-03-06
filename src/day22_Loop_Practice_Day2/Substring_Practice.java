package day22_Loop_Practice_Day2;

public class Substring_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "java";
		
		System.out.println(word.substring(0,2));
		
		//print each char in separate line using
		//substring, no loop needed
		System.out.println(word.substring(0,1));
		System.out.println(word.substring(1,2));
		System.out.println(word.substring(2,3));
		System.out.println(word.substring(3,4));
		
		System.out.println("#########################");
		int i = 0;                      //0 , 1
		System.out.println(word.substring(i, i+1));
		i++;                            //1 , 2
		System.out.println(word.substring(i, i+1));
		i++;
		System.out.println(word.substring(i, i+1));
		i++;
		System.out.println(word.substring(i, i+1));
		
		System.out.println("########## FOR LOOP ###############");
		
		        //java
				//0123
		for (int n = 0; n <= 3; n++) {
			//System.out.println(word.substring(n, n+1));
			String letter = word.substring(n, n+1);
			System.out.println(letter);
		}
		
		System.out.println("########## REVERSE ###############");
		// print letter in reverse
		// a v a j
		for (int n = 3; n >= 0; n--) {
			//System.out.println(word.substring(n, n-1));
			String letter = word.substring(n, n+1);
			System.out.println(letter);
		}
		
		
		System.out.println("#########################");
		
		
		int start = 1;
		int end = 10; //01234567891011
		String word2 = "UnitedStates";
		System.out.println(word2.substring(start,end));
		
		System.out.println(word2.substring(2,3)); //i
		
		System.out.println(word2.substring(6,7)); //S
		// pass single input. start only and will include until last char
		System.out.println(word2.substring(6)); //States
		
		//print last character
		String word3 = "apple";
		System.out.println(word3.substring(word3.length()-1));
		
	}

}
