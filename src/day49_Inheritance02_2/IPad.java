package day49_Inheritance02_2;

import day49_Inheritance02.Device;
// IPad IS-A Device. IPad is a subclass is a different package
public class IPad extends Device {

	public void readEBook (String title) {
		System.out.println("Reading a book " + title + " using " + brand + " tablet");
		System.out.println("Model: " + model);
	//	System.out.println("Price: " + price); ==> not inherited, not visible
	}
}
