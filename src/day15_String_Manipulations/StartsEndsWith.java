package day15_String_Manipulations;

public class StartsEndsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word1 = "eclipse";
		
		// starstWith ==> test if string starts with another
		System.out.println(word1.startsWith("e")); //true
		System.out.println(word1.startsWith("ec")); //true
		System.out.println(word1.startsWith("ecli")); //true
		
		System.out.println(word1.startsWith("Ec")); // false --> cause "E" is capital letter
		
		
		
		System.out.println(word1.endsWith("e")); //true
		System.out.println(word1.endsWith("ipse")); //true
		System.out.println(word1.endsWith("java")); //false
		
		//"PSE"                   //ECLIPSE        // PSE
		System.out.println(word1.toUpperCase().endsWith("PSE"));
		
		
		
		System.out.println();
		// Mr. ==> male
		//Mrs. ==> married female
		//Ms. ==> Single woman 
		//Dr. ==> Academic status
		
		String name = "Dr. Jackson";
		
		if (name.startsWith("Mr")) {
			System.out.println("Male");
		} else if (name.startsWith("Mrs")) {
			System.out.println("Married female");
		}else if (name.startsWith("Ms")) {
			System.out.println("Unmarried female");
		} else if (name.startsWith("Dr")) {
			System.out.println("Academical status");
		}else {
			System.out.println("Unknown status");
		}
		
		
		
		
	}

}
