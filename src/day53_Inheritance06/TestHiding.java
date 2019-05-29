package day53_Inheritance06;

public class TestHiding {
public static void main (String[] args) {
	City city = new City(345, "London");
	Capital cap = new Capital(433, "Paris", 687686876L);
	
	System.out.println(city.count);
	System.out.println(cap.count);
	
	System.out.println(city.toString());
	System.out.println(cap.toString());
	
	cap.displayCount();
	
	//call static methods
	city.buildARoad();
	cap.buildARoad();
	
	City.buildARoad();
	Capital.buildARoad();
	
	//==============================
	
	City city2 = new City(33344, "Fairfax");
	Capital capital2 = new Capital(9879, "Richmond", 78178686L);
	
	city2.letBuildARoad();
	capital2.letBuildARoad();
	
	
	
}
	
}
