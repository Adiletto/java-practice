 package day024_Arrays;

public class SplitSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		String sentence = "Java is a general-purpose computer-programming "
				+ "language that is concurrent, class-based, object-oriented, " + "and specifically designed to "
				+ "have as few implementation dependencies as possible.";

		String[] words = sentence.split(" "); // (uwul jerden bashtap bolup salat)
		for (String str : words) {
			if (str.equals("language")) {
				break;
			}
			counter++;
			 System.out.println(str);
		}
		// System.out.println(words[0]);
		//System.out.println("Position: " + counter);
		
		//System.out.println(words [counter]);
	}

}
