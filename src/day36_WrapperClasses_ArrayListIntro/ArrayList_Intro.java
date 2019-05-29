package day36_WrapperClasses_ArrayListIntro;
import java.util.ArrayList;
public class ArrayList_Intro {

	public static void main(String[] args) {
		
		//Create an ArrayList

		String[] str = new String [5];
		ArrayList<String> names = new ArrayList <>();
		
		int[] numsArray = new int[5];
		ArrayList<Integer> nums = new ArrayList<>();
		
		//Assign values into arraylist
		names.add("Urmat");
		names.add("Bratan");
		names.add("Vlad");
		names.add("Murodil");
		names.add("Aigul Eje");
		names.add("Azamat");
		
		nums.add(100);
		nums.add(798);
		nums.add(12);
		nums.add(9977);
		nums.add(333);
		
		//read from arraylist
		
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names.get(2));
		
		System.out.println("Names count: "+ names.size());
		System.out.println("Nums count: "+nums.size());
	}

}
