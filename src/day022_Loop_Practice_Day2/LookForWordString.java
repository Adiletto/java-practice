package day022_Loop_Practice_Day2;

public class LookForWordString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence = "He said hi, then she replied hi. hi guys!";
		//print letters in pairs
		//He
		// e
		//s
		//ai
		int count = 0;
		for (int i = 0; i < sentence.length()-1; i++) {
		String temp = sentence.substring(i, i+2);
		//System.out.println(temp);
		
		if (temp.equals("hi")) {
			count++;
		}
		
		}
		//Count:3
		System.out.println("Count: "+count);
		
		
		
		
	}

}
