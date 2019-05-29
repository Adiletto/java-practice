package day37ArrayList;

import java.util.*;

public class MyCities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> cities = new ArrayList<>();
		cities.add("Talas");
		cities.add("Osh");
		cities.add("Tokmok");
		cities.add("Cholpon-Ata");
		cities.add("Kerben");
		cities.add("Tokmok");

		// print each city using for each loop separated by space
		for (String city : cities) {
			System.out.print(city + " ");
		}
		System.out.println();
		// print each city using for loop, separated by space

		for (int i = 0; i < cities.size(); i++) {
			System.out.print(cities.get(i) + " ");
		}
		System.out.println();
		System.out.println("Removing Tokmok");
		// remove Tokmok
		cities.remove("Tokmok");
		System.out.println(cities.toString());

		// isEmpty?
		System.out.println("Is list empty? --> " + cities.isEmpty());

		cities.add(0, "Bishkek");
		System.out.println(cities.toString());

		// add Istanbul as a second element
		cities.add(1, "Istanbul");
		System.out.println(cities.toString());

		cities.set(2, "Seoul");
		System.out.println(cities.toString());

		//find sterling in the list and give the index
		int idx = cities.indexOf("Cholpon-Ata");
		System.out.println("Cholpon-Ata's index: "+idx);
		cities.set(idx, "Karakol");
		
		System.out.println(cities.toString());

		cities.clear();
		boolean empty = cities.isEmpty();
		System.out.println("empty: "+empty);
	}

}
