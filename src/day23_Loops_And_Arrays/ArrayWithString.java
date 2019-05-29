package day23_Loops_And_Arrays;

public class ArrayWithString {

	public static void main(String[] args) {
		

		String [] names = new String [5];
		String [] names2 = {"Bill", "Urma", "Vlad", "Burak", "Jimmy"};
		
		System.out.println(names2[4]);
		System.out.println("Number of items: " + names2.length);
		String [] countries = { "" };
	//double[] values = 
	//ARRAY HAS FIXED SIZE
		 countries [0] = "USA";
		
		
		String [] fruits = new String [] {"apple", "orange"};
		//for each loop stands for collections of data
		//we need specify data type, variable name: our collection of data
		for (String fruit: fruits) {
			System.out.println(fruit);
		}
		
	}

}
