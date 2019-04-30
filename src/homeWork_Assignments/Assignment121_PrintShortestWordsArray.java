package homeWork_Assignments;

import java.util.*;

public class Assignment121_PrintShortestWordsArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		String [] shortWord = str.split(", ");
		String shor=shortWord[0];
		String soz= "";
		for (int i =0; i < shortWord.length; i++) {
			if (shor.length() > shortWord[i].length()) {
				shor = shortWord[i];
			}
		}
	for(int j= 0;j<shortWord.length;j++) {
		if(shor.length()==shortWord[j].length()) {
			soz+=shortWord[j]+",";
		}
	}
	String[] str1=soz.split(",");
	
	System.out.println(Arrays.toString(str1));
	
	}
}

//Write a program that will find out shortest words in the given string str. 
//If there are few words that are evenly short, 
//print them all. Use split method in order to split str string 
//variable and create an array of strings.  
//Print array with Arrays.toString() method. Sort array before printing. 
//	
//Split values by comma: split(", ");
//input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
//output: [cat, old, ray
