package day029_Methods01;

import java.util.Arrays;

public class Countries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String countries[][] = { { "USA", "Washington DC" }, { "Canada", "Ottawa" }, { "Mexico", "Mexico city" },
				{ "Brasil", "Brasilia" }, { "Peru", "Lima" }, { "Argentina", "Boanes Aeros" }, { "Bolivia", "La Paz" },
				{ "Macedonia", "Scopia" }, { "Kazakhstan", "Nursultan" }

		};

//		countries[0][0] = "Kyrgyzstan";
//		countries[0][1] = "Canada";
//		countries[0][2] = "Mexico";
//		countries[0][3] = "Brazil";
//		countries[0][4] = "Peru";
//		countries[0][5] = "Argentina";
//		countries[0][6] = "USA";
//		countries[0][7] = "Germany";
//		countries[0][8] = "Russia";
//
//		countries[1][0] = "Bishkek";
//		countries[1][1] = "Ottowa";
//		countries[1][2] = "Mexico City";
//		countries[1][3] = "Brazilia";
//		countries[1][4] = "Lima";
//		countries[1][5] = "Buenos Aeros";
//		countries[1][6] = "Washington DC";
//		countries[1][7] = "Berlin";
//		countries[1][8] = "Moscow";

		// print USA with capital

		System.out.println(countries[0][0] + " | " + countries[1][0]);
		// System.out.println(countries[0][6] + " | " + countries[1][6]);
		System.out.println(Arrays.deepToString(countries));

		// print all the countries in the same line separated by "|"

		for (int i = 0; i < countries.length; i++) {
			System.out.print(countries[i][0] + " | ");
		}

		System.out.println();

		for (String[] country : countries) {
			System.out.print(country[0] + " | ");
		}

		System.out.println();
		// get all Cities and add to cities [] array
		// declare cities array size needs to match countries array size

		// String[] cities= new String [9];
		String[] cities = new String[countries.length];
		// null means no object. it is not same as empty string
		System.out.println(Arrays.toString(cities));

		for (int i = 0; i < countries.length; i++) {
			cities[i] = countries[i][1];
		}

		System.out.println(Arrays.toString(cities));

		// look for Bolivia in the countries and test if
		// capital city is "La Paz"

		for (int row = 0; row < countries.length; row++) {

			if (countries[row][0].equals("Bolivia")) {
				// System.out.println(countriesArray[row][1]);
				if (countries[row][1].equals("La Paz")) {
					System.out.println("Bolivia test passed");
				} else {
					System.out.println("Bolivia test failed");
				}
				break; // exit the loop.
			}

		}

	}
}