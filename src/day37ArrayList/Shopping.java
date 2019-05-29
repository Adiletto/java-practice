package day37ArrayList;

import java.util.*;

public class Shopping {
	public static void main (String [] args) {
		
	
	
	ArrayList <String> shoppingList = new ArrayList<>();
	shoppingList.add("paper towel");
	shoppingList.add("dish soap");
	shoppingList.add("trash bag");
	shoppingList.add("clorox");
	shoppingList.add("gloves");
	shoppingList.add("shovel");
	
	//print number of items
	int count = shoppingList.size();
	System.out.println("Total count: "+count);
	
	//print all items in single line
	System.out.println(shoppingList.toString());
	
	//print first and last item in single line
	System.out.println(shoppingList.get(0)+" | "+shoppingList.get(count-1));
	
	
	shoppingList.remove(0); //==> removing with index --> int
	shoppingList.remove("clorox"); // ==> removing with string --> boolean
	System.out.println(shoppingList);
	System.out.println(shoppingList.get(0));
	
	
	for (String item : shoppingList) {
		System.out.println(item);
	}
	
	//remove all items at once
	
	shoppingList.clear();
	System.out.println(shoppingList);
	
	
	
	}
}