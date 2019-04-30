package day015_String_Manipulations;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence = "Java String manipulation is fun!";
		//sentence.substring(0,4); ==> Java
		
		System.out.println(sentence.substring(0,4)); //print the word between index 0-4, which is "Java"
		
		//print "String"
		System.out.println(sentence.substring(5,11));
		
		//print "manipulation"
		System.out.println(sentence.substring(12,24));
		
		//print "is"
		System.out.println(sentence.substring(25,27));//print the word between index 25-27, which is "is"
		
		//print "ring"
		System.out.println(sentence.substring(7,11));
		
	
		
		
	}

}
