package day023_Agenda_Loop_Review;

public class PrintWord {

	public static void main(String[] args) {
		
		String str = "java";
		
		for (int i = 0; i <= str.length()-1; i++) {
			//condition
			if (str.substring(i, i+1).equals("a")) {
				//if condition is true, 
				//update statement
				continue;
			}
				
			System.out.print(str.substring(i, i+1));
		}
		
		
	}

}
