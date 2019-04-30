package day021_Loop_Practice1;

public class Print_Unique_Chars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "javva";
		
		String unique = "";
		
		char ch = word.charAt(0);
		System.out.println(unique.contains(""+ch));
		System.out.println(unique.indexOf(ch));
		
		if (!unique.contains("" + ch)) {
			unique += ch; // unique = unique + ch;
			
		if (unique.indexOf(ch)== -1) {
				
			}
		}
		System.out.println("Unique: "+ unique);
		
		
		
		String word2 = "bananas";
		String unique2 = "";
		
		int i = 0;
		char ch2 = word2.charAt(i); //b
		System.out.println("Ch2:" + ch2);
		
		
		i = 1;
		ch2 = word2.charAt(i); //a
		System.out.println("Ch2:" + ch2);
		
		
		i++;
		ch2 = word2.charAt(i); //n
		System.out.println("Ch2:" + ch2);
		
		
		
		
		
	}

}
