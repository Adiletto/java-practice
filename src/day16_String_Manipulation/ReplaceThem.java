package day16_String_Manipulation;

public class ReplaceThem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence = "Coding is  fun, it is my hobby!!!";
		String withNoSpaces = sentence.replace(" ", ""); 
		System.out.println(withNoSpaces);
		
		System.out.println(sentence); //since "withNoSpaces" was not assignid as, it will will give the original valur
		sentence = sentence.replace(",", "!!!");
		System.out.println(sentence);
	
	
		String mixed = "lkjhlj876a-vajhgj";
		mixed = mixed.replace("876", "");
		System.out.println(mixed);
		mixed = mixed.replace("lkjh", "");
		System.out.println(mixed);
	
		mixed = mixed.replace("l", "");
		System.out.println(mixed);
		
		mixed = mixed.replace("jhgj", "");
		System.out.println(mixed);
		
		mixed = mixed.replace("-", "");
		System.out.println(mixed);
		
		System.out.println(); //for empty space
		
		mixed = mixed.replace("876", "").replace("lkjh", "").replace("l", "").replace("-", ""); //chaining version
		System.out.println(mixed);
		
		System.out.println(); //for empty space
		
		
		//using string methods (replace. substring) get number of results
		String result = "About 115,000,000 results (0.59 seconds)";
		
		result = result.replace("About ","").replace(" results ","").replace("(0.59 seconds)", "");
		
		//result = result.substring(0,result.indexOf(" "));
		
		System.out.println(result);
		
		
		
		/*
		 * String result = "About 115,000,000 results (0.11 seconds)";
		
		//using string methods(replace, substring) get number of results
		
		//115,000,000	
		result = result.replace("About ", "");//115,000,000 results (0.11 seconds)
		//result = result.replace(" results (0.66 seconds)", ""); might break whn number changes
		result = result.substring(0, result.indexOf(" "));
		System.out.println(result);
		
		 */
		
		
		result = result.replace(",","");
		//result = result.replaceFirst(",","");  //IF YOU WANT TO REMOVE FIRST (,).
		System.out.println(result);
		
		
		String str = "Moscow is a capital of Russia";
		str = str.replace("Moscow","Bishkek").replace("Russia","Kyrgyzstan");
		System.out.println(str);
		
		
		String email = "firstName_lastName@gmail.com";
		
		String company = "capitalOneBank";
		
		String newEmail = email.replace("gmail",company);
		System.out.println(newEmail);
		
		
}
}