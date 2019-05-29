package day36_WrapperClasses_ArrayListIntro;
import java.util.*;
public class ArrayList_Examples {

	public static void main(String[] args) {
		
		// create arraylist called languages

		ArrayList <String> languages = new ArrayList<>();
		
		//add values
		languages.add("Kyrgyz");
		languages.add("English");
		languages.add("Java");
		languages.add("Arabic");
		languages.add("Russian");
		
		System.out.println("Number of languages: "+languages.size());
		languages.add("Turkish");
		System.out.println("Number of languages: "+languages.size());
		
		
		//remove "English"
		languages.remove(1);
		System.out.println("Number of languages: "+languages.size());
		
		System.out.println(languages.toString());
		
		
	}

}
