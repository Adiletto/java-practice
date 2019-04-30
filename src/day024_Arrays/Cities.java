package day024_Arrays;

public class Cities {

	public static void main(String[] args) {
		
		//
		
		String [] cities = {"Bishkek", "Tokmok", "Naryn", "Batken", 
				"Osh", "Talas", "Jalliwood", "Cholpon-Ata", "Karakol" };
		System.out.println(cities.length);
		
		//System.out.println(cities.length);
		//TASK print cities that starts with 'T'; 
		
		for (int i = 0; i < cities.length; i++) {
			if (cities[i].startsWith("T")) {
				System.out.println(cities[i]);
			}
		}
		
		//TASK print cities that starts with 'T'; ==> with FOR EACH LOOP
		
		for (String city: cities) {
			if (city.startsWith("T")) {
				System.out.println(city);
			}
		}
		
		
		
		
		
		
		
	}

}
