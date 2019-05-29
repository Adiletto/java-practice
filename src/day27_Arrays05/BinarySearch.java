package day27_Arrays05;
import java.util.*;
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("****** B I N A R Y    S E A R C H *******");
		
		int [] nums = {4, 6, 9, 14, 34};
		
		System.out.println(Arrays.binarySearch(nums, 9)); //==> 2
		System.out.println(Arrays.binarySearch(nums, 34)); //==>4
		System.out.println(Arrays.binarySearch(nums, 5)); //==> -1 
		
		int i = Arrays.binarySearch(nums, 14);
		System.out.println(i); //==>3
		
		int [] nums2 = {40, 6, 9, 14, 34};
		Arrays.sort(nums2);
		System.out.println(Arrays.binarySearch(nums2, 40 ));
		
		//Arrays.binarySearch(a, fromIndex, toIndex, key)
		//Arrays.sort(a, fromIndex, toIndex, c); comparator
		
		
	}

}
