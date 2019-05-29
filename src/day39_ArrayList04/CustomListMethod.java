package day39_ArrayList04;

import java.util.*;

public class CustomListMethod {
public static void main(String[] args) {
	ArrayList < Integer> numsList = new ArrayList<>();
	numsList.add(10);
	numsList.add(10);
	numsList.add(7);
	numsList.add(8);
	numsList.add(8);
	numsList.add(3);
	numsList.add(4);
	numsList.add(8);
	
	printList(numsList);
	
	List <Double> doubleList = new ArrayList<>();
	doubleList.add(10.33);
	doubleList.add(10.22);
	doubleList.add(7.34);
	doubleList.add(8.99);
	doubleList.add(8.12);
	doubleList.add(3.55);
	doubleList.add(4.76);
	doubleList.add(8.80);
	
	System.out.println( sumList(doubleList) );
	double sum  = sumList(doubleList);
	System.out.println("Sum: " + sum);
	
	System.out.println(getList(10));
	ArrayList<Integer> list = getList(15);
	System.out.println(list.toString());
	
	//for(;;) {
	System.out.println(getRandomList(20));
	//}
	
	List<Integer> rList = getRandomList(10);
	Collections.sort(rList);
	System.out.println(rList);
	
	List <String> strNums = new ArrayList<>();
	strNums.add("123");
	strNums.add("33");
	strNums.add("128");
	strNums.add("3");

	List <Integer> converted = convertToIntList(strNums);
	System.out.println(converted);
}

public static void printList(ArrayList<Integer> nums) {
	for (Integer n : nums) {
		System.out.print(n + " ");
	}
	System.out.println();
}

		// 2) sumList
		//return type: double
		//params: List<Double>
		//Calculates sum of each double value and returns the result
		
	public static double sumList(List<Double> dList) {
		double sum = 0.0;
		for (double d : dList) {
			sum += d;
		}
		return sum;
	}

	// 3) getList
	//return type: ArrayList<Integer>
	// params : int size
	//getList(5); [1, 2, 3, 4, 5]
	
	public static ArrayList<Integer> getList(int size) {
		ArrayList < Integer> newList = new ArrayList<>();
		for (int w = 1; w <= size; w++) {
			newList.add(w);
			
		}
		return newList;
	}
 
	// 4) getRandomList
	// return type: List <Integer>
	//params
	//getList(5); 3, 55, 12, 99, 34
	
	public static List <Integer> getRandomList (int size) {
		Random r = new Random(); // object of random class
		List <Integer> randomNums = new ArrayList <>();
		
		for (int i =1; i <= size; i++) {
			randomNums.add(r.nextInt(101));
		}
		return randomNums;
	}
	
	// 5) convertToIntList
	//return type: List<Integer>
	//params: List<String>
	//it will take each string and convert to Integer and return as Integer list
	// List<String> strL = new Arraylist<>();
	// strL.add("56");
	// strL.add("99");
	//convertToIntList strL = new ArrayList<> ();
	
	
	public static List<Integer> convertToIntList (List <String> strList) {
		List <Integer> newList = new ArrayList<>();
		for (String str : strList) {
			newList.add(Integer.parseInt(str) );
		}
		return newList;
		
		
	}
}
