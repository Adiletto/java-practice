package day46_Static_Keyword;

public class Vehicle {

	String type; // instance variable, every object has its own type
	static int numberOfVehicles; //shared, one central value
	
	public static void vehicleInfo() {
		//System.out.println("type: " + type); => Won't compile, cause type is non-static
		System.out.println("numberOfVehicles: " + numberOfVehicles);	
		int count = getNumberOfVehicles();
		String make = "Kia";
		make = make.toUpperCase();
		System.out.println("make: " + make);
		//System.out.println(toString()); ==> cannot call non-static method
	}
	
	
	public static int getNumberOfVehicles() {
		return numberOfVehicles;
	}
	
	public String toString() {
		return "Vehicle type:" + type + " | count: " + numberOfVehicles;
	}
	
	
}
