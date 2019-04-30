package homeWork_Assignments;

import java.util.*;

public class Assignment056_LaptopConfigurator {

	// public class Main {
	public static void main(String[] args) {
		double price = 0;
		String storageType, screenType, cpu;
		int ram = 0;
		Scanner scan = new Scanner(System.in);
		// WRITE YOUR CODE HERE
		System.out.println("Select screen size:");
		double screenSize = scan.nextDouble();

		System.out.println("Select CPU type:");
		cpu = scan.next();

		System.out.println("Select RAM size:");
		ram = scan.nextInt();

		System.out.println("Select storage type:");
		storageType = scan.next();

		System.out.println("Enter memory size:");
		double memorySize = scan.nextDouble();

		System.out.println("Enter screen resolution:");
		screenType = scan.next();

		if (screenSize == 13.3) {
			price = price + 200;
		} else if (screenSize == 15.0) {
			price = price + 300;
		} else if (screenSize == 17.3) {
			price = price + 400;
		}

		switch (cpu) {
		case "i3":
			price = price + 150;
			break;
		case "i5":
			price = price + 250;
			break;
		case "i7":
			price = price + 350;
			break;
		default:
		}

		ram = (ram / 4) * 50;
		price = price + ram;

		switch (storageType) {
		case "SSD":
			memorySize = (memorySize / 5);
			price = price + memorySize;
			break;
		case "HDD":
			memorySize = (memorySize / 5) * 0.5;
			price = price + memorySize;
			break;
		default:
		}

		
		switch (screenType) {
		case "4K":
			price = price + 200;
			break;
		case "FULLHD":
			price = price + 100;
			break;
		default:
		}

		System.out.println("Laptop price is: " + "$" + price);
	}

}
