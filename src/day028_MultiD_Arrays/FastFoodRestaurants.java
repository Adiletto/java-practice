package day028_MultiD_Arrays;

import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FastFoodRestaurants {

	public static void main(String[] args) throws IOException {

		// read all data and assign to array

		String[] data = Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]);

		System.out.println("Data size: " + data.length);

		// print first row
		System.out.println(data[0]);
		System.out.println(data[1]);
		System.out.println(data[data.length - 1]);

		// print each Restaurant information in separate line

		int counter = 0;
		for (String restaurant : data) {
			System.out.println("#" + counter + " => " + restaurant);
			counter++;
		}

		System.out.println();

		// Print all restaurant information in state of VA
		System.out.println("****** RESTAURANT IN VA AREA ******");

		int count = 0;
		for (int i = 1; i < data.length; i++) {
			if (data[i].contains(",VA,")) {
				count++;

			}

		}

		System.out.println("#### Total restaurants in VA " + count);

		System.out.println();

		// Find all restaurants information in state of VA
		// print the restaurant name along with city name
		// Subway - Herndon;

		System.out.println("***** RESTAURANTS IN VA ==> NAME AND LOCATED CITY ****");

		for (String res : data) {
			if (res.contains(",VA,")) {
				String[] resArr = res.split(",");
				System.out.println(resArr[2] + " - " + resArr[1]);
			}
		}
		
		System.out.println("********* RESTAURANTS IN MASS ********");
		int c =0;
		for (int z =0; z < data.length; z++) {
			if (data[z].contains(",MA,")) {
				c++;
			}
		}
		System.out.println("Restaurants located in MA: "+c);
		
		
		System.out.println("***** RESTAURANTS IN MASS ==> NAME AND LOCATED CITY ****");
		
		for ( String massRest : data) {
			if (massRest.contains(",MA,") && (massRest.contains("Waltham"))) {
				String[]massRestArr = massRest.split(",");
				System.out.println(massRestArr[2] + " - " + massRestArr[1]);
			}
		}

	}
}
