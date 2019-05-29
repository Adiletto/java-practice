package day17_StringPool_WhileLoop;

import java.util.*;

public class warmUp_Assignment074_SMS {

	public static void main(String[] args) {

		// public class Main {
		// public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String message = scan.nextLine();
		// String sender;
		// String phoneNumber;
		// String messageBody;
		// Sender:<Mike Smith>. From Number:[202-123-3456].
		// Message:{I love programming and problem solving}

		String sender = message.substring(message.indexOf("<") + 1, message.indexOf(">"));
		System.out.println("Sender: "+sender);

		String phoneNumber = message.substring(message.indexOf("[") + 1, message.indexOf("]"));

		System.out.println("Phone number: "+phoneNumber);

		String messageBody = message.substring(message.indexOf("{") + 1, message.indexOf("}"));

		System.out.println("Message: "+messageBody);
		
	}

}
