package day27_Arrays05;

import java.util.Arrays;

public class Arrays_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 15, 6, 23, 90, 34, 1, 3};

		// toString method

		System.out.println(Arrays.toString(nums));
		String str = Arrays.toString(nums);
		System.out.println(str);

		System.out.println("******* S_O_R_T   M_E_T_H_O_D *******");
		// sort method. sorts array in ascending order
		
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		
		String [] languages = {"Zulu", "Spanish", "English", "Polish",  "Arabic", "Uzbek"};
		
		System.out.println(Arrays.toString(languages));
		
		Arrays.sort(languages);
		System.out.println(Arrays.toString(languages));
		
		int [] number = {1, 12, 46, 87, 221, 65, 999};
		// find lowest and largest values from number array
		
		System.out.println(Arrays.toString(number));
		Arrays.sort(number);
		int lowest = number[0];
		int largest = number[number.length-1];
		System.out.println("Lowest number here is: "+lowest);
		System.out.println("Largest number here is: "+largest);
		
	
	}

}
