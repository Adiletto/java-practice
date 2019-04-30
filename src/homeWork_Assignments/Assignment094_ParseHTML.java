package homeWork_Assignments;

import java.util.Scanner;

public class Assignment094_ParseHTML {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String html = "<!DOCTYPE html><html><head><title>Java</title></head><body><p id=\"myid\"></p></body></html>";
		// scan.nextLine();

		if (html.contains("id=")) {
			int a = html.indexOf("id=");
			int b = html.indexOf("\"", a + 5);
			System.out.println(html.substring(a + 4, b));
		} else {
			System.out.println("Invalid Input");
		}

	}
}
